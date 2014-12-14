/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.control.AbleHunterControl;
import byui.cit260.ableHunter.control.GameControl;
import byui.cit260.ableHunter.exceptions.JasonExceptions;
import byui.cit260.ableHunter.exceptions.MapControlException;
import byui.cit260.ableHunter.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
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
                case "P":
                    this.printReport();
                case "Q":
                    quit = true;
                    return;
                     
                                                   
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

   

    private void printReport() {
         //To change body of generated methods, choose Tools | Templates.
        PrintReportView print = null;
        print.displayReport();
    }

}
