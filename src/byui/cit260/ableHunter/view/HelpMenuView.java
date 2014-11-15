/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import ablehunter.java.displayInfo;

/**
 *
 * @author Jason
 */
public abstract class HelpMenuView extends View implements displayInfo{
public String helpMenuView;
    public HelpMenuView() {//Coded and Created by Jason
        super("\n"
                + "\n-------------------------------------------"
                + "\n| Help Menu"
                + "\n-------------------------------------------"
                + "\nP-How To Play"
                + "\nA-How To Create Armor"
                + "\nW-How To Create Weapons"
                + "\nM-How To View The Map"
                + "\nD-How To Defend"
                + "\nQ-Quit Game"
                + "\n_____________________________________________");
    }

    public String getHelpMenuView() {
        return helpMenuView;
    }

    public void setHelpMenuView(String helpMenuView) {
        this.helpMenuView = helpMenuView;
    }

    public void
         HelpMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   

    public void doInput(String value) {
         //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public Object display(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInputHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doActionHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
