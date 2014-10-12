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
public class Weapons implements Serializable{
    private String handsDefault;
    private String bowArrow;
    private String spear;
    private String swordWood;
    private String swordIron;
    private String swordDiamond;

    public Weapons() {
    }

    
    public String getHandsDefault() {
        return handsDefault;
    }

    public void setHandsDefault(String handsDefault) {
        this.handsDefault = handsDefault;
    }

    public String getBowArrow() {
        return bowArrow;
    }

    public void setBowArrow(String bowArrow) {
        this.bowArrow = bowArrow;
    }

    public String getSpear() {
        return spear;
    }

    public void setSpear(String spear) {
        this.spear = spear;
    }

    public String getSwordWood() {
        return swordWood;
    }

    public void setSwordWood(String swordWood) {
        this.swordWood = swordWood;
    }

    public String getSwordIron() {
        return swordIron;
    }

    public void setSwordIron(String swordIron) {
        this.swordIron = swordIron;
    }

    public String getSwordDiamond() {
        return swordDiamond;
    }

    public void setSwordDiamond(String swordDiamond) {
        this.swordDiamond = swordDiamond;
    }

    @Override
    public String toString() {
        return "Weapons{" + "handsDefault=" + handsDefault + ", bowArrow=" + bowArrow + ", spear=" + spear + ", swordWood=" + swordWood + ", swordIron=" + swordIron + ", swordDiamond=" + swordDiamond + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.handsDefault);
        hash = 29 * hash + Objects.hashCode(this.bowArrow);
        hash = 29 * hash + Objects.hashCode(this.spear);
        hash = 29 * hash + Objects.hashCode(this.swordWood);
        hash = 29 * hash + Objects.hashCode(this.swordIron);
        hash = 29 * hash + Objects.hashCode(this.swordDiamond);
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
        final Weapons other = (Weapons) obj;
        if (!Objects.equals(this.handsDefault, other.handsDefault)) {
            return false;
        }
        if (!Objects.equals(this.bowArrow, other.bowArrow)) {
            return false;
        }
        if (!Objects.equals(this.spear, other.spear)) {
            return false;
        }
        if (!Objects.equals(this.swordWood, other.swordWood)) {
            return false;
        }
        if (!Objects.equals(this.swordIron, other.swordIron)) {
            return false;
        }
        if (!Objects.equals(this.swordDiamond, other.swordDiamond)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
