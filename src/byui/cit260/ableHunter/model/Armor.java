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
public class Armor implements Serializable{
    private String clothesDefault;
    private String leatherArmor ;
    private String ironArmor;
    private String goldArmor;
    private String diamondArmor;
    private double width;
    private double height;
    private double length;
    private String material;
    private String strength;

    public Armor() {
    }

    
    public String getClothesDefault() {
        return clothesDefault;
    }

    public void setClothesDefault(String clothesDefault) {
        this.clothesDefault = clothesDefault;
    }

    public String getLeatherArmor() {
        return leatherArmor;
    }

    public void setLeatherArmor(String leatherArmor) {
        this.leatherArmor = leatherArmor;
    }

    public String getIronArmor() {
        return ironArmor;
    }

    public void setIronArmor(String ironArmor) {
        this.ironArmor = ironArmor;
    }

    public String getGoldArmor() {
        return goldArmor;
    }

    public void setGoldArmor(String goldArmor) {
        this.goldArmor = goldArmor;
    }

    public String getDiamondArmor() {
        return diamondArmor;
    }

    public void setDiamondArmor(String diamondArmor) {
        this.diamondArmor = diamondArmor;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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
        return "Armor{" + "clothesDefault=" + clothesDefault  + ", leatherArmor=" + leatherArmor + ", ironArmor=" + ironArmor + ", goldArmor=" + goldArmor + ", diamondArmor=" + diamondArmor + ", width=" + width + " inches " + ", height=" + height + " inches " + ", length=" + length + " inches " + ", material=" + material + ", strength=" + strength + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.clothesDefault);
        hash = 13 * hash + Objects.hashCode(this.leatherArmor);
        hash = 13 * hash + Objects.hashCode(this.ironArmor);
        hash = 13 * hash + Objects.hashCode(this.goldArmor);
        hash = 13 * hash + Objects.hashCode(this.diamondArmor);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.length) ^ (Double.doubleToLongBits(this.length) >>> 32));
        hash = 13 * hash + Objects.hashCode(this.material);
        hash = 13 * hash + Objects.hashCode(this.strength);
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
        final Armor other = (Armor) obj;
        if (!Objects.equals(this.clothesDefault, other.clothesDefault)) {
            return false;
        }
        if (!Objects.equals(this.leatherArmor, other.leatherArmor)) {
            return false;
        }
        if (!Objects.equals(this.ironArmor, other.ironArmor)) {
            return false;
        }
        if (!Objects.equals(this.goldArmor, other.goldArmor)) {
            return false;
        }
        if (!Objects.equals(this.diamondArmor, other.diamondArmor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        if (!Objects.equals(this.material, other.material)) {
            return false;
        }
        if (!Objects.equals(this.strength, other.strength)) {
            return false;
        }
        return true;
    }
    
    
    
}
