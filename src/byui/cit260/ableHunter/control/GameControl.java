/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

//<<<<<<< HEAD


//=======
import ablehunter.java.AbleHunter;
import byui.cit260.ableHunter.model.Game;
import byui.cit260.ableHunter.model.GameScenes;
import byui.cit260.ableHunter.model.Inventory;
import byui.cit260.ableHunter.model.Player;
import byui.cit260.ableHunter.model.Monster;
import byui.cit260.ableHunter.model.TheMap;
import static com.sun.org.apache.bcel.internal.Constants.CONSTANT_String;
//import com.sun.org.apache.bcel.internal.Constants;

/**
 *
 * @author adm-achina
 */
public class GameControl {

    /*public static void starNewGame(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
   /* public static Inventory[] getsortedInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

/**
 *
 * @author adm-achina
     * @param player
 */
//public class GameControl {

    public static void starNewGame(Player player) {//created 11 / 15 / 14
       //To change body of generated methods, choose Tools | Templates.
        Game game = new Game();
        AbleHunter.setCurrentGame(game);
        game.setCurrentPlayer(player);
        Inventory[] inventoryList = GameControl.createInventoryList();
        TheMap theMap = MapControl.createMap();
        game.setTheMap(theMap);
        MapControl.moveAvatarToStatingLocation(theMap);
        Monster monster = new Monster();
        
    }

    
     /*public static void assignScenesToLocations(TheMap map, GameScene[] scenes) {
         //To change body of generated methods, choose Tools | Templates.
         GameScene[][] locations = map.getLocations();
         locations[0][0].setTheScene(scenes[GameSceneType.Desert.ordinal()]);
         locations[0][6].setTheScene(scenes[GameSceneType.start.ordinal()]);
         locations[0][2].setTheScene(scenes[GameSceneType.Lodge.ordinal()]);
         locations[0][1].setTheScene(scenes[GameSceneType.Mountain.ordinal()]);
         locations[0][3].setTheScene(scenes[GameSceneType.Island.ordinal()]);
         locations[0][4].setTheScene(scenes[GameSceneType.Forest.ordinal()]);
         locations[0][5].setTheScene(scenes[GameSceneType.finish.ordinal()]);
    }*/

    public static Inventory[] getsortedInventoryList() {
         //To change body of generated methods, choose Tools | Templates.
       // System.out.println("Will display items in inventory");
        //return null;
        Inventory[] originalInventoryList = null;
                AbleHunter.getCurrentGame().getInventory();
        
        Inventory[] inventoryList = originalInventoryList.clone();
        
        Inventory tempInventoryItem;
        
            for(int i = 0; i < inventoryList.length - 1; i++){
                for(int j = 0; j < inventoryList.length - 1 - i; j++){
                    if(inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription())< 0){
                        tempInventoryItem = inventoryList[j];
                        inventoryList[j] = inventoryList[j + 1];
                        inventoryList[j + 1] = tempInventoryItem;
                    }
                }
            }
        
        return inventoryList;
    }

    public static void assignScenesToLocations(TheMap map, GameScenes[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   

    
public enum Item{
    Gold,
    Iron,
    Diamond,
    Wood,
    Leather,
    AnimalSkins,
    BowArrow,
    Spear,
    WoodSword,
    IronSword,
    GoldSword,
    DiamondSword;
}
    private static Inventory[] createInventoryList() {
        Inventory[] inventory;
        inventory = new Inventory[CONSTANT_String];
            Inventory Gold = new Inventory();
            Gold.setDescription("GOLD");
            Gold.setItemsCollected(0);
            Gold.setAmountNeeded(13);
            inventory[Item.Gold.ordinal()] = Gold;
            
            Inventory Wood = new Inventory();
            Wood.setDescription("WOOD");
            Wood.setItemsCollected(0);
            Wood.setAmountNeeded(5);
            inventory[Item.Wood.ordinal()] = Wood;
            
            Inventory Diamond = new Inventory();
            Diamond.setDescription("Diamond");
            Diamond.setItemsCollected(0);
            Diamond.setAmountNeeded(15);
            inventory[Item.Diamond.ordinal()] = Diamond;
            
            Inventory Iron = new Inventory();
            Iron.setDescription("Iron");
            Iron.setItemsCollected(0);
            Iron.setAmountNeeded(10);
            inventory[Item.Iron.ordinal()] = Iron;
            
            Inventory AnimalSkins = new Inventory();
            AnimalSkins.setDescription("Animal Skins");
            AnimalSkins.setItemsCollected(0);
            AnimalSkins.setAmountNeeded(3);
            inventory[Item.AnimalSkins.ordinal()] = AnimalSkins;
            
            Inventory BowArrow = new Inventory();
            BowArrow.setDescription("Bow and Arrow");
            BowArrow.setItemsCollected(0);
            BowArrow.setAmountNeeded(1);
            inventory[Item.BowArrow.ordinal()] = BowArrow;
            
            Inventory Spear = new Inventory();
            Spear.setDescription("Spear");
            Spear.setItemsCollected(0);
            Spear.setAmountNeeded(1);
            inventory[Item.Spear.ordinal()] = Spear;
            
            Inventory WoodSword = new Inventory();
            WoodSword.setDescription("Wooden Sword");
            WoodSword.setItemsCollected(0);
            WoodSword.setAmountNeeded(0);
            inventory[Item.WoodSword.ordinal()] = WoodSword;
            
            Inventory IronSword = new Inventory();
            IronSword.setDescription("Iron Sword");
            IronSword.setItemsCollected(0);
            IronSword.setAmountNeeded(0);
            inventory[Item.IronSword.ordinal()] = IronSword;
            
            Inventory DiamondSword = new Inventory();
            DiamondSword.setDescription("GOLD");
            DiamondSword.setItemsCollected(0);
            DiamondSword.setAmountNeeded(0);
            inventory[Item.DiamondSword.ordinal()] = DiamondSword;
            
            Inventory Leather = new Inventory();
            Leather.setDescription("GOLD");
            Leather.setItemsCollected(0);
            Leather.setAmountNeeded(3);
            inventory[Item.Leather.ordinal()] = Leather; 
            
            
            
            
            
            
            
            return inventory;
//>>>>>>> origin/master
    }
}
    
//}
