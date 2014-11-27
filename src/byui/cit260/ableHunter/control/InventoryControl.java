/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import ablehunter.java.AbleHunter;
import byui.cit260.ableHunter.model.Inventory;
import byui.cit260.ableHunter.view.ItemsInInventory;
import java.util.Date;

/**
 *
 * @author adm-achina
 */
public class InventoryControl {
    private long totalItemsInventory;
    private double item = 0.01;
    private double totalItem;
    
    public double getTotalItem(int howMany, int quantity) {
        
        /* Instructor: 
         * There is no unit test file for InventoryControl. You need to have 
         * a unit test for each control function you create. 
         */
        
        /* Instructor: 
         * You needed to included checks for invalid values for howManu 
         * and quantity. 
         */
        if (howMany == 1) {
            /* Instructor: 
             * You typed the same equation for three conditions. It would be 
             * simplier to put the equation after the selection statement and 
             *  only change the value of item for each condition.
             *
             * Also, the first condition and the third condition have the same
             * action. Combine these two conditions into one condition.
             */
            double totalItem = item * quantity;
        }
        else if (howMany == 2) {
            double item = 10.3f;
            
            totalItem = quantity * item;
            
        }
        
        else if (howMany == 3) {
            totalItem = quantity * item;
        }
    
        return totalItem;
}
 public double getItemTotal(double item, double itemTotal) {
      return itemTotal;
 }
 
 /*public static ItemsInInventory[] getsortedInventoryList() {
      ItemsInInventory[] originalInventoryList;
        originalInventoryList = AbleHunter.getCurrentGame().getInventoryItems();
        
        ItemsInInventory[] inventoryList = originalInventoryList.clone();
        
        Inventory tempInventory;
        
            for(int i = 0; i < inventoryList.length - 1; i++){
                for(int j = 0; j < inventoryList.length - 1 - i; j++){
                    if(inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription())< 0){
                        tempInventory = inventoryList[j];
                        inventoryList[j] = inventoryList[j + 1];
                        inventoryList[j + 1] = tempInventory;
                    }
                }
                
            }
            return inventoryList;
 }*/
 }
