/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

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
        if (howMany == 1) {
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
}