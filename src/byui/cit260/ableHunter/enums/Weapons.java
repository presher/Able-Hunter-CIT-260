/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.enums;

import java.io.Serializable;

/**
 *
 * @author Jason
 */
public enum Weapons implements Serializable {
    Hands("Hands"),
    Bow_Arrow("Bow"),
    Spear("Spear"),
    Wood_Sword("WoodSword"),
    Iron_Sword("IronSword"),
    Diamond_Sword("DiamondSword");
    
    private final String description;
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
     Weapons(String description) {
        this.description = description;
    }
    
    

    public String getDescription() {
        return description;
    }
    
    public void display(){
        System.out.println(this.getMessage());
    }
    
}
