/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.model.Mountain;
import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class SceneControl {
     protected final BufferedReader keyBoard = AbleHunterControl.getInFiles();
    /*public static String[][] scenes = {
          {"Mountain"}, 
          {"Lodge"},
          {"Desert"}, 
          {"Island"}, 
          {"Forest"}
          };*/
    
//Created and coded by Jason
  //private final SceneView scenes[];
   
   public static void scenes(String items[], int left, int right){
       String[] scenesList ={"Mountain", "Lodge", "Island", "Desert", "Forest"};
       sortArray(scenesList);
       // for(int k = 0; k < 5; k++)}
   }
   
       
        
       // SceneControl[] sceneList = (SceneControl[]) originalSceneList.clone();
        
       // Scene tempScene;
   
            
       
            
    
   //
   @SuppressWarnings("empty-statement")
   public static void sortArray(String items[]){
       int i, j;
       int left = 0;
       int right = 0;
       String x, y;
       String temp;
       String xx, yy;
        i = left;j = right;
          x = items[(left + right) / 2];
          
       do{
           while((items[i] == null ? x == null : items[i].equals(x)) && (i < right )); 
               i++;
          while(((items[j] == null ? x == null : items[j].equals(x)) && (j > left))) ;
              j--;
           
            if(i <= j){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
       }while(i <= j);
            if(left < j) scenes(items, left, j);
            if(i < right) scenes(items, i, right);
        for ( i = 0;  i < items.length - 1;  i++ )
            {
                for ( j = i + 1;  j < items.length;  j++ )
                { 
                         if ( items [ i ].compareToIgnoreCase( items [ j] ) > 0 )
                          {                                             // ascending sort
                                      temp = items [ j ];
                                      items [ j ] = items [ i ];    // swapping
                                      items [ i ] = temp;
                                     
                           }
                }
   
   
            }
   }

   

                public static void main(String args[]){
                    String scenes[] = {"Mountain", "Lodge", "Island", "Desert", "Forest"};
                    int i;
        System.out.println("Original array: ");
        for(i = 0; i < scenes.length; i++)
            System.out.println(scenes[i]);
       // System.out.println();
        
        SceneControl.sortArray(scenes);
        
        System.out.println("Sorted Array: ");
        for(i = 0; i < scenes.length; i++)
            System.out.println(scenes[i]);
   } 

    /*public void getScene() {
         //To change body of generated methods, choose Tools | Templates.
        
          String[][] scenes = {
          {"Mountain"}, 
          {"Lodge"},
          {"Desert"}, 
          {"Island"}, 
          {"Forest"}
          };
           System.out.println("\n"
                + "\n-------------------------------------------"
                + "\n| Scene Menu"
                + "\n-------------------------------------------"
                + "\nX-Mounain Scene"
                + "\nI-Island Scene"
                + "\nL-Lodge Scene"
                + "\nD-Desert Scene"
                + "\nF-Forest Scene"
                + "\nQ-Exit To Main Menu"
                + "\n_____________________________________________");
          boolean quit = true;
          boolean valid = false;
          String input;
           Scanner keyboard = new Scanner(System.in);
          do{
        
       
      
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
                                                        return;
                                                    default:
                                                        System.out.println("Invalid Selection Please Try Again");
                                               
           
        }
    } while(!quit);  
        }      */   

    private void MountainScene() {
         //To change body of generated methods, choose Tools | Templates.
        Mountain mountain = new Mountain();
    }

    private void IslandScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void LodgeScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void DesertScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ForestScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
      
   

