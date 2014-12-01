/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.control.PlayerControl;
import java.util.Scanner;

/**
 *
 * @author adm-achina
 */
public class MainMenuView {
        
        void displayMenu(){
            System.out.println("*** MainMenuView.displayMenu() function called ***");
        }
    
    private static final String[][] menuItems = {
        {"N", "Enter the names of the players"},
        {"1", "One player game"},
        {"2", "Two player game"},
        {"H", "Help"},
        {"X", "Exit "}
    }; 
  
    PlayerControl mainMenuControl = new PlayerControl();
    
    public MainMenuView() {

    }
 
    
    void getInput() {       

        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "N":
                    this.mainMenuControl.createPlayerList();
                    break;
                case "1":
                    this.mainMenuControl.startGame(1);
                    break;
                case "2":
                    this.mainMenuControl.startGame(2);
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();            
                    break;
                case "X":
                    break;
                default: 
                    new AbleHunterError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("X"));

    }
    

    
    
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : MainMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }   
    
}
