/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class HelpMenu{
     private final String Menu = "\n"
           + "\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
            + "\n able Hunter Help Menu"
           + "\nP How To Play The Game"
           + "\nW How To Create Weapon"
           + "\nA How To Create Armor"
           + "\nE End Game and Exit"
           + "\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
     
   public void displayHelpMenu() throws IOException {
         //To change body of generated methods, choose Tools | Templates.
        char selection;
        do {
            System.out.println("Able Hunter Main Menu");//Show Main Menu
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        }while (selection != 'E');
        System.out.println("***This calls the HelpMenu()***");
    }
    /*public String helpMenu;

    public HelpMenu() {
    }

    public String getHelpMenu() {
        return helpMenu;
    }

    public void setHelpMenu(String helpMenu) {
        this.helpMenu = helpMenu;
    }

    @Override
    public String toString() {
        return "HelpMenu{" + "helpMenu=" + helpMenu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.helpMenu);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HelpMenu other = (HelpMenu) obj;
        if (!Objects.equals(this.helpMenu, other.helpMenu)) {
            return false;
        }
        return true;
    }*/
             private String getInput() {//Coded By Jason
         //To change body of generated methods, choose Tools | Templates.
        
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);//get input from keyoard
            while (!valid){
                System.out.print("\n Please Enter A Choice to Continue"
                        + "\n able Hunter Help Menu"
                        + "\nP How To Play The Game"
                        + "\nW How To Create Weapon"
                        + "\nA How To Create Armor"
                        + "\nE To Exit Game");
                    input = keyboard.nextLine();
                    input = input.trim();
                    
                        /*if(.length() < 1){
                            System.out.println("Please Enter A Valid Name At Least One Letter \n");
                            continue;//will repeat until a valid name is input
                        }*/
                break;//Programs ends when a valid selection is input
                
            }
            return input;
    }

    
    
    private void doAction(char selection) throws IOException {
        //To change body of generated methods, choose Tools | Templates.
        HelpMenu helpMenu = new HelpMenu();
        char input;
            for(;;){
                do{
        input = (char) System.in.read();
        switch (input){
                           case 'P':
                               this.howToPlay();
                               break;
                                case 'W'://Get Existing Game
                                   this.makeWeapon();
                                    break;
                                    case 'A':
                                        this.makeArmor();
                                        break;
                                            case 'M':                                                        
                                               this.mapView();
                                                break;
                                                    case 'E':
                                                        return;
                                                    default:
                                                        System.out.println("Oops not a valid input try again");
                                                            break;
        }                                                    
                }while(input != 'E');
                }
    }

    private void howToPlay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void makeWeapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void makeArmor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mapView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    