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
public class LeatherArmor implements Serializable{
    private String material; //what material is the Armor
    private String strength; //weak, strong, stronger, strongest

    public LeatherArmor() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "LeatherArmor{" + "material=" + material + ", strength=" + strength + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.material);
        hash = 17 * hash + Objects.hashCode(this.strength);
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
        final LeatherArmor other = (LeatherArmor) obj;
        if (!Objects.equals(this.material, other.material)) {
            return false;
        }
        if (!Objects.equals(this.strength, other.strength)) {
            return false;
        }
        return true;
    }
    
    
    
}
