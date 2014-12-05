/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.model.DiamondArmor;
import byui.cit260.ableHunter.model.GoldArmor;
import byui.cit260.ableHunter.model.IronArmor;
import byui.cit260.ableHunter.model.LeatherArmor;
import java.io.PrintWriter;

/**
 *
 * @author Jason
 */

 
public class ArmorControl { //Algorithm for checking accuracy
    protected final PrintWriter console = AbleHunterControl.getOutFile();
    IronArmor ironArmor = new IronArmor();
    LeatherArmor leatherArmor = new LeatherArmor();
    GoldArmor goldArmor = new GoldArmor();
    DiamondArmor diamomdArmor = new DiamondArmor();
    public double calcCubicFeetOfArmor( double depth, double length, double width) {
        if (depth <= 0){ //Then
	return -1;
                }
        else{
            this.console.println("Depth Step 1");
        }
if (length <= 0 | length > 5){
    //Then
    return -1;
} else 
    this.console.println("Length Step 2");
{                }       
        
        if (depth <= 0){ //Then
	return -1;
        }
        else{
            this.console.println("Depth Step 3");
        }
if (length <= 0 | length > 5){ //Then
	return -1;
    }
else{
    this.console.println("Length Step 4");
}

width = 6;
double cubicFeet = (depth * length * width);

    return cubicFeet;
    }  
    
public double calcCubicFeetIronArmor(double depth, double length, double width){
    if (depth <= 0){ //Then
	return -1;
                }
        else{
            this.console.println("Depth Step 1");
        }
if (length <= 0 | length > 5){
    //Then
    return -1;
} else 
    this.console.println("Length Step 2");
{                }       
        
        if (depth <= 0){ //Then
	return -1;
        }
        else{
            this.console.println("Depth Step 3");
        }
if (length <= 0 | length > 5){ //Then
	return -1;
    }
else{
    this.console.println("Length Step 4");
}

width = 6;
double cubicFeet = (depth * length * width);

    return cubicFeet;

}
public double calcCubicFeetOfAnyArmor(double length, double width, double depth){
    double cubicFeet = (length * width * depth);
    return cubicFeet;
}
}
