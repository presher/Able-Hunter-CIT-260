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
    public void testCalcCubicInchesOfWeapon() {//Authored By Jason
        
        /**===============
         * Test #1 Valid
         * depth remains constant @2
         * +++++++++++++++
         */
        System.out.println("calcCubicInchesOfWeapon");
        System.out.println("\t Test #1");
         WeaponsControl instance = new WeaponsControl();
        double length = 60.0;
        double width = 4.0;
        double depth = 2.0;
       
        double expResult = 480.0;
        double result = instance.calcCubicInchesOfWeapon(length, width, depth);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         /**===============
         * Test #1 Invalid
         *  depth remains constant @2
         * +++++++++++++++
         */
        
        System.out.println("calcCubicInchesOfWeapon");
        System.out.println("\t Test #1 Invalid");
         
         length = -1.0;
         width = 4.0;
         depth = 2.0;
       
         expResult = -1.0;
         result = instance.calcCubicInchesOfWeapon(length, width, depth);
        assertEquals(expResult, result, 0.0);
        
         /**===============
         * Test #2 Invalid
         *  depth remains constant @2
         * +++++++++++++++
         */       
        
        System.out.println("calcCubicInchesOfWeapon");
        System.out.println("\t Test #2 Invalid");
         length = 60.0;
         width = -1.0;
         depth = 2.0;
       
         expResult = -1.0;
         result = instance.calcCubicInchesOfWeapon(length, width, depth);
        assertEquals(expResult, result, 0.0);
        
         /**===============
         * Test #3 Invalid
         *  depth remains constant @2
         * +++++++++++++++
         */
        
         System.out.println("calcCubicInchesOfWeapon");
        System.out.println("\t Test #3 Invalid");
         length = 60.0;
         width = 6.0;
         depth = 2.0;
       
         expResult = -1.0;
         result = instance.calcCubicInchesOfWeapon(length, width, depth);
        assertEquals(expResult, result, 0.0);
        
         /**===============
         * Test #4 Invalid
         *  depth remains constant @2
         * +++++++++++++++
         */
        
         System.out.println("calcCubicInchesOfWeapon");
        System.out.println("\t Test #4 Invalid");
         length = -60.0;
         width = 1.0;
         depth = 2.0;
       
         expResult = -1.0;
         result = instance.calcCubicInchesOfWeapon(length, width, depth);
        assertEquals(expResult, result, 0.0);
        
         /**===============
         * Test #5 Invalid
         *  depth remains constant @2
         * +++++++++++++++
         */
        
         System.out.println("calcCubicInchesOfWeapon");
        System.out.println("\t Test #5 Invalid");
         length = 5.0;
         width = 10.0;
         depth = 2.0;
       
         expResult = -1.0;
         result = instance.calcCubicInchesOfWeapon(length, width, depth);
        assertEquals(expResult, result, 0.0);
        
        /**===============
         * Test #6 Invalid
         *  depth remains constant @2
         * +++++++++++++++
         */
        
         System.out.println("calcCubicInchesOfWeapon");
        System.out.println("\t Test #6 Invalid");
         length = 5.0;
         width = -4.0;
         depth = 2.0;
       
         expResult = -1.0;
         result = instance.calcCubicInchesOfWeapon(length, width, depth);
        assertEquals(expResult, result, 0.0);
    }
    
}
