/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.control.AbleHunterControl;
import byui.cit260.ableHunter.control.SceneControl;
import byui.cit260.ableHunter.exceptions.JasonExceptions;
import byui.cit260.ableHunter.exceptions.MapControlException;
import byui.cit260.ableHunter.model.Desert;
import byui.cit260.ableHunter.model.Forest;
import byui.cit260.ableHunter.model.Island;
import byui.cit260.ableHunter.model.Lodge;
import byui.cit260.ableHunter.model.Mountain;
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
    
   
    private final String promptMessage;
    protected final BufferedReader keyBoard = AbleHunterControl.getInFile();
    protected final PrintWriter console = AbleHunterControl.getOutFile();
    //HelpMenuView helpMenu = new HelpMenuView();
     public View(String promptMessage){
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
    
    
    @Override
    public String getInput(){
       // Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        String input = null;
        while (!valid){
            System.out.println("\t\npEnter Your Selection Below");
            try {
                selection = this.keyBoard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            selection = selection.trim();
            
            if(selection.length() < 1){
                //System.out.println("***Invalid Selection***");
                try{
                    this.doAction(input);
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
                    System.out.println("Invalid Choice Please Try Again");
                    try{
                        this.doAction(input);
                    }catch(JasonExceptions me){
                        System.out.println(me.getMessage());
                    }
    }
         
     }while(!quit);
         }   
    private void getAbleHunterStart() throws MapControlException, IOException {
         //To change body of generated methods, choose Tools | Templates.
        //AbleHunterStartView ableHunterStart = new AbleHunterStartView();
       SceneControl scene = new SceneControl(){;
           
       };
        scene.getScene();
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
        Lodge lodge = new Lodge();
        lodge.displayLodgeScene();
    }

    private void IslandScene() {
         //To change body of generated methods, choose Tools | Templates.
        Island island = new Island();
        island.displayIslandScene();
    }

    private void ForestScene() {
         //To change body of generated methods, choose Tools | Templates.
        Forest forest = new Forest();
        forest.displayForestScene();
    }

    private void DesertScene() {
         //To change body of generated methods, choose Tools | Templates.
        Desert desert = new Desert();
        desert.displayDesertScene();
    }

}
