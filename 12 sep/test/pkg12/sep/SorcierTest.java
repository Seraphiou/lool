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
import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 *
 * @author Seraphin
 */
public class SorcierTest {
    Sorcier S1 = new Sorcier("salim",15);
    public SorcierTest() {
        
    }
    
    @Ignore
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Ignore
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Ignore
    @Before
    public void setUp() {
    }
    
    @Ignore
    @After
    public void tearDown() {
    }

    /**
     * Test of attaque method, of class Sorcier.
     */
    @Ignore
    @Test
    public void testAttaque() {
        System.out.println("attaque");
        Victime v =new Monstre("Bari",16);
        
        S1.attaque(v);//S1 attaque v
        
        
        
    }

    /**
     * Test of subitCharme method, of class Sorcier.
     */
    @Test
    public void testSubitCharme() {
        System.out.println("subitCharme");
        int coup = 5;
        
        int expResult = 0;
        int result = S1.subitCharme(coup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of subitFrappe method, of class Sorcier.
     */
    @Test
    public void testSubitFrappe() {
        System.out.println("subitFrappe");
        int coup = 5;
        
        int result = S1.subitFrappe(coup);
        int expResult = -(int)(S1.getPouvoir()*S1.getVie());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPouvoir method, of class Sorcier.
     */
    
    @Test
    public void testGetPouvoir() {
        System.out.println("getPouvoir");
        
        
        double result = S1.getPouvoir();
        assertTrue(result<1);
        assertTrue(result>0);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
