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
public class PersonnageTest {
    Personnage s1;
    
    public PersonnageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        s1=new Sorcier("salim",15);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNom method, of class Personnage.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        String expResult = "salim";
        String result = s1.getNom();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getVie method, of class Personnage.
     */
    @Test
    public void testGetVie() {
        System.out.println("getVie");
        int expResult = 15;
        int result = s1.getVie();
        assertEquals(expResult, result);
    }

    /**
     * Test of detruit method, of class Personnage.
     */
    @Test
    public void testDetruit() {
        System.out.println("detruit");
        boolean expResult = false;
        boolean result = s1.detruit();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Personnage.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "salim 15";
        String result = s1.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of addVie method, of class Personnage.
     */
    @Test
    public void testAddVie() {
        System.out.println("addVie");
        s1.addVie(-1);
        assertTrue(s1.getVie()==14);
        s1.addVie(-s1.getVie());
        assertTrue(s1.detruit());
        s1.addVie(1);//un mort n'a pas le droit de gagner ni de perdre de pdv
        assertTrue(s1.detruit());
        s1.addVie(-(int)(1.0/0.0));
        assertTrue(s1.detruit());
        
        
    }

    /**
     * Test of subitFrappe method, of class Personnage.
     */
    @Ignore
    @Test
    public void testSubitFrappe() {
        System.out.println("subitFrappe");
        int coup = 0;
        Personnage instance = null;
        int expResult = 0;
        int result = instance.subitFrappe(coup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of attaque method, of class Personnage.
     */
    @Ignore
    @Test
    public void testAttaque() {
        System.out.println("attaque");
        Victime v = null;
        Personnage instance = null;
        instance.attaque(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cataclisme method, of class Personnage.
     */
    @Ignore
    @Test
    public void testCataclisme() {
        System.out.println("cataclisme");
        Personnage instance = null;
        instance.cataclisme();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subitCharme method, of class Personnage.
     */
    @Ignore
    @Test
    public void testSubitCharme() {
        System.out.println("subitCharme");
        int coup = 0;
        Personnage instance = null;
        int expResult = 0;
        int result = instance.subitCharme(coup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PersonnageImpl extends Personnage {

        public PersonnageImpl() {
            super("", 0);
        }

        public int subitFrappe(int coup) {
            return 0;
        }

        public void attaque(Victime v) {
        }

        public int subitCharme(int coup) {
            return 0;
        }
    }
}
