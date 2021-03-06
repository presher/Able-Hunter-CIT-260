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
public class DiamondWeapon implements Serializable{
    private String material; //What is the weapon made of
    private int length; //How long is the weapon
    private String strength; //weak, strong, stronger, strongest
          
    public DiamondWeapon() {
    }
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String sttrength) {
        this.strength = sttrength;
    }

    @Override
    public String toString() {
        return "DiamondWeapon{" + "material=" + material + ", length=" + length + "ft" + ", strength=" + strength + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.material);
        hash = 67 * hash + this.length;
        hash = 67 * hash + Objects.hashCode(this.strength);
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
        final DiamondWeapon other = (DiamondWeapon) obj;
        if (!Objects.equals(this.material, other.material)) {
            return false;
        }
        if (this.length != other.length) {
            return false;
        }
        if (!Objects.equals(this.strength, other.strength)) {
            return false;
        }
        return true;
    }
    
    
    
}
