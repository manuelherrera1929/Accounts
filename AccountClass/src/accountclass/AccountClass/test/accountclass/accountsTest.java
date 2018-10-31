/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountclass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alejandrocruz
 */
public class accountsTest {
    
    public accountsTest() {
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
     * Test of getAccountID method, of class accounts.
     */
    @Test
    public void testGetAccountID() {
        System.out.println("getAccountID");
        Accounts instance = null;
        int expResult = 0;
        int result = instance.getAccountID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountID method, of class accounts.
     */
    @Test
    public void testSetAccountID() {
        System.out.println("setAccountID");
        int accountID = 0;
        Accounts instance = null;
        instance.setAccountID(accountID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountName method, of class accounts.
     */
    @Test
    public void testGetAccountName() {
        System.out.println("getAccountName");
        Accounts instance = null;
        String expResult = "";
        String result = instance.getAccountName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountName method, of class accounts.
     */
    @Test
    public void testSetAccountName() {
        System.out.println("setAccountName");
        String accountName = "";
        Accounts instance = null;
        instance.setAccountName(accountName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class accounts.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Accounts instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class accounts.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Accounts instance = null;
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class accounts.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Accounts instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class accountsImpl extends Accounts {

        public accountsImpl() {
            super(0, "", "");
        }
    }
    
}
