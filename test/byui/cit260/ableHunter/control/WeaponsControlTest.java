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
public class WeaponsControlTest {
    
    public WeaponsControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcCubicInchesOfWeapon method, of class WeaponsControl.
     */
    @Test
    public void testCalcCubicInchesOfWeapon() {
        System.out.println("calcCubicInchesOfWeapon");
        double length = 0.0;
        double width = 0.0;
        double depth = 0.0;
        WeaponsControl instance = new WeaponsControl();
        double expResult = 0.0;
        double result = instance.calcCubicInchesOfWeapon(length, width, depth);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
