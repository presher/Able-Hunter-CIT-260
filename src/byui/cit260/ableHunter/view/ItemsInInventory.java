/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import ablehunter.java.AbleHunter;
import byui.cit260.ableHunter.model.Inventory;

/**
 *
 * @author Jason
 */
public class ItemsInInventory {
    public static Inventory[] getsortedInventoryList() {
         //To change body of generated methods, choose Tools | Templates.
       // System.out.println("Will display items in inventory");
        //return null;
        ItemsInInventory[] originalInventoryList() = AbleHunter.getCurrentGame().getInventory();
        
        ItemsInInventory[] inventoryList = originalInventoryList.clone();
        
        Inventory tempInventoryItem;
        
            for(int i = 0; i < inventoryList.length - 1; i++){
                for(int j = 0; j < inventoryList.length - 1 - i; j++){
                    if(inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription())< 0){
                        tempInventoryItem = inventoryList[j];
                        inventoryList[j] = inventoryList[j + 1];
                        inventoryList[j + 1] = tempInventoryItem;
                    }
                }
            }
        
        return inventoryList;
    }
}
