/**
 * @author malinda
 * ITC-515 professional programming practice
 * hotel room implementation
 * checking availability of booking
 * creating booking instance
 * handle the check-in for room booking
 * removing the booking instance
 */
 
package hotel.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hotel.credit.CreditCard;
import hotel.utils.IOUtils;

public class Room {
	
	private enum State {READY, OCCUPIED}
	
	int id;
	RoomType roomType;
	List<Booking> bookings;
	State state;

	
	public Room(int id, RoomType roomType) {
		this.id = id;
		this.roomType = roomType;
		bookings = new ArrayList<>();
		state = State.READY;
	}
	

	public String toString() {
		return String.format("Room : %d, %s", id, roomType);
	}


	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return roomType.getDescription();
	}
	
	
	public RoomType getType() {
		return roomType;
	}
	
	public boolean isAvailable(Date arrivalDate, int stayLength) {
		IOUtils.trace("Room: isAvailable");
		for (Booking b : bookings) {
			if (b.doTimesConflict(arrivalDate, stayLength)) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean isReady() {
		return state == State.READY;
	}


	public Booking book(Guest guest, Date arrivalDate, int stayLength, int numberOfOccupants, CreditCard creditCard) {
		// checking availability of booking
		if (!isAvailable(arrivalDate, stayLength)) {
			throw new RuntimeException("Booking is not available at the movement !");
		}
		// creating booking instance by making booking state "PENDING"
		Booking booking = new Booking(guest, this, arrivalDate, stayLength, numberOfOccupants, creditCard);
		this.bookings.add(booking);
		return booking;		
	}


	public void checkin() {
		// handle the check-in for room booking
		if (!isReady()) {
			throw new RuntimeException("Room state is not in Ready state");
		}
		this.state = State.OCCUPIED;
	}


	public void checkout(Booking booking) {
		if (this.state != State.OCCUPIED)
			throw new RuntimeException("Room state is not in OCCUPIED state");
		// removing the booking instance from the list of bookings
		this.bookings.remove(booking);
		this.state = State.READY;
	}


}
