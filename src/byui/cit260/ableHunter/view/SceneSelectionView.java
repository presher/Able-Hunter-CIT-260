/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import ablehunter.java.displayInfo;
import byui.cit260.ableHunter.enums.GameScenes;
import byui.cit260.ableHunter.exceptions.JasonExceptions;
import byui.cit260.ableHunter.exceptions.MapControlException;
import byui.cit260.ableHunter.model.Desert;
import byui.cit260.ableHunter.model.Forest;
import byui.cit260.ableHunter.model.Island;
import byui.cit260.ableHunter.model.Lodge;
import byui.cit260.ableHunter.model.Mountain;
import byui.cit260.ableHunter.model.Player;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jason
 */
public abstract class SceneSelectionView extends View implements displayInfo{

    public SceneSelectionView(String promptMessage) {
        super(promptMessage);
    }
    
      @Override
    public void display(){
        String value;
        
        do{
            this.console.println(this.promptMessage);//Displays the selection menu
            value = this.getInput();
           
            
           
                this.doAction(value);
           
                
            
        }while(!value.equals("Q"));

   

    
    }
    
    private void doAction(String input){
     boolean quit = false;
          boolean valid = false;
          do{
          //String input;
           //Scanner keyboard = new Scanner(System.in);
          
        
       
      try{
           while(!valid){
       
               
                   input = this.keyBoard.readLine();
              
       input = input.trim().toUpperCase();
        if(input.length() < 1){
            this.console.println("Please enter a valid value.");
            continue;
        }
        break;
        
           }
           } catch (Exception e) {
                   this.console.println("Error Reading Input" + e.getMessage());
               }
                  
       
        switch (input){
                           case "X":
                               this.MountainScene();
                              
                               break;
                                case "I"://Get Existing Game
                                   this.IslandScene();
                                    break;
                                    case "L":
                                        this.LodgeScene();
                                        break;
                                            case "D":                                                        
                                               this.DesertScene();
                                                break;
                                            case "F":
                                                this.ForestScene();
                                                break;
                                                    case "E":
                                                        quit = true;
                                                        break;
                                                    default:
                                                        this.console.println("Invalid Selection Please Try Again");
                                               
           
        }
    } while(!quit);  
    }        

    private void MountainScene() {
         //To change body of generated methods, choose Tools | Templates.
        Mountain mountain = new Mountain();
         GameScenes.Mountain.display();
    }

    private void IslandScene() {
         //To change body of generated methods, choose Tools | Templates.
        Island island = new Island();
        GameScenes.Island.display();
    }

    private void LodgeScene() {
         //To change body of generated methods, choose Tools | Templates.
        Lodge lodge = new Lodge();
        GameScenes.Lodge.display();
    }

    private void DesertScene() {
         //To change body of generated methods, choose Tools | Templates.
        Desert desert = new Desert();
        GameScenes.Desert.display();
    }

    private void ForestScene() {
         //To change body of generated methods, choose Tools | Templates.
        Forest forest = new Forest();
        GameScenes.Forest.display();
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
       // Scanner keyboard = new Scanner(System.in);
        
        
        
       // String input = null;
            try{
        while (!valid){
            this.console.println(player.getName() + "\t\nEnter Your Selection Below");
            
            
                selection = this.keyBoard.readLine();
           
           
            selection = selection.trim();
            
            if(selection.length() < 1){
                //System.out.println("***Invalid Selection***");
               
                    this.doAction(selection);
               
              continue;
            }
       
            break;
        }
         } catch (IOException ex) {
                Logger.getLogger(HelpSelectionView.class.getName()).log(Level.SEVERE, null, ex);
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
