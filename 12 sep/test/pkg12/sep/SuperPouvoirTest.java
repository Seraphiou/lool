/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.sep;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Seraphin
 */
public class SuperPouvoirTest {
    
    public SuperPouvoirTest() {
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
     * Test of sort method, of class SuperPouvoir.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        SuperPouvoir instance = new SuperPouvoirImpl();
        double expResult = 0.0;
        double result = instance.sort();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SuperPouvoirImpl implements SuperPouvoir {

        public double sort() {
            return 0.0;
        }
    }
}
