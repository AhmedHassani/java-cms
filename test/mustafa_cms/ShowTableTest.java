/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mustafa_cms;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahmed
 */
public class ShowTableTest {
    
    public ShowTableTest() {
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
     * Test of userList method, of class ShowTable.
     */
    @Test
    public void testUserList() throws Exception {
        System.out.println("userList");
        ShowTable instance = new ShowTable();
        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.userList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToTable method, of class ShowTable.
     */
    @Test
    public void testAddToTable() throws Exception {
        System.out.println("addToTable");
        ShowTable instance = new ShowTable();
        instance.addToTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItem method, of class ShowTable.
     */
    @Test
    public void testAddItem() throws Exception {
        System.out.println("addItem");
        ShowTable instance = new ShowTable();
        instance.addItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
