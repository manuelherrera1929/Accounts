/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountclass;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author alejandrocruz
 */
public class accountsNGTest {
    
    public accountsNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
     * Test of toString method, of class accounts.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Accounts instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class accountsImpl extends Accounts {

        public accountsImpl() {
            super(0, "");
        }
    }
    
}
