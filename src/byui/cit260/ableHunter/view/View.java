/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import ablehunter.java.AbleHunter;
import byui.cit260.ableHunter.control.GameControl;
import byui.cit260.ableHunter.model.Game;
import java.awt.Menu;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jason
 */
public abstract class View implements ViewInterface{//Team Felix and Jason
   
    private String promptMessage;
    //HelpMenuView helpMenu = new HelpMenuView();
     public View(String promptMessage){
        this.promptMessage = promptMessage;}
         

     @Override
    public void display(){
        String value;
        
        do{
            System.out.println(this.promptMessage);
            value = this.getInput();
           
            
            try {
                this.doAction(value);
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            
        }while(!value.equals("Q"));

   

    
    }
    
    
    @Override
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        String input = null;
        while (!valid){
            System.out.println("\t\nEnter Your Selection Below");
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if(selection.length() < 1){
                System.out.println("***Invalid Selection***");
              continue;
            }
       
            break;
        }
        return selection;
        
}

   
     private void doAction(String value)throws IOException {
         boolean quit = false;
         do{
       Scanner keyboard = new Scanner(System.in);
       String input;
       input = keyboard.nextLine();
       input = input.trim();//.toUpperCase;
     

       switch (input) {
                case "N":
                    System.out.println("This is the Start Game Menu Item");
                    this.getAbleHunterStart();
                    break;
                case "G":
                    this.getSavedGame();
                case "H":
                    this.helpMenu();                   
                    break;
                case "S":
                    this.saveGame();
                case "Q":
                    quit = true;
                    return;
                     case "P":
                               this.HelpToPLAY();
                               break;
                                case "W"://Get Existing Game
                                   this.MakeWeapons();
                                    break;
                                    case "A":
                                        this.MakeArmor();
                                        break;
                                            case "M":                                                        
                                               this.UseMap();
                                                break;
                                            case "D":
                                                this.Defend();
                                                break;
                                                    case "E":
                                                        quit = true;
                                                        return;
                                                   
                default:
                    System.out.println("Invalid Choice Please Try Again");
    }
         
     }while (!quit);
         }   
    private void getAbleHunterStart() {
         //To change body of generated methods, choose Tools | Templates.
        GameControl.starNewGame(AbleHunter.getPlayer());
        
        
        AbleHunterMainMenu ableHunterMainMenu = new AbleHunterMainMenu();
        ableHunterMainMenu.display();
    }

    private void helpMenu(){ 
        HelpMenuView helpView = new HelpMenuView() {

            @Override
            public void displayHelp() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
       helpView.display();
    /*System.out.println("\n"
                + "\n-------------------------------------------"
                + "\n| Help Menu"
                + "\n-------------------------------------------"
                + "\nP-How To Play"
                + "\nA-How To Create Armor"
                + "\nW-How To Create Weapons"
                + "\nM-How To View The Map"
                + "\nD-How To Defend"
                + "\nE-Exit To Main Menu"
                + "\n_____________________________________________");
        System.out.println("This is for game help");
        boolean quit = false;
        do{
         Scanner keyboard = new Scanner(System.in);
       String input;
       input = keyboard.nextLine();
       input = input.trim();//.toUpperCase;
       
        switch (input){
                           case "P":
                               this.HelpToPLAY();
                               break;
                                case "W"://Get Existing Game
                                   this.MakeWeapons();
                                    break;
                                    case "A":
                                        this.MakeArmor();
                                        break;
                                            case "M":                                                        
                                               this.UseMap();
                                                break;
                                            case "D":
                                                this.Defend();
                                                break;
                                                    case "E":
                                                        quit = true;
                                                        return;
                                                    default:
                                                        System.out.println("Invalid Selection Please Try Again");
                                               
           
        }
    } while(!quit);  
        System.out.println("We Hope That Was Helpfull. Come Back If You Need More Help.");*/
        }         
                

    


    private void saveGame() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("This Will save Your Game");
    }

   /* private void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    private void HelpToPLAY() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("\nHow To Play AbleHunter.The game board for Able Hunter. It consist of a grid of " 
                + "\nlocations. Players place there marker on the different locations" 
                + "\non the board in an effort to win the game. The default board is"
                + "\n10 rows by 20 columns. Q to return to Help Menu");
     
    }

    private void MakeWeapons() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("How To Make Weapons. Q to return to Help Menu");
    }

    private void MakeArmor() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("How To Make Armor. Q to return to Help Menu");
    }

    private void UseMap() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("How To Use The Map. Q to return to Help Menu");
    }

    private void Defend() {
   //To change body of generated methods, choose Tools | Templates.
        System.out.println("How To Defend. Q to return to Help Menu");
    }

    private void getSavedGame() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("This Will Resume A Saved Game");
    }

}
