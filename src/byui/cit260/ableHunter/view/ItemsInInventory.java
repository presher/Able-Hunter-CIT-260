/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import ablehunter.java.AbleHunter;
import byui.cit260.ableHunter.control.GameControl;
import byui.cit260.ableHunter.model.Inventory;

/**
 *
 * @author Jason
 */
public class ItemsInInventory extends View {

    public ItemsInInventory(String promptMessage) {
        super(promptMessage);
    }
    
    
         //To change body of generated methods, choose Tools | Templates.
       // this.console.println("Will display items in inventory");
        //return null;
        private void ItemsInInventory(){
            
        }
       
        
        
    
    private String description;
   

     

    public String getDescription() {
        return description;
    }

    @Override
    public void displayHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInputHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doActionHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  

