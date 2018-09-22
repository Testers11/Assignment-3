/**
 * @author malinda
 * hotel room test cases 
 * ITC-515 professional programming practice
 */

package Test.hotel.entities;

import hotel.credit.CreditCard;
import hotel.entities.Booking;
import hotel.entities.Guest;
import hotel.entities.Room;
import hotel.entities.RoomType;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RoomTest {
    
    public RoomTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Room.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Room instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Room.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Room instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Room.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Room instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Room.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Room instance = null;
        RoomType expResult = null;
        RoomType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAvailable method, of class Room.
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        Date arrivalDate = null;
        int stayLength = 0;
        Room instance = null;
        boolean expResult = false;
        boolean result = instance.isAvailable(arrivalDate, stayLength);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isReady method, of class Room.
     */
    @Test
    public void testIsReady() {
        System.out.println("isReady");
        Room instance = null;
        boolean expResult = false;
        boolean result = instance.isReady();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of book method, of class Room.
     */
    @Test
    public void testBook() {
        System.out.println("book");
        Guest guest = null;
        Date arrivalDate = null;
        int stayLength = 0;
        int numberOfOccupants = 0;
        CreditCard creditCard = null;
        Room instance = null;
        Booking expResult = null;
        Booking result = instance.book(guest, arrivalDate, stayLength, numberOfOccupants, creditCard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkin method, of class Room.
     */
    @Test
    public void testCheckin() {
        System.out.println("checkin");
        Room instance = null;
        instance.checkin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkout method, of class Room.
     */
    @Test
    public void testCheckout() {
        System.out.println("checkout");
        Booking booking = null;
        Room instance = null;
        instance.checkout(booking);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
