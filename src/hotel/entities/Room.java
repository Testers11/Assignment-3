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

	
                
        public Room(int id,RoomType roomType, Booking bookings) {
		
		this.id = id;
		this.roomType = roomType;
		this.bookings = new ArrayList<>();
                this.state = State.READY;
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
		// Validating availability of the booking
		if (!isAvailable(arrivalDate, stayLength)) {
			throw new RuntimeException("There is no Booking available !");
		}
                else
                {
		
		Booking booking = new Booking(guest, this, arrivalDate, stayLength, numberOfOccupants, creditCard);
		this.bookings.add(booking);
		return booking;	
                }
	}


	public void checkin() {
		// Room Cheking Process
		if (!isReady()) {
			throw new RuntimeException("Room is not Ready");
		}
                else
                {
		this.state = State.OCCUPIED;
                }
	}


	public void checkout(Booking booking) {
		if (this.state != State.OCCUPIED)
                {
			throw new RuntimeException("Room is Occupied");
                }
		
                else
                {
		this.bookings.remove(booking);
		this.state = State.READY;
                }
	}


}
