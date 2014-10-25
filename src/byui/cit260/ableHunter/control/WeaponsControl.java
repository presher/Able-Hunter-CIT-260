/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class WeaponsControl {
public double calcCubicInchesOfWeapon(double length, double width, double depth){
//Begin
   Scanner enterLength = new Scanner (System.in);
           
if (length < 0){ //Then
	return -1;
                }
if (width < 0 | width > 4){ //Then
	return -1;
                }
//Main Task:
if (length < 0){ //Then
	return -1;
                }
if (width < 0 | width > 4){ //Then
	return -1;
                }
depth = 2;
double cubicIn = (depth * width * length);
    

	return cubicIn;
    }
//End

    
}
