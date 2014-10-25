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
        System.out.println("calcCubicFeetOfArmor Test");
        System.out.println("\tTest Case 1");
        ArmorControl instance = new ArmorControl();
        double depth = 6.0;
        double length = 3.0;       
        
        double width = 6.0;
        
        double expResult = 108.0;
        double result = instance.calcCubicFeetOfArmor(depth, length, width);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("calcCubicFeetOfArmor Test");
        System.out.println("\tTest Case 2");
        
         depth = 6.0;
         length = -1.0;
        
                
         width = 6.0;
        
         expResult = -1.0;
         result = instance.calcCubicFeetOfArmor(depth, length, width);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("calcCubicFeetOfArmor Test");
        System.out.println("\tTest Case 3");
        
         depth = 6.0;
         length = -1.0;
        
                
         width = 6.0;
        
         expResult = -1.0;
         result = instance.calcCubicFeetOfArmor(depth, length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcCubicFeetOfArmor Test");
        System.out.println("\tTest Case 4");
        
         depth = 0.0;
         length = 3.0;
        
                
         width = 6.0;
        
         expResult = -1.0;
         result = instance.calcCubicFeetOfArmor(depth, length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcCubicFeetOfArmor Test");
        System.out.println("\tTest Case 5");
        
         depth = -5.0;
         length = 3.0;       
                
         width = 6.0;
        
         expResult = -1.0;
         result = instance.calcCubicFeetOfArmor(depth, length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcCubicFeetOfArmor Test");
        System.out.println("\tTest Case 6");
        
         depth = -4.5;
         length = 3.0;
        
                
         width = 6.0;
        
         expResult = -1.0;
         result = instance.calcCubicFeetOfArmor(depth, length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcCubicFeetOfArmor Test");
        System.out.println("\tTest Case 2");
        
         depth = -6.3;
         length = 3.4;      
                
         width = 6.0;
        
         expResult = -1.0;
         result = instance.calcCubicFeetOfArmor(depth, length, width);
        assertEquals(expResult, result, 0.0);
   }
}
     