/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import ablehunter.java.AbleHunter;
import byui.cit260.ableHunter.exceptions.MapControlException;
import byui.cit260.ableHunter.model.Avatar;
import byui.cit260.ableHunter.model.TheMap;
import java.awt.Point;

/**
 *
 * @author Jason
 */
 public class MapControl {    

    public static void moveAvatarToStatingLocation(TheMap theMap) {
         //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void moveAvatarToStatingLocation(Avatar avatar, Point coordinates)
    throws MapControlException{
         //To change body of generated methods, choose Tools | Templates.
         TheMap map = AbleHunter.getCurrentGame().getTheMap();
         int newRow = coordinates.x-1;
         int newColumn = coordinates.y-1;
         
            if(newRow > 0 || newRow >= map.getNoOfRows() || newColumn < 0 || 
                    newColumn >= map.getNoOfColoums()){
                //return -1;
                throw new MapControlException("Can not move avatar to location" + 
                        coordinates.x + ", " + coordinates.y + " because that location is outside" +
                        " the bounds of the map.");
            }
                
    }
    public static MapControl createMap;

    static TheMap createMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
