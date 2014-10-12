/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ablehunter.java;

import byui.cit260.ableHunter.model.Avatar;
import byui.cit260.ableHunter.model.Game;
import byui.cit260.ableHunter.model.Player;
import byui.cit260.ableHunter.model.Resources;
import byui.cit260.ableHunter.model.Scene;
import byui.cit260.ableHunter.model.Weapons;

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
        
       Avatar startCharacter = new Avatar();
       
       startCharacter.setName("Fred Flintstone" + " The Hunter");
       System.out.println(startCharacter);
       
       Resources availableResources = new Resources();
       availableResources.setAnimalSkins("Leather");
       availableResources.setOil("Oil");
       availableResources.setOreGold("Gold");
       availableResources.setOreIron("Iron");
       availableResources.setWood("Wood");
       availableResources.setOreDiamond("Diamond");
       
       String resourcesInfo = availableResources.toString();
       System.out.println(availableResources);
       
       Weapons availableWeapons = new Weapons();
       availableWeapons.setHandsDefault("Level 0 Weapon");
       availableWeapons.setSwordWood("Level 3 Weapon");
       availableWeapons.setSwordIron("Level 4 Weapon");
       availableWeapons.setSwordDiamond("Level 6 Weapon");
       availableWeapons.setSpear("Level 2 Weapon");
       availableWeapons.setBowArrow("Level 1 Weapon");
       
       String weaponsInfo = availableWeapons.toString();
       System.out.println(availableWeapons);
       
       Scene availableScene = new Scene();
       availableScene.setLodgeDefault("Starting Scene");
       availableScene.setIsland("Next Scene");
       availableScene.setForest("Third Scene");
       availableScene.setDesert("Fourth Secen");
       availableScene.setMointain("Fifth Sene");
       availableScene.setLevels(6);
       
       String sceneInfo = availableScene.toString();
       System.out.println(availableScene);
       
       
       
       
       
       
       
    }
    
}
