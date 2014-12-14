/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.control.AbleHunterControl;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class MenuView {
     private String[][] menuItems;

    public MenuView() {
    }
    public MenuView(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }

    public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    
 public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validOption(String option) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(option)) {
                return true;
            }
        }
        return false;
    }

     protected final String getOption() {

        Scanner inFile = AbleHunterControl.getInputFile();
        String option;
        boolean valid = false;
        do {
            option = inFile.nextLine();
            option = option.trim().toUpperCase();
            valid = validOption(option);
            if (!validOption(option)) {
                new AbleHunterError("Invalid command. Please enter a valid command.").display();
            }
                
        } while (!valid);
        
        return option;
    }
}
