/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.view.View;

/**
 *
 * @author adm-achina
 */
public class WeaponsControl extends View {

    public WeaponsControl(String promptMessage) {
        super(promptMessage);
    }
    public double calcCubicInchesOfWeapon( double depth, double length, double width){
        if (depth <= 0){ //Then
            return -1;
                }
                else{
            this.console.println("Depth Step 1");
                    }
            if (length <= 0 | length > 5){ //Then
                return -1;
                    } 
                else {
            this.console.println("Length Step 2");
                    }       
        
                if (depth <= 0){ //Then
                return -1;
                    }
                else{
            this.console.println("Depth Step 3");
                    }
                if (length <= 0 | length > 5){ //Then
                return -1;
                    }
                else{
            this.console.println("Length Step 4");
                    }

        width = 2;
                    double cubicInches = (depth * length * width);

             return cubicInches;
        
        
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
