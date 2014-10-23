/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import ablehunter.java.AbleHunter;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jason
 */
public class HelpMenu implements Serializable{
    public String helpMenu;

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
    }
    
    
     public static void main(String[] args) 
         throws java.io.IOException{
         
        char choice, ignore;
         
        
         
         
       for (;;)  {
           
           do {
         System.out.println("Welcome To Able Hunter Help Menu");
         System.out.println("1 For How To Play");
         System.out.println("2 For How To Create A Weapon");
         System.out.println("3 For How To Create Armor");
         System.out.println("4 For How To View The Map");
         //System.out.println("5 To Exit Menu");
         System.out.print("Please Chose How To Proceede  (q to quit): ");
         
         choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            }// Do Loop 2
            while(ignore != '\n');
     }// Do loop One
           while( choice < '1' | choice > '4' & choice != 'q');
       
       if (choice == 'q') break;
       }//For Loop
     }//Static
     AbleHunter ableHunter = new AbleHunter();
}//public Class