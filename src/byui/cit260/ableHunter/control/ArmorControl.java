/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

/**
 *
 * @author Jason
 * //

 
public class ArmorControl { //Algorithm for checking accuracy
    public double calcCubicFeetOfArmor( double depth, double length, double width) {
        if (depth <= 0){ //Then
	return -1;
                }
        else{
            System.out.println("Depth Step 1");
        }
if (length <= 0 | length > 5){
    //Then
    return -1;
} else 
    System.out.println("Length Step 2");
{                }       
        
        if (depth <= 0){ //Then
	return -1;
        }
        else{
            System.out.println("Depth Step 3");
        }
if (length <= 0 | length > 5){ //Then
	return -1;
    }
else{
    System.out.println("Length Step 4");
}

width = 6;
double cubicFeet = (depth * length * width);

    return cubicFeet;

    }

}
