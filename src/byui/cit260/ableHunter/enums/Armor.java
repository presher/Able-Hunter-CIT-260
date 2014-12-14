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
public enum Armor implements Serializable{
    Clothes_Armor("Clothes"),
    Iron_Armor("Iron_Armor"),
    Gold_Armor("Gold_Armor"),
    Diamond_Armor("Diamond_Armor");
        
         private final String description;
         String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    Armor(String description) {
        this.description = description;
    }
    
    

    public String getDescription() {
        return description;
    }
    
     public void display(){
        System.out.println(this.message);
}

}
