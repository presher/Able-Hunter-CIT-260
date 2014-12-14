/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.exceptions.MapControlException;
import byui.cit260.ableHunter.model.Avatar;
import byui.cit260.ableHunter.model.Board;
import byui.cit260.ableHunter.model.Mountain;
import byui.cit260.ableHunter.model.Player;
import byui.cit260.ableHunter.model.TheMap;
import java.awt.Point;

/**
 *
 * @author Jason
 */
public class MountainControl {
    
   public static void moveAvatartoStartingLocation(TheMap map) throws MapControlException{
       Avatar[] avatars = Avatar.values();
        for(Avatar avatar : avatars){
            Point coordinates = avatar.getCoordinates();
             MapControl.moveAvatarToStatingLocation(avatar, coordinates);
                //if(returnValue < 0){
                   // return returnValue;
                
        }
        //return 0;
   }
    
 
}
