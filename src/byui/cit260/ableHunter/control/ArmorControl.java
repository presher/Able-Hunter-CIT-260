/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

/**
 *
 * @author Jason
 */
public class ArmorControl { //Algorithm for checking accuracy
    public double calcCubicFeetOfArmor(double height , double length){
        if (height < 0){ //Then
	return -1;
        }
if (length < 0 | length > 5){ //Then
	return -1;
    }
double width = 6;
double cubicFt = (height * width * length);

    return cubicFt;

    }
}
