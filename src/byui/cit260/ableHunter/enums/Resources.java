/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.enums;

/**
 *
 * @author Jason
 */
public enum Resources {
     Wood("Ore used to make wood weapons"),
    Iron("Ore used to make ironweapons and armor"),
    Gold("Ore used to make gold weapons"),
    Diamond("Ore used to make diamond ww]eapons and armor"),
    Skins("Animal Skins uesed to make leather armor");
   // String resources;
    
    
   
    private String description;
  

     Resources(String description) {
         this.description = description;
         
    }

    public String getDescription() {
        return description;
    }
    
}
