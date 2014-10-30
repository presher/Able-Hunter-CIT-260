/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;


import byui.cit260.ableHunter.control.ProgramControl;
import byui.cit260.ableHunter.model.Player;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class AbleHunterStartView {
    //private Object ProgramControl;
//Coded By Jason
   public void ableHunterStart(){
       //Display Welcome Screen.
            this.displayStart();
       //Get The Players Name
            String playersName = this.getPlayersName();
       //Create and Save the player
             Player player = ProgramControl.createPlayer(playersName);
       //Display Welcome Message
             this.welcomeMessage(player);
             
             //Display the Main menu.
          MainMenuView mainMenu = new MainMenuView (); //coded by Felix
            mainMenu.displayMenu ();
   }

    private void displayStart() {//Coded By Jason
         //To change body of generated methods, choose Tools | Templates.
    System.out.println("\n\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        System.out.println(
                      "\n++  This is a Game of skill and cunning                        ++"
                    + "\n++  You will have have 5 scenes to navigate through            ++"
                    + "\n++  Each scene will have 6 levels of increasing difficulty     ++"
                    + "\n++  You will need to find materials to make armor and weapons  ++"
                    + "\n++  There will be caluculations that will need to be done      ++"
                    + "\n++  In order to create the armor and weapons.                  ++");
            
            System.out.println("\n Good Luck And Have on this wacky adventure");
                        
    System.out.println("\n\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
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
    
    private String getPlayersName() {//Coded By Jason
         //To change body of generated methods, choose Tools | Templates.
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);//get input from keyoard
            while (!valid){
                System.out.print("Please Enter Your Name At Least 1 Letter");
                    playersName = keyboard.nextLine();
                    playersName = playersName.trim();
                    
                        if(playersName.length() < 1){
                            System.out.println("Please Enter A Valid Name At Least One Letter \n");
                            continue;//will repeat until a valid name is input
                        }
                break;//Programs ends when a valid name is input
                
            }
            System.out.println("Welcome " + playersName);
        return playersName;
            
    }

    private void welcomeMessage(Player player) {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n\n###############################################");

        
        System.out.println("\tWelcome To Able Hunter " + player.getName());
        System.out.println("\tWe Hope You Enjoy Your Stay ");
        System.out.println("###################################################");
    }
   
}
 