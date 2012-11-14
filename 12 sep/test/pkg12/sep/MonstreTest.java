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
public class MonstreTest {
    
    public MonstreTest() {
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
     * Test of attaque method, of class Monstre.
     */
    @Test
    public void testAttaque() {
        System.out.println("attaque");
        Victime v = null;
        Monstre instance = null;
        instance.attaque(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subitFrappe method, of class Monstre.
     */
    @Test
    public void testSubitFrappe() {
        System.out.println("subitFrappe");
        int coup = 0;
        Monstre instance = null;
        int expResult = 0;
        int result = instance.subitFrappe(coup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subitCharme method, of class Monstre.
     */
    @Test
    public void testSubitCharme() {
        System.out.println("subitCharme");
        int coup = 0;
        Monstre instance = null;
        int expResult = 0;
        int result = instance.subitCharme(coup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
