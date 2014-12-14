/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.view.View;

/**
 *
 * @author Jason
 */
public class Sort extends View {
  
   
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
       
       
      
       
       

     
 
   

