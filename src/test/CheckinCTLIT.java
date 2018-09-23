/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.checkin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NANI
 */
public class CheckinCTLIT {
    
    public CheckinCTLIT() {
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
     * Test of run method, of class CheckinCTL.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        CheckinCTL instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmationNumberEntered method, of class CheckinCTL.
     */
    @Test
    public void testConfirmationNumberEntered() {
        System.out.println("confirmationNumberEntered");
        long confirmationNumber = 0L;
        CheckinCTL instance = null;
        instance.confirmationNumberEntered(confirmationNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInConfirmed method, of class CheckinCTL.
     */
    @Test
    public void testCheckInConfirmed() {
        System.out.println("checkInConfirmed");
        boolean confirmed = false;
        CheckinCTL instance = null;
        instance.checkInConfirmed(confirmed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancel method, of class CheckinCTL.
     */
    @Test
    public void testCancel() {
        System.out.println("cancel");
        CheckinCTL instance = null;
        instance.cancel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completed method, of class CheckinCTL.
     */
    @Test
    public void testCompleted() {
        System.out.println("completed");
        CheckinCTL instance = null;
        instance.completed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
