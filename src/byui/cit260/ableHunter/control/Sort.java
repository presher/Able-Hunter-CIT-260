/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.view.View;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author Jason
 */
public class Sort extends View {
   /*int i = 0;
    //public void SortItems() {
        
    public static String[][] scenes = {//"start" + "finish" + "Desert" + "Island" + "Moutain" + "Lodge" + "Forest"};
   { "start"},
    {"finish"},
    {"Desert"},
    {"Island"},
    {" Mountain"},
    {"Lodge"},
    {"Forest"}
    };

    //public class Sort(){
      
       static void qsort(char items[]){
           scenes(items, 0, items.length - 1);
       }
       
       private static void scenes(char items[], int left, int right){
       int i, j;
       char x, y;
       
       i = left;j = right;
       x = items[(left + right) / 2];
       
       do{
           while((items[i] < x) && (i < right )) i++;
           while((x < items[j] && (j > left))) j--;
           
            if(i <= j){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
       }while(i <= j);
            if(left < j) scenes(items, left, j);
            if(i < right) scenes(items, i, right);
   }*/
   
   
   //public static void main(String args[]){
    public void TheMainScenes(){
       String[] scenes = {"Mountain", "Island", "Desert" , "Lodge", "Forest"};
       sortStringExchange(scenes);
        for ( int k = 0;  k < scenes.length;  k++ )
                this.console.println( scenes [ k ] );
   }
       public void sortStringExchange( String  x [ ] )
      {
            int i, j;
            String temp;

            for ( i = 0;  i < x.length - 1;  i++ )
            {
                for ( j = i + 1;  j < x.length;  j++ )
                { 
                         if ( x [ i ].compareToIgnoreCase( x [ j ] ) > 0 )
                          {                                             // ascending sort
                                      temp = x [ i ];
                                      x [ i ] = x [ j ];    // swapping
                                      x [ j ] = temp;
                                      
        
                           }
                          this.console.println("Sorted Array: ");
        for(j = 0; j < x.length; j++)
            this.console.println("\n\t" + x[j] );
        
                   }
             }
      } 

    public Sort(String promptMessage) {
        super(promptMessage);
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
       
       
      
       
       
/* public Sort{      
    for(index inrange(1,len(list))){
        do {sort = List[index];
        i = index -1;
        }while (i <= 0);
                if(list[i] >= sort){
                    list[i + 1] = list[i];
                    list[i] = sort;
                    i = i -1;                  
                }
                else{}
                    break;
                
    }
    }*/

     
 
   

