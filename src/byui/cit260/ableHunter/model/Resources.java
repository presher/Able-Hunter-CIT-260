/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.model;

import byui.cit260.ableHunter.view.View;
import java.io.Serializable;

/**
 *
 * @author Jason
 */
public class Resources extends View implements Serializable{// added 11 / 15 / 14
   
   /* Wood("Ore used to make wood weapons"),
    Iron("Ore used to make ironweapons and armor"),
    Gold("Ore used to make gold weapons"),
    Diamond("Ore used to make diamond ww]eapons and armor"),
    Skins("Animal Skins uesed to make leather armor");
   // String resources;*/
    
     public static String[][] resources = {
        {"a"},
        {"d"},
        {"f"},
        {"z"}
    };
   static void qsort(char items[]){
       resources(items, 0, items.length -1);
   }
   private static void resources(char items[], int left, int right){
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
            if(left < j) resources(items, left, j);
            if(i < right) resources(items, i, right);
   }
   
   
   //public static void main(String args[]){
   public void ResourcesArray(){
       char resources[] = {'z', 'g', 'p', 'x', 'a', 't', 'w', 'b'};
       int i;
       
        this.console.println("Original array: ");
        for(i = 0; i < resources.length; i++)
            this.console.println("\n\t" + resources[i]);
        this.console.println();
        
        Resources.qsort(resources);
        
        this.console.println("Sorted Array: ");
        for(i = 0; i < resources.length; i++)
            this.console.println("\n\t" + resources[i]);
   }
   
    private String description;
   /* private String wood;
    private String oreIron;
    private String oreGold;
    private String oreDiamond;
    private String oil;
    private String animalSkins;*/

    public Resources(String promptMessage) {
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

    
         



    public String getDescription() {
        return description;
    }

   
    
    
    
    
}
