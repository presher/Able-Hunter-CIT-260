/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jason
 */
public class ArmorControlTest {
    
    public ArmorControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcCubicFeetOfArmor method, of class ArmorControl.
     */
    @Test
    public void testCalcCubicFeetOfArmor() {
        System.out.println("calcCubicFeetOfArmor");
        double height = 6.0;
        double length = 3.0;
        ArmorControl instance = new ArmorControl();
        double expResult = 0.0;
        double result = instance.calcCubicFeetOfArmor(height, length);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
