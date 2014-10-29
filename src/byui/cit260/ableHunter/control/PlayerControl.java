/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import java.util.Scanner;

/**
 *
 * @author adm-achina
 */
public class PlayerControl {
    public static void main(String[] args) {
        
        /* Instructor: 
         * Please watch your indentation. When you do not indent consisitently 
         * it makes it very hard to read your code.
         */
        PlayerControl player = new PlayerControl();
    
    System.out.println("Please enter your name");
         Scanner enterName = new Scanner(System.in);
                String fullName;   
       System.out.print("Please Enter Your Name ");
              fullName = enterName.next();      
        System.out.println("Hello " + fullName);
            }
}
