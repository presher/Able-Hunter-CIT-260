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
public class Inventory implements Serializable{
    private String item;
    private int howMany;
    private String amountNeeded;
    private String itemsCollected;
    private String weaponsCollected;

    public Inventory() {
    }
    
        public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }

    public String getAmountNeeded() {
        return amountNeeded;
    }

    public void setAmountNeeded(String amountNeeded) {
        this.amountNeeded = amountNeeded;
    }

    public String getItemsCollected() {
        return itemsCollected;
    }

    public void setItemsCollected(String itemsCollected) {
        this.itemsCollected = itemsCollected;
    }

    public String getWeaponsCollected() {
        return weaponsCollected;
    }

    public void setWeaponsCollected(String weaponsCollected) {
        this.weaponsCollected = weaponsCollected;
    }

    @Override
    public String toString() {
        return "Inventory{" + "item=" + item + ", howMany=" + howMany + ", amountNeeded=" + amountNeeded + ", itemsCollected=" + itemsCollected + ", weaponsCollected=" + weaponsCollected + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.item);
        hash = 43 * hash + this.howMany;
        hash = 43 * hash + Objects.hashCode(this.amountNeeded);
        hash = 43 * hash + Objects.hashCode(this.itemsCollected);
        hash = 43 * hash + Objects.hashCode(this.weaponsCollected);
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (this.howMany != other.howMany) {
            return false;
        }
        if (!Objects.equals(this.amountNeeded, other.amountNeeded)) {
            return false;
        }
        if (!Objects.equals(this.itemsCollected, other.itemsCollected)) {
            return false;
        }
        if (!Objects.equals(this.weaponsCollected, other.weaponsCollected)) {
            return false;
        }
        return true;
    }
    
    
    
}
