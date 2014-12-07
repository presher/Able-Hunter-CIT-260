/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.control.AbleHunterControl;
import byui.cit260.ableHunter.exceptions.JasonExceptions;
import byui.cit260.ableHunter.exceptions.MapControlException;
import byui.cit260.ableHunter.model.Desert;
import byui.cit260.ableHunter.model.Forest;
import byui.cit260.ableHunter.model.Island;
import byui.cit260.ableHunter.model.Lodge;
import byui.cit260.ableHunter.model.Mountain;
import byui.cit260.ableHunter.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jason
 */
public abstract class HelpSelectionView implements ViewInterface{
     private final String promptMessage;
    protected final BufferedReader keyBoard = AbleHunterControl.getInFiles();
    protected final PrintWriter console = AbleHunterControl.getOutFile();
    //HelpMenuView helpMenu = new HelpMenuView();
     public HelpSelectionView(String promptMessage){
        this.promptMessage = promptMessage;}
     @Override
    public void display(){
        String value;
        
        do{
            System.out.println(this.promptMessage);//Displays the selection menu
            value = this.getInput();
           
            
            try {
                this.doAction(value);
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MapControlException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JasonExceptions ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            
        }while(!value.equals("Q"));

   

    
    }
     private void doAction(String value)throws IOException, MapControlException, JasonExceptions {
         boolean quit = false;
         do{
       Scanner keyboard = new Scanner(System.in);
       String input;
       input = keyboard.nextLine();
       input = input.trim().toUpperCase();
     

       switch (input) {
               
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
                    try{
                        this.doAction(input);
                    }catch(JasonExceptions me){
                        System.out.println(me.getMessage());
                    }
    }
         
     }while(!quit);
         }   
   

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

    @Override
    public void displayHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    // @Override
    public String getInput(){
        Player player = new Player();
        boolean valid = false;
        boolean quit = false;
        String selection = ",";
        do{
        Scanner keyboard = new Scanner(System.in);
        
        
        
       // String input = null;
        while (!valid){
            System.out.println(player.getName() + "\t\nEnter Your Selection Below");
            
                selection = keyboard.nextLine();
           
            selection = selection.trim();
            
            if(selection.length() < 1){
                //System.out.println("***Invalid Selection***");
                try{
                    this.doAction(selection);
                }catch(JasonExceptions me){
                    System.out.println(me.getMessage());
                } catch (IOException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                } catch (MapControlException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
              continue;
            }
       
            break;
        }
       // return selection;
        }while(!quit);
        
        return null;
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
