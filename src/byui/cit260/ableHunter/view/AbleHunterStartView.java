/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;


import ablehunter.java.displayInfo;
import byui.cit260.ableHunter.control.MapControl;
import byui.cit260.ableHunter.control.ProgramControl;
import byui.cit260.ableHunter.exceptions.MapControlException;
import byui.cit260.ableHunter.model.Avatar;
import byui.cit260.ableHunter.model.Player;
import java.awt.Point;
import java.io.IOException;

/**
 *
 * @author Jason
 */
public class AbleHunterStartView extends View implements displayInfo {//Coded by jason
     //protected final BufferedReader keyBoard = AbleHunterControl.getInFiles();

    public AbleHunterStartView(String promptMessage) {
        super(promptMessage);
    }

    

   
    
    //private Object ProgramControl;
//Coded By Jason
   public void ableHunterStart() throws IOException{//jason
       //Display Welcome Screen.
            this.displayStart();//jason
       //Get The Players Name
            String playersName = this.getPlayersName();//jason
       //Create and Save the player
             Player player = ProgramControl.createPlayer(playersName);//jason
       //Display Welcome Message
             this.welcomeMessage(player);//jason
       //Display The Main Menu
             AbleHunterMainMenu mainMenu = new AbleHunterMainMenu() {

                public void doInput(String value) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
                public int doAction(String choice) throws MapControlException {
                    Avatar avatar = null;
                    Point coordinates = null;
                     //To change body of generated methods, choose Tools | Templates.
                     try{
                    MapControl.moveAvatarToStatingLocation(avatar, coordinates);
                     }catch(MapControlException me){
                         this.console.println(me.getMessage());
                     }
                        //if(returnValue < 0){
                            //System.out.println("\nERROR" + avatar + " could not be moved to location" +
                                    //coordinates.x + coordinates.y);
                       // }
                        return 0;
                }

                @Override
                public void doAction() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public String getInputHelp() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void doActionHelp() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void displayHelp() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
             
         mainMenu.display();
         
           
            // this.welcomeMessage(player);
             
             //Display the Main menu.
          //MainMenuView mainMenu = new MainMenuView (); //coded by Felix
           // mainMenu.displayMenu ();
   }

    private void displayStart() {//Coded By Jason
         //To change body of generated methods, choose Tools | Templates.
    this.console.println("\n\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        this.console.println(
                      "\n++  This is a Game of skill and cunning                        ++"
                    + "\n++  You will have have 5 scenes to navigate through            ++"
                    + "\n++  Each scene will have 6 levels of increasing difficulty     ++"
                    + "\n++  You will need to find materials to make armor and weapons  ++"
                    + "\n++  There will be caluculations that will need to be done      ++"
                    + "\n++  In order to create the armor and weapons.                  ++");
            
            this.console.println("\n Good Luck And Have on this wacky adventure");
                        
    this.console.println("\n\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
/*getInput(): valueEntered
BEGIN
WHILE valid value has not been entered
DISPLAY a message prompting the user to enter a value
GET the value entered from keyboard
trim off front and trailing blanks
IF invalid value entered THEN
DISPLAY invalid value message
CONTINUE
ENDIF
BREAK
ENDWHILE
RETURN value entered
END
    template for getting user input
    */
    
    private String getPlayersName() throws IOException {//Coded By Jason
         //To change body of generated methods, choose Tools | Templates.
        boolean valid = false;
        String playersName = null;
       // Scanner keyboard = new Scanner(System.in);//get input from keyoard
       
                this.console.print("\nPlease Enter Your Name At Least 1 Letter"
                        + "\n");
                 try{
                     while (!valid){
                    playersName = this.keyBoard.readLine();
                    playersName = playersName.trim();
                    
                        if(playersName.length() < 1){
                            this.console.println("Please Enter A Valid Name At Least One Letter \n");
                            continue;//will repeat until a valid name is input
                        }
                break;//Programs ends when a valid name is input
                
            }
        }catch(Exception e){
            this.console.println("Error reading input" + e.getMessage());
        }
            //System.out.println("Welcome " + playersName);
        return playersName;
            
    }

    private void welcomeMessage(Player player) {
         //To change body of generated methods, choose Tools | Templates.
        this.console.println("\n\n###################################################");

        
        this.console.println("\tWelcome To Able Hunter " + player.getName());
        this.console.println("\tWe Hope You Enjoy Your Stay ");
        this.console.println("###################################################");
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

    @Override
    public Object display(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
 
