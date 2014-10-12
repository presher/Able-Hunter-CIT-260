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
public class Scene implements Serializable{
    private String lodgeDefault;
    private String island;
    private String forest;
    private String desert;
    private String mointain;
    private int levels;

    public Scene() {
    }
    
    
    public String getLodgeDefault() {
        return lodgeDefault;
    }

    public void setLodgeDefault(String lodgeDefault) {
        this.lodgeDefault = lodgeDefault;
    }

    public String getIsland() {
        return island;
    }

    public void setIsland(String island) {
        this.island = island;
    }

    public String getForest() {
        return forest;
    }

    public void setForest(String forest) {
        this.forest = forest;
    }

    public String getDesert() {
        return desert;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public String getMointain() {
        return mointain;
    }

    public void setMointain(String mointain) {
        this.mointain = mointain;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public String toString() {
        return "Scene{" + "lodgeDefault=" + lodgeDefault + ", island=" + island + ", forest=" + forest + ", desert=" + desert + ", mointain=" + mointain + ", levels=" + levels + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.lodgeDefault);
        hash = 59 * hash + Objects.hashCode(this.island);
        hash = 59 * hash + Objects.hashCode(this.forest);
        hash = 59 * hash + Objects.hashCode(this.desert);
        hash = 59 * hash + Objects.hashCode(this.mointain);
        hash = 59 * hash + this.levels;
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.lodgeDefault, other.lodgeDefault)) {
            return false;
        }
        if (!Objects.equals(this.island, other.island)) {
            return false;
        }
        if (!Objects.equals(this.forest, other.forest)) {
            return false;
        }
        if (!Objects.equals(this.desert, other.desert)) {
            return false;
        }
        if (!Objects.equals(this.mointain, other.mointain)) {
            return false;
        }
        if (this.levels != other.levels) {
            return false;
        }
        return true;
    }
    
    
    
    
}
