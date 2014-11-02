/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.control.ArmorControl;
import byui.cit260.ableHunter.model.Armor;
import byui.cit260.ableHunter.model.DiamondArmor;
import byui.cit260.ableHunter.model.GoldArmor;
import byui.cit260.ableHunter.model.IronArmor;
import byui.cit260.ableHunter.model.LeatherArmor;
import byui.cit260.ableHunter.model.Player;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jason
 */
public class CalculateArmor {
   
    private void welcomeMessage(Player player) {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n\n###############################################");
        System.out.println("\tWelcome To Able Hunter Armor Creation " + player.getName());
        System.out.println("\tPlease calculate the armor ");
        System.out.println("###################################################");
    }
    IronArmor ironArmor = new IronArmor();
    LeatherArmor leatherArmor = new LeatherArmor();
    GoldArmor goldArmor = new GoldArmor();
    DiamondArmor diamomdArmor = new DiamondArmor();
    ArmorControl armorControl = new ArmorControl();
   public String Armor[][] = {
        {"L, Leather Armor"},
        {"I, Iron Armor"},
        {"G, Gold Armor"},
        {"D, Diamond Armor"}
    };
   private void doAction(char selection) throws IOException {
       
               
                       char put = 0;
        
            for(;;){
                do{
                    try {
                        System.out.println("\n Please Choose Your Scene: " +
                                "\n\t L For Leather Armor "+
                                "\n\t I For Iron Armor "  +
                                "\n\t G For Gold Armor "  +
                                "\n\t D For Diamond Armor "  +
                                
                                "\n\t q to quit"        );
                        //while (go != null);
                        put = (char) System.in.read();
                        
                        //do {
                         //   ignore = (char) System.in.read();
                            // Do Loop 2
                        //}while(ignore != '\n');
                        //for(input = 0; input < 5; input++)
                        switch (put){
                            case 'L':
                                //(input == '1');
                                System.out.print("\n" + Arrays.toString(Armor[0]));
                                this.ArmorControl();
                                break;
                            case 'I':
                                //(input == '2');
                                System.out.print("\n" + Arrays.toString(Armor[1]));
                                this.ArmorControl();
                                break;
                            case 'G':
                                //(input == '3');
                                System.out.print("\n" + Arrays.toString(Armor[2]));
                                this.ArmorControl();
                                break;
                            case 'D':
                                //(input == '4');
                                System.out.println("\n" + Arrays.toString(Armor[3]));
                                this.ArmorControl();
                                break;
                            case 'q':
                                return;
                                     
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(CalculateArmor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                           
                        
                } while( put != 'q');  
                if (put != 'L' || put != 'I' || put != 'D' || put != 'G'); 
                    System.out.println("Please enter a valid choice");
                    return;
}
   }
    /*private void ArmorCreation(double width, double length, double depth) throws IOException{
   System.out.println("Please enter a length from 1-5 and a Armor type");
   System.out.println("Armor type is Leather, Iron, Gold, or Diamond");
        
   length = (char) System.in.read();
   if (length < 0 || length >5) System.out.println("Lenth must be betweeen 1 and 5");
                 
      else if (depth < 0 || depth > 3){
       System.out.println("Depth must be between 1-3");
   }
      else if ( length < 0 || length >6){
          System.out.println("Length must be between 1 and 6");
      }
   else{
      double armor = (length*width*depth);
   }
    } */

    private void ArmorControl() throws IOException {
        //To change body of generated methods, choose Tools | Templates.
        double length = System.in.read();
        double width = System.in.read();
        double depth = System.in.read();
        
        ArmorControl armorControl = new ArmorControl();
        armorControl.calcCubicFeetOfAnyArmor(length, width, depth);
    }
}
