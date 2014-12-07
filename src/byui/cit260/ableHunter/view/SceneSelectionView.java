/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.model.Desert;
import byui.cit260.ableHunter.model.Forest;
import byui.cit260.ableHunter.model.Island;
import byui.cit260.ableHunter.model.Lodge;
import byui.cit260.ableHunter.model.Mountain;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class SceneSelectionView {
    private void doAction(String input){
     boolean quit = false;
          boolean valid = false;
          do{
          //String input;
           Scanner keyboard = new Scanner(System.in);
          
        
       
      
           while(!valid){
       
       input = keyboard.nextLine();
       input = input.trim().toUpperCase();
        if(input.length() < 1){
            System.out.println("Please enter a valid value.");
        }
        
           }
       
       
        switch (input){
                           case "X":
                               this.MountainScene();
                               break;
                                case "I"://Get Existing Game
                                   this.IslandScene();
                                    break;
                                    case "L":
                                        this.LodgeScene();
                                        break;
                                            case "D":                                                        
                                               this.DesertScene();
                                                break;
                                            case "F":
                                                this.ForestScene();
                                                break;
                                                    case "E":
                                                        quit = true;
                                                        break;
                                                    default:
                                                        System.out.println("Invalid Selection Please Try Again");
                                               
           
        }
    } while(!quit);  
    }        

    private void MountainScene() {
         //To change body of generated methods, choose Tools | Templates.
        Mountain mountain = new Mountain();
    }

    private void IslandScene() {
         //To change body of generated methods, choose Tools | Templates.
        Island island = new Island();
    }

    private void LodgeScene() {
         //To change body of generated methods, choose Tools | Templates.
        Lodge lodge = new Lodge();
    }

    private void DesertScene() {
         //To change body of generated methods, choose Tools | Templates.
        Desert desert = new Desert();
    }

    private void ForestScene() {
         //To change body of generated methods, choose Tools | Templates.
        Forest forest = new Forest();
    }
}
