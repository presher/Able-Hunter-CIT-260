/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.exceptions.JasonExceptions;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author adm-achina
 */
public class PlayerControl implements Serializable{
    //private String fullName;
    public static void main(String[] args) throws JasonExceptions{
        
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

    public void createPlayerList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void startGame(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   // public void createPlayerList() {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    //public void startGame(int i) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

 //  public void displayHelpMenu() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    
