/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import ablehunter.java.displayInfo;
import byui.cit260.ableHunter.control.GameControl;
import byui.cit260.ableHunter.control.MapControl;
import byui.cit260.ableHunter.model.Inventory;
import byui.cit260.ableHunter.model.TheMap;

/**
 *
 * @author Jason
 */
public class PlayGameMenu implements displayInfo{
    public void doAction(char selection){
        switch(selection){
            case 'V':
                this.displayMap();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'A':
                this.viewAvatar();
                break;
            case 'M':
                this.viewMonster();
                break;
        }
    }

    private void displayMap() {
         //To change body of generated methods, choose Tools | Templates.
        MapControl theMap = MapControl.createMap;
        theMap.display();
    }

    private void viewInventory() {
        //To change body of generated methods, choose Tools | Templates.
        Inventory[] inventory = GameControl.getsortedInventoryList();
        
            System.out.println("\nList of Inventory Items");
            System.out.println("Dsecription" + "\t" + "Required" + "\t" + "Available");
            
                for(Inventory inventoryItem : inventory){
                    System.out.println(inventoryItem.getDescription() + "\t     " + inventoryItem.getAmountNeeded() + "\t     "
                    + inventoryItem.getItemsCollected());
                }
    }

    private void viewAvatar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewMonster() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object display(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
