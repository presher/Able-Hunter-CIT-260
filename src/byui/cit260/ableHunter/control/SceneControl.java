/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

/**
 *
 * @author Jason
 */
public class SceneControl {
    public static String[][] scenes = {
          {"Mountain"}, 
          {"Lodge"},
          {"Desert"}, 
          {"Island"}, 
          {"Forest"}
          };
    
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

    void getScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
   
}
