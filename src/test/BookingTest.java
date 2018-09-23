/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.entities;

import hotel.credit.CreditCard;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CHIGURU
 */
public class BookingTest {
    
    public BookingTest() {
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
     * Test of doTimesConflict method, of class Booking.
     */
    @Test
    public void testDoTimesConflict() {
        System.out.println("doTimesConflict");
        Date requestedArrival = null;
        int stayLength = 0;
        Booking instance = null;
        boolean expResult = false;
        boolean result = instance.doTimesConflict(requestedArrival, stayLength);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConfirmationNumber method, of class Booking.
     */
    @Test
    public void testGetConfirmationNumber() {
        System.out.println("getConfirmationNumber");
        Booking instance = null;
        long expResult = 0L;
        long result = instance.getConfirmationNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomId method, of class Booking.
     */
    @Test
    public void testGetRoomId() {
        System.out.println("getRoomId");
        Booking instance = null;
        int expResult = 0;
        int result = instance.getRoomId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoom method, of class Booking.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        Booking instance = null;
        Room expResult = null;
        Room result = instance.getRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArrivalDate method, of class Booking.
     */
    @Test
    public void testGetArrivalDate() {
        System.out.println("getArrivalDate");
        Booking instance = null;
        Date expResult = null;
        Date result = instance.getArrivalDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStayLength method, of class Booking.
     */
    @Test
    public void testGetStayLength() {
        System.out.println("getStayLength");
        Booking instance = null;
        int expResult = 0;
        int result = instance.getStayLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGuest method, of class Booking.
     */
    @Test
    public void testGetGuest() {
        System.out.println("getGuest");
        Booking instance = null;
        Guest expResult = null;
        Guest result = instance.getGuest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreditCard method, of class Booking.
     */
    @Test
    public void testGetCreditCard() {
        System.out.println("getCreditCard");
        Booking instance = null;
        CreditCard expResult = null;
        CreditCard result = instance.getCreditCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPending method, of class Booking.
     */
    @Test
    public void testIsPending() {
        System.out.println("isPending");
        Booking instance = null;
        boolean expResult = false;
        boolean result = instance.isPending();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCheckedIn method, of class Booking.
     */
    @Test
    public void testIsCheckedIn() {
        System.out.println("isCheckedIn");
        Booking instance = null;
        boolean expResult = false;
        boolean result = instance.isCheckedIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCheckedOut method, of class Booking.
     */
    @Test
    public void testIsCheckedOut() {
        System.out.println("isCheckedOut");
        Booking instance = null;
        boolean expResult = false;
        boolean result = instance.isCheckedOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharges method, of class Booking.
     */
    @Test
    public void testGetCharges() {
        System.out.println("getCharges");
        Booking instance = null;
        List<ServiceCharge> expResult = null;
        List<ServiceCharge> result = instance.getCharges();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkIn method, of class Booking.
     */
    @Test
    public void testCheckIn() {
        System.out.println("checkIn");
        Booking instance = null;
        instance.checkIn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addServiceCharge method, of class Booking.
     */
    @Test
    public void testAddServiceCharge() {
        System.out.println("addServiceCharge");
        ServiceType serviceType = null;
        double cost = 0.0;
        Booking instance = null;
        instance.addServiceCharge(serviceType, cost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkOut method, of class Booking.
     */
    @Test
    public void testCheckOut() {
        System.out.println("checkOut");
        Booking instance = null;
        instance.checkOut();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
