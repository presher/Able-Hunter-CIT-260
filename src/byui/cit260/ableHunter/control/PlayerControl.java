/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.exceptions.JasonExceptions;
import byui.cit260.ableHunter.view.View;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author adm-achina
 */
public class PlayerControl extends View implements Serializable{

    public PlayerControl(String promptMessage) {
        super(promptMessage);
    }

   
    //private String fullName;
    //public static void main(String[] args) 
          public void Players()  throws JasonExceptions{
        
        /* Instructor: 
         * Please watch your indentation. When you do not indent consisitently 
         * it makes it very hard to read your code.
         */
        
        PlayerControl player = null;
    
            this.console.println("Please enter your name");
    
         Scanner enterName = new Scanner(System.in);
                        String fullName;   
                this.console.print("Please Enter Your Name ");
                    
                   fullName = enterName.next();  
                    
                        
                    
        this.console.println("Hello " + fullName);
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

    @Override
    public void displayHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInputHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doActionHelp() {
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

    
