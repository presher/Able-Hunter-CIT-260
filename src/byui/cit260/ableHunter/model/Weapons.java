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
public enum Weapons implements Serializable{// added 11 / 15 / 14
    
    Hands("This the default weapon and the lowest hit damage"),
    Bow_Arrow("This is aquired after finding it and adding it to invenotry and has low hit damage"),
    Spear("This is available after finding it and adding it to the inventory and has low hit damage"),
    Wood_Sword("This must be made before it can be used. The lowest hit damage of all the swords"),
    Iron_Sword("Must be made of aquired added to the inventory before it can be used. Stronger hit damage than the Wood Sword."),
    Diamond_Sword("Must be made of aquired diamonds added the inventory before it can be used and it has the most hit damage of all the weapons");
    
    private final String description;
    private HandWeapon hand;
    private BowWeapon bow_Arrow;
    private SpearWeapon spear;
    private WoodenWeapon wood_Sword;
    private IronWeapon iron_Sword;
    private DiamondWeapon diamond_Sword;
            
   /* private String handsDefault;
    private String bowArrow;
    private String spear;
    private String swordWood;
    private String swordIron;
    private String swordDiamond;*/

     Weapons(String description) {
        this.description = description;
    }
    
    

    public String getDescription() {
        return description;
    }
    
    

}