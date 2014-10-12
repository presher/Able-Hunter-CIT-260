/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ablehunter.java;

import byui.cit260.ableHunter.model.Game;
import byui.cit260.ableHunter.model.Player;

/**
 *
 * @author Jason
 */
public class AbleHunter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
       Game startGame = new Game();
       
       startGame.setLevels(6);
       startGame.setTotalTime(12);
       
       String gameInfo = startGame.toString();
       System.out.println(gameInfo);
        
    }
    
}
