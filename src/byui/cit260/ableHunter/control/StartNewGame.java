/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.exceptions.MapControlException;
import byui.cit260.ableHunter.model.Avatar;
import byui.cit260.ableHunter.view.View;
import java.awt.Point;
import java.io.IOException;

/**
 *
 * @author Jason
 */
public class StartNewGame extends View{

    public StartNewGame(String promptMessage) {
        super(promptMessage);
    }
//Coded By Jason
    public void NewGame() throws IOException{
        SceneControl scene = null;
        scene.getScene();
    this.console.println("You have begun a new game");
}

    
    public int doAction(String choice) throws MapControlException {
                    Avatar avatar = null;
                    Point coordinates = null;
                     //To change body of generated methods, choose Tools | Templates.
                     try{
                    MapControl.moveAvatarToStatingLocation(avatar, coordinates);
                     }catch(MapControlException me){
                         this.console.println(me.getMessage());
                     }
                        //if(returnValue < 0){
                            //System.out.println("\nERROR" + avatar + " could not be moved to location" +
                                    //coordinates.x + coordinates.y);
                       // }
                        return 0;
                }

    public void getScene() {
         //To change body of generated methods, choose Tools | Templates.
        SceneControl scene = null;
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
