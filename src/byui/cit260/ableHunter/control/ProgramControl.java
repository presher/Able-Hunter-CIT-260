/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import ablehunter.java.AbleHunter;
import byui.cit260.ableHunter.model.Player;

/**
 *
 * @author Jason
 */
public class ProgramControl {

    
    public static Player createPlayer(String name) {
         //To change body of generated methods, choose Tools | Templates.
       // System.out.println("Create Player Function Called Later");
        Player player = new Player();
        player.setName(name);
        AbleHunter.setPlayer(player);
      return player ;
    }
    
}
