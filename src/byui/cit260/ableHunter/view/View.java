/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.control.AbleHunterControl;
import byui.cit260.ableHunter.control.GameControl;
import byui.cit260.ableHunter.control.SceneControl;
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
//import static sun.audio.AudioPlayer.player;

/**
 *
 * @author Jason
 */
public abstract class View implements ViewInterface{//Team Felix and Jason
    
   
    final String promptMessage;
    
    protected final BufferedReader keyBoard = AbleHunterControl.getInFiles();
    protected final PrintWriter console = AbleHunterControl.getOutFile();
    
    //HelpMenuView helpMenu = new HelpMenuView();
     public View(String promptMessage){
        this.promptMessage = promptMessage;}
         

     @Override
    public void display(){
        String value;
        
        do{
            this.console.println(this.promptMessage);//Displays the selection menu
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
    
    
    @Override
    public String getInput(){
        //Scanner keyboard = new Scanner(System.in);
        Player player = new Player();
        boolean valid = false;
        String selection = null;
        
       // String input = null;
        try{
        while (!valid){
            this.console.println(player.getName() + "\t\nEnter Your Selection Below");
            
                selection = this.keyBoard.readLine();
           
            selection = selection.trim();
            
            if(selection.length() < 1){
                //System.out.println("***Invalid Selection***");
                try{
                    this.doAction(selection);
                }catch(JasonExceptions me){
                    this.console.println(me.getMessage());
                } catch (IOException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                } catch (MapControlException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
              continue;
            }
       
            break;
        }
        
        }catch(Exception e){
                this.console.println("Error reading input" + e.getMessage());
                }
        
        return selection;
        
}

   
     private void doAction(String value)throws IOException, MapControlException, JasonExceptions {
         boolean quit = false;
         do{
       //Scanner keyboard = new Scanner(System.in);
       String input;
       input = this.keyBoard.readLine();
       input = input.trim();//.toUpperCase;
     

       switch (input) {
                case "N":
                    //System.out.println("This is the Start Game Menu Item");
                    this.getAbleHunterStart();
                    break;
                case "C":
                    this.seneView();
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
                     /*case "P":
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
                                                        return;*/
                                case"U":
                                                            this.MountainScene();
                                                            break;
                                case "L":
                                                            this.LodgeScene();
                                                            break;
                                case "I":
                                                            this.IslandScene();
                                                            break;
                                case "F":
                                                                this.ForestScene();
                                                                break;
                                case "R":
                                                            this.DesertScene();
                                                            break;
                                                   
                default:
                    this.console.println("Invalid Choice Please Try Again");
                    try{
                        this.doAction(input);
                    }catch(JasonExceptions me){
                        this.console.println(me.getMessage());
                    }
    }
         
     }while(!quit);
         }   
    private void getAbleHunterStart() throws MapControlException, IOException {
         //To change body of generated methods, choose Tools | Templates.
        //AbleHunterStartView ableHunterStart = new AbleHunterStartView();
        SceneView scene = new SceneView() {};
       scene.display(); //scene = new SceneView() {};
           
       
        //scene.getScene();
    }

    private void helpMenu(){ 
        HelpMenuView helpView = new HelpMenuView() {

            public void displayHelp() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

           
        };
       helpView.display();
    }

    


    private void saveGame() {
         //To change body of generated methods, choose Tools | Templates.
        this.console.println("\n\nEnter the file path for the file where to save the game");
            String filePath = this.getInput();
            
                try{
                    GameControl.saveGame(AbleHunterControl.getCurrentGame(), filePath);
                }catch(Exception ex){
                    ErrorView.display("MainMenuView", ex.getMessage());
                }
        
    }

   /* private void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    private void HelpToPLAY() {
         //To change body of generated methods, choose Tools | Templates.
        this.console.println("\nHow To Play AbleHunter.The game board for Able Hunter. It consist of a grid of " 
                + "\nlocations. Players place there marker on the different locations" 
                + "\non the board in an effort to win the game. The default board is"
                + "\n10 rows by 20 columns. Q to return to Help Menu");
     
    }

    private void MakeWeapons() {
         //To change body of generated methods, choose Tools | Templates.
        this.console.println("How To Make Weapons. Q to return to Help Menu");
    }

    private void MakeArmor() {
         //To change body of generated methods, choose Tools | Templates.
        this.console.println("How To Make Armor. Q to return to Help Menu");
    }

    private void UseMap() {
         //To change body of generated methods, choose Tools | Templates.
        this.console.println("How To Use The Map. Q to return to Help Menu");
    }

    private void Defend() {
   //To change body of generated methods, choose Tools | Templates.
        this.console.println("How To Defend. Q to return to Help Menu");
    }

    private void getSavedGame() {
         //To change body of generated methods, choose Tools | Templates.
        this.console.println("\n\nEnter the file path for the file where the is saved");
        String filepath = this.getInput();
        try{
            GameControl.getSavedGme(filepath);
        }catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        AbleHunterMainMenu gameMenu = new AbleHunterMainMenu() {};
        gameMenu.display();
    }

    private void seneView() {
         //To change body of generated methods, choose Tools | Templates.
        SceneView sceneView = new SceneView() {
        
         @Override
            public void displayHelp() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        sceneView.display();
    }

    private void MountainScene() {
         //To change body of generated methods, choose Tools | Templates.
        Mountain mountain = new Mountain();
        mountain.displayMountainScene();
    }

    private void LodgeScene() {
         //To change body of generated methods, choose Tools | Templates.
        Lodge lodge = null;
        lodge.displayLodgeScene();
    }

    private void IslandScene() {
         //To change body of generated methods, choose Tools | Templates.
        Island island = null;
        island.displayIslandScene();
    }

    private void ForestScene() {
         //To change body of generated methods, choose Tools | Templates.
        Forest forest = null;
        forest.displayForestScene();
    }

    private void DesertScene() {
         //To change body of generated methods, choose Tools | Templates.
        Desert desert = null;
        desert.displayDesertScene();
    }

}
