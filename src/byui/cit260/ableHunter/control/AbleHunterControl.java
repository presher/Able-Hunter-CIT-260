/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.model.Player;
import byui.cit260.ableHunter.view.AbleHunterError;
import byui.cit260.ableHunter.view.AbleHunterMainMenu;
import byui.cit260.ableHunter.view.HelpMenuView;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class AbleHunterControl {
    private static final Scanner inFile = new Scanner(System.in);
    private static final HelpMenuView helpMenu = new HelpMenuView();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //private static final GamePreferencesView GamePreferences = new GamePreferencesView();
    
    // Instance variables
    private static String[] nameList;
    
    private final static String welcome = 
              "\n\t***********************************************************************"
            + "\n\t* Welcome to the game of Able Hunter!                                 *"                            
            + "\n\t* You will be playing to survive. The object of the game              *"
            + "\n\t* is to seek out items and maerials for making weapons and armor      *"
            + "\n\t* There are several different armors and weapons easch with varying   *"
            + "\n\t* degrees of strength. There will be times to just explore and times  *"
            + "\n\t* to defend yourself again attacks. Have fun and fight to survive!    *" 
            + "\n\t*                                                                     *"
            + "\n\t* Good Luck!!!                                                        *"
            + "\n\t***********************************************************************"
            + "\n";

    public static Scanner getInputFile() {
         //To change body of generated methods, choose Tools | Templates.
         return AbleHunterControl.inFile;
    }
    
    private Player[] players = new Player[10];

    public AbleHunterControl() {
        
    }
        
        
   // public static HelpMenuView getHelpMenu() {
       // return AbleHunterControl.helpMenu;
    //}


    //public static GamePreferencesView getGamePreferencesView() {
     //   return GamePreferences;
    //}
    
    public static String[] getNameList() {
        return nameList;
    }

    public static void setNameList(String[] nameList) {
        AbleHunterControl.nameList = nameList;
    }


    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

        
    public static void main(String args[]) {
        AbleHunterControl AbleHunterControl = new AbleHunterControl();
        AbleHunterControl.display();
        AbleHunterControl.nameList = AbleHunterControl.getPlayerNames();
        AbleHunterMainMenu mainMenu = new AbleHunterMainMenu() {

            public void doInput(String value) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void doAction() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        mainMenu.display();
        AbleHunterControl.inFile.close();
    }
    
    public void display() {
        System.out.println(AbleHunterControl.welcome);
    }

    
    private String[] getPlayerNames() {
        
        String[] playerNames = new String[10];
        Scanner inFile = AbleHunterControl.getInputFile();
        
        System.out.println("\n\t---------------------------------------------------------------");
        System.out.println("\t Enter a list of names of those who will be playing Able Hunter. ");
        System.out.println("\t---------------------------------------------------------------");
        
        int playerIndex = 0;
        boolean done = false;
        while (playerIndex < 10  && !done) { 
            System.out.println("\tPlease enter the name of a player or enter \"Q\" to quit.");
            String name;
            name = inFile.nextLine();
            name = name.trim();

            if (name.length() < 1) {
                new AbleHunterError().display("\tA name must be at least one character long. Try again.");
                continue;
            }

            if (name.toUpperCase().equals("Q")) { // quit?
                done = true;
                break;
            } 
            
            // add name to list of player names
            playerNames[playerIndex] = name;
            playerIndex++;

        }
        
        String[] newNameList = new String[playerIndex];
    System.arraycopy(playerNames, 0, newNameList, 0, playerIndex);
        
        sortList(newNameList);
        
        return newNameList;
    }
    
    public String[] sortList(String[] names) {
        String tmpName;
        boolean notDone = true;
        while(notDone) {
            
            notDone = false; // assume that you done
            for (int i = 0; i < names.length-1; i++) {
                int compareResult = names[i].compareTo(names[i+1]);
                if (compareResult > 0) {
                    // swap names
                    tmpName = names[i];
                    names[i] = names[i+1];
                    names[i+1] = tmpName;
                    notDone = true;
                } 
            }
        }

        return names;
    }
     private void welcomeMessage(Player player) {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n\n###############################################");

        
        System.out.println("\tWelcome To Able Hunter " + player.getName());
        System.out.println("\tWe Hope You Enjoy Your Stay ");
        System.out.println("###################################################");
    }
}
