/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jason
 */
public enum Resources implements Serializable{// added 11 / 15 / 14
   
    Wood("Ore used to make wood weapons"),
    Iron("Ore used to make ironweapons and armor"),
    Gold("Ore used to make gold weapons"),
    Diamond("Ore used to make diamond ww]eapons and armor"),
    Skins("Animal Skins uesed to make leather armor");
   // String resources;
    
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
   
   
   public static void main(String args[]){
       char resources[] = {'z', 'g', 'p', 'x', 'a', 't', 'w', 'b'};
       int i;
       
        System.out.println("Original array: ");
        for(i = 0; i < resources.length; i++)
            System.out.println("\n\t" + resources[i]);
        System.out.println();
        
        Resources.qsort(resources);
        
        System.out.println("Sorted Array: ");
        for(i = 0; i < resources.length; i++)
            System.out.println("\n\t" + resources[i]);
   }
   
    private String description;
   /* private String wood;
    private String oreIron;
    private String oreGold;
    private String oreDiamond;
    private String oil;
    private String animalSkins;*/

     Resources(String description) {
         this.description = description;
         
    }/* public Resources() {
    }
    
    

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getOreIron() {
        return oreIron;
    }

    public void setOreIron(String oreIron) {
        this.oreIron = oreIron;
    }

    public String getOreGold() {
        return oreGold;
    }

    public void setOreGold(String oreGold) {
        this.oreGold = oreGold;
    }

    public String getOreDiamond() {
        return oreDiamond;
    }

    public void setOreDiamond(String oreDiamond) {
        this.oreDiamond = oreDiamond;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public String getAnimalSkins() {
        return animalSkins;
    }

    public void setAnimalSkins(String animalSkins) {
        this.animalSkins = animalSkins;
    }

    @Override
    public String toString() {
        return "Resources{" + "wood=" + wood + ", oreIron=" + oreIron + ", oreGold=" + oreGold + ", oreDiamond=" + oreDiamond + ", oil=" + oil + ", animalSkins=" + animalSkins + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.wood);
        hash = 71 * hash + Objects.hashCode(this.oreIron);
        hash = 71 * hash + Objects.hashCode(this.oreGold);
        hash = 71 * hash + Objects.hashCode(this.oreDiamond);
        hash = 71 * hash + Objects.hashCode(this.oil);
        hash = 71 * hash + Objects.hashCode(this.animalSkins);
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
        final Resources other = (Resources) obj;
        if (!Objects.equals(this.wood, other.wood)) {
            return false;
        }
        if (!Objects.equals(this.oreIron, other.oreIron)) {
            return false;
        }
        if (!Objects.equals(this.oreGold, other.oreGold)) {
            return false;
        }
        if (!Objects.equals(this.oreDiamond, other.oreDiamond)) {
            return false;
        }
        if (!Objects.equals(this.oil, other.oil)) {
            return false;
        }
        if (!Objects.equals(this.animalSkins, other.animalSkins)) {
            return false;
        }
        return true;
    }*/

    public String getDescription() {
        return description;
    }
    
    
    
    
}
