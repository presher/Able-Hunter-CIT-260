/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import ablehunter.java.AbleHunter;
import byui.cit260.ableHunter.control.GameControl;
import byui.cit260.ableHunter.control.HelpMenu;
import byui.cit260.ableHunter.control.StartNewGame;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public abstract class AbleHunterMainMenu extends View{//Created by and coded by Jason
    
    public AbleHunterMainMenu(){//Team Felix and Jason
       super("\n"
                + "\n-------------------------------------------"
                + "\n| Main Menu"
                + "\n-------------------------------------------"
                + "\nN-Start New Game"
                + "\nG-Get and Start Saved Game"
                + "\nH-Get Help How to Play"
                + "\nS-Save Game"
                + "\nQ-Quit Game"
                + "\n_____________________________________________");
    
    }
}
    /*void displayMenu() throws IOException {
         //To change body of generated methods, choose Tools | Templates.
        char selection = ' ';
        do {
            System.out.println("Able Hunter Main Menu");//Show Main Menu
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        }while (selection != 'E');
        System.out.println("***This calls the AbleHunterMainMenu()***");
    }
    private String getInput() {//Coded By Jason
         //To change body of generated methods, choose Tools | Templates.
        
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);//get input from keyoard
            while (!valid){
                System.out.print("\n Please Enter A Choice to Continue"
                        + "\nN To Start New Game"
                        + "\nG Continue Exisitng Game"
                        + "\nH For Help"
                        + "\nS To Save Your Game"
                        + "\nE To Exit Game"
                        + "\n");
                    input = keyboard.nextLine();
                    input = input.trim();
                    
                        /*if(.length() < 1){
                            System.out.println("Please Enter A Valid Name At Least One Letter \n");
                            continue;//will repeat until a valid name is input
                        }
                break;//Programs ends when a valid selection is input
                
            }
            return input;
    }

    private void doAction(char selection) throws IOException {
        //To change body of generated methods, choose Tools | Templates.
        HelpMenu helpMenu = new HelpMenu();
        char input = 0;
            for(;;){
                do{
        input = (char) System.in.read();
        switch (input){
                           case 'N':
                               this.startNewGame();
                               break;
                                case 'G'://Get Existing Game
                                   this.startExistingGame();
                                    break;
                                    case 'H':
                                        this.getHelpMenu();
                                        break;
                                            case 'S':                                                        
                                               this.saveGame();
                                                break;
                                                    case 'E':
                                                        return;
                                                    //default:
                                                     //   System.out.println("Oops not a valid input try again");
                                                          //  return;
        }                                                    
                }while(input != 'E');
                }
    }
    
 

    private void startExistingGame() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("This option will resume a previously saved game");
    }

    private void getHelpMenu() throws IOException {
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("This option will bring up the Help Menu");
        HelpMenu helpMenu = new HelpMenu();
        helpMenu.displayHelpMenu();

    }

    private void saveGame() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("This option will save the game");
    }

    private void startNewGame() throws IOException {
        //To change body of generated methods, choose Tools | Templates.
        StartNewGame startNewGame = new StartNewGame();
        startNewGame.NewGame();
        System.out.println("This will start the game");
    }*/

//}
