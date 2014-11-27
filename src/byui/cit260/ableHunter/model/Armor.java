/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.model;

import java.io.Serializable;

/**
 *
 * @author Jason
 */
public enum Armor implements Serializable{// added 11 / 15 / 14
    
    Clothes_Armor("The default apperal for the game"),
    Iron_Armor("Armmor aquired after making it from iron ore"),
    Gold_Armor("Armor aquired ater making it from gold ore"),
    Diamond_Armor("Armor aquired after maikng it from diamonds and it tis the stongest of all of the Armor");
            
    
    private final String description;

    Armor(String description) {
        this.description = description;
    }
    
    

    public String getDescription() {
        return description;
    }

    
}
