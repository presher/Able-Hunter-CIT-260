/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.model.Mountain;
import byui.cit260.ableHunter.view.View;
import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class SceneControl extends View{
    
   public static void scenes(String items[], int left, int right){
       String[] scenesList ={"Mountain", "Lodge", "Island", "Desert", "Forest"};
       sortArray(scenesList);
       // for(int k = 0; k < 5; k++)}
   }
   
       
        
      
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

    public SceneControl(String promptMessage) {
        super(promptMessage);
    }

   

               // public static void main(String args[]){
   public void MainSenes(){
                    String scenes[] = {"Mountain", "Lodge", "Island", "Desert", "Forest"};
                    int i;
        this.console.println("Original array: ");
        for(i = 0; i < scenes.length; i++)
            this.console.println(scenes[i]);
       // System.out.println();
        
        SceneControl.sortArray(scenes);
        
        this.console.println("Sorted Array: ");
        for(i = 0; i < scenes.length; i++)
            this.console.println(scenes[i]);
   } 

   

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
    }
      
   

