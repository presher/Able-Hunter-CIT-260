/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import ablehunter.java.displayInfo;
import byui.cit260.ableHunter.model.Desert;
import byui.cit260.ableHunter.model.Forest;
import byui.cit260.ableHunter.model.Island;
import byui.cit260.ableHunter.model.Lodge;
import byui.cit260.ableHunter.model.Mountain;
import java.io.IOException;

/**
 *
 * @author Jason
 */
public abstract class SceneView extends SceneSelectionView implements displayInfo{
    public String sceneView;
    public SceneView(){
    super("\n"
                + "\n-------------------------------------------"
                + "\n| Scene Menu"
                + "\n-------------------------------------------"
                + "\nU-Mountain"
                + "\nL-Lodge"
                + "\nR-Desert"
                + "\nI-Island"
                + "\nF-Forest"
                + "\nQ-Quit Game"
                + "\n_____________________________________________");
    }
    /*public SceneView(String promptMessage) {
        super("\n Please Choose Your Scene: " +
                    "\n\t M For Mountain Scene "+
                    "\n\t L For Lodge Scene "  +
                    "\n\t D For Desert Scene "  +
                    "\n\t I For Island Scene "  +
                    "\n\t F For Forest Scene " +
                    "\n\t q to quit"        );
    }*/

   
    // scenes[] = {'Mountain', 'Lodge', 'Desert', 'Island', 'Forest'};

    

    public String getScenViewe() {
        return sceneView;
    }

    public void setSceneView(String scene) {
        this.sceneView = scene;
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

    @Override
    public Object display(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void doInput(String value) {
         //To change body of generated methods, choose Tools | Templates.
        
    }
    public void
         SceneView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

