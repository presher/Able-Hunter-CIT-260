/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ablehunter.java;




import byui.cit260.ableHunter.model.Game;
import byui.cit260.ableHunter.model.Player;
import byui.cit260.ableHunter.view.AbleHunterStartView;
import java.io.IOException;
import java.util.Scanner;

//import java.util.Scanner;

/**
 *
 * @author Jason @ Felix
 */
public class AbleHunter implements displayInfo{

//<<<<<<< HEAD
        String promptMessage;
         private static Game Game = null;//coded by Jason
          private static Player currentPlayer = null;
//<<<<<<< HEAD
          
          
          public static Game getCurrentGame() {
        return Game;
          }
//=======//=======
    //private static Game game = null;
    //private static Player player = null; // This variable was not there so the error. by Felix

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) 
        throws java.io.IOException{
       // public void startView() throws IOException{
            AbleHunterStartView ableHunterStartView = new AbleHunterStartView() ;
            //super(promptMessage);
           try{
            ableHunterStartView.ableHunterStart();
           }catch(Throwable te){
               System.out.println(te.getMessage());
               ableHunterStartView.ableHunterStart();
           }
        }


    public static void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Player getPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*public static Scanner getInputFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
//=======

    public static void setCurrentGame(Game Game) {
        AbleHunter.Game = Game;
    }

    /*public static void setPlayer(Player currentPlayer) {
        AbleHunter.currentPlayer = currentPlayer;
    }*/

    @Override
    public Object display(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
          
          
        /*  public static Game getCurrentGame() {
        return Game;
          }*/
//=======//=======
    //private static Game game = null;
    //private static Player player = null; // This variable was not there so the error. by Felix

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
  /*  public static void main(String[] args) 
        throws java.io.IOException{
        
            AbleHunterStartView ableHunterStartView = new AbleHunterStartView();
            ableHunterStartView.ableHunterStart();

           // private static Game Game = null;//coded by Jason (This line of code need to be off. By Felix)
              //  private static Player currentPlayer = null;

    /*public void Game getCurrentGame() {//this grayed out selection causing errors
        return Game;
    }
//>>>>>>> origin/master
    
    
  public void setCurrentGame(Game currentGame) { //fix by Felix
        AbleHunter.Game = currentGame;
    }*/

    /*public static Player getPlayer() {
        return currentPlayer;
    }

    public static void setPlayer(Player player) {
        AbleHunter.currentPlayer = player;
    }*/
          
          

    /*public static void main(String[] args) throws IOException 
        //throws java.io.IOException
    {
        
            AbleHunterStartView ableHunterStartView = new AbleHunterStartView();
            ableHunterStartView.ableHunterStart();*/
            
            
           
               

    
            
            
            
            
            
            
  


    

/*    public static Player getPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    /*public static Scanner getInputFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

   
//>>>>>>> origin/master
}
        
      /*  char play;
        char name;
       char help;
       char helpGame;
            
        for(;;){
            do{
        
        System.out.println("************************************************\n"
                          +"* Welcome To Able Hunter                       *\n"
                          +"* Your Object will be create armor and weapons *\n"
                          +"* To find ore to create the armor and weapons  *\n"
                          +"* To defend against attacks                    *\n"
                          +"* All to be done over several scenes and levels*\n"
                          +"* c to continue:                               *\n" 
                          +"************************************************\n");
                play = (char)System.in.read();
            }while ( play != 'c');
                    if(play == 'c') break;
        }
        
                  
        
        Scanner enterName = new Scanner(System.in);
                String fullName;   
       System.out.print("Please Enter Your Name ");
              fullName = enterName.next();      
        System.out.println("Hello " + fullName);
        
         Scanner enterHeight = new Scanner(System.in);
                double height; 
         Scanner enterLength = new Scanner(System.in);       
                double length;  
         int width = 6;
       System.out.print("Please Enter The Height ");
        height = enterHeight.nextDouble();     
        
        System.out.print("Please Enter The Length ");
        length = enterLength.nextDouble();
        
        double cubicFt = length * width * height;
        
        System.out.println("The cubic feet of Armor is " + cubicFt);
       
       
    
     
        
        Scanner readyToPlay = new Scanner(System.in);
             
            System.out.print("Are you ready to play ");
            String letsPlay = readyToPlay.next();
            
            if (letsPlay.equals("yes")){
                System.out.println("Great Please Press Start ");
                
            }
            else{
                System.out.println("Please Press Start When You Are Ready ");
                return;
            }
         HelpMenu helpMenu = new HelpMenu();  
         CharacterControl characterControlInput = new CharacterControl();
         
        Player playerOne = new Player();
        
        playerOne.setName(fullName);
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
       Game startGame = new Game();
       
       startGame.setLevels(6);
       startGame.setTotalTime(12);
       
       String gameInfo = startGame.toString();
       System.out.println(gameInfo);
        
       Avatar startCharacter = new Avatar();
       
       startCharacter.setName(playerOne.getName() + " The Hunter");
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
       
       
       Inventory availableInventory = new Inventory();
       availableInventory.setItem("Items Available");
       availableInventory.setAmountNeeded("Amount Needed To Upgrade");
       availableInventory.setHowMany(7);
       availableInventory.setItemsCollected("Items Collected This Far");
       availableInventory.setWeaponsCollected("Weapons Collected THis Far");
       
       String inventoryInfo = availableInventory.toString();
       System.out.println(availableInventory);
       
       Armor availableArmor = new Armor();
       availableArmor.setClothesDefault("You Have No Armor");
       availableArmor.setLeatherArmor("You Have Obtained Leather Armor");
       availableArmor.setIronArmor("You Have Obtained Iron Armor");
       availableArmor.setGoldArmor("You Have Obtained Gold Armor");
       availableArmor.setDiamondArmor("You Have Obtained Diamond Armor");
       availableArmor.setHeight(36);
       availableArmor.setLength(36);
       availableArmor.setWidth(24);
       availableArmor.setMaterial("Your Armor is made up of: ");
       availableArmor.setStrength("The Strength of Your Armor is: ");
       
       String armorInfo = availableArmor.toString();
       System.out.println(availableArmor);
       
       Island islandScene = new Island();
       islandScene.setIslandName("Lone Island");
       islandScene.setTimeOfDay("The time of day is Night");
       islandScene.setWeather("The weather is hot and raining");
       islandScene.setDifficulty("The difficulty of the island is medium");
       
       String islandInfo = islandScene.toString();
       System.out.println(islandScene);
       
       
       Lodge lodgeScene = new Lodge();
       lodgeScene.setLodgeName(playerOne.getName() + " Hunters Lodge");
       lodgeScene.setWeather("Cold"); //hot cold rain snow
       lodgeScene.setTimeOfDay("Night");
       lodgeScene.setDifficulty("easy");
       
       String lodgeInfo = lodgeScene.toString();
       System.out.println(lodgeScene);
       
       Mountain mountainScene = new Mountain();
       mountainScene.setMountainName("The Lone Mountain");
       mountainScene.setWeather("Cold And Snow");
       mountainScene.setTimeOfDay("day");
       mountainScene.setDifficulty("Hard");
       
       String mountainInfo = mountainScene.toString();
       System.out.println(mountainScene);
       
       Desert desertScene = new Desert();
       desertScene.setDesertName("The Sweaty Desert");
       desertScene.setWeather("Hot");
       desertScene.setTimeOfDay("Day");
       desertScene.setDifficulty("hard");
       
       String desertInfo = desertScene.toString();
       System.out.println(desertScene);
       
       Forest forestScene = new Forest();
       forestScene.setForestName("Missery Forest");
       forestScene.setWeather("Cold and Rain");
       forestScene.setTimeOfDay("Night");
       forestScene.setDifficulty("Medium");
       
       String forestInfo = forestScene.toString();
       System.out.println(forestScene);
       
       DiamondArmor diamondArmor = new DiamondArmor();
       diamondArmor.setStrength("Strongest");
       diamondArmor.setMaterial("Diamomd Material");
       
       String diamondAromorInfo = diamondArmor.toString();
       System.out.println(diamondArmor);
       
       ClothesArmor clothesArmor = new ClothesArmor();
       clothesArmor.setMaterial("Cotton");
       clothesArmor.setStrength("Weak");
       
       String clothesArmorInfo = clothesArmor.toString();
       System.out.println(clothesArmor);
       
       LeatherArmor leatherArmor = new LeatherArmor();
       leatherArmor.setMaterial("Animal Skin");
       leatherArmor.setStrength("Weak");
       
       String leatherArmorInfo = leatherArmor.toString();
       System.out.println(leatherArmor);
       
       IronArmor ironArmor = new IronArmor();
       ironArmor.setMaterial("Iron");
       ironArmor.setStrength("Strong");
       
       String ironArmorInfo = ironArmor.toString();
       System.out.println(ironArmor);
       
       GoldArmor goldArmor = new GoldArmor();
       goldArmor.setMaterial("Gold");
       goldArmor.setStrength("Stronger");
       
       String goldArmorInfo = goldArmor.toString();
       System.out.println(goldArmor);
       
       HandWeapon handWeapon = new HandWeapon();
       handWeapon.setMaterial("Skin");
       handWeapon.setStrength("Weak");
       
       String handWeaponInfo = handWeapon.toString();
       System.out.println(handWeapon);
       
       BowWeapon bowWeapon = new BowWeapon();
       bowWeapon.setMaterial("Wood");
       bowWeapon.setSize(4);
       bowWeapon.setType("Bow and Arrow");
       bowWeapon.setStrength("Weak");
       
       String bowWeaponInfo = bowWeapon.toString();
       System.out.println(bowWeapon);
       
       SpearWeapon spearWeapon = new SpearWeapon();
       spearWeapon.setLength(6);
       spearWeapon.setMaterial("Wood");
       spearWeapon.setType("Long Spear");
       spearWeapon.setStrength("Strong");
       
       String spearWeaponInfo = spearWeapon.toString();
       System.out.println(spearWeapon);
       
       WoodenWeapon woodenWeapon = new WoodenWeapon();
       woodenWeapon.setLength(3);
       woodenWeapon.setMaterial("Wood Sword");
       woodenWeapon.setStrength("strong");
       
       String woodenWeaponInfo = woodenWeapon.toString();
       System.out.println(woodenWeapon);
       
       IronWeapon ironWeapon = new IronWeapon();
       ironWeapon.setLength(3);
       ironWeapon.setMaterial("Iron Sword");
       ironWeapon.setStrength("Stronger");
       
       String ironWeaponInfo = ironWeapon.toString();
       System.out.println(ironWeapon);
       
       DiamondWeapon diamondWeapon = new DiamondWeapon();
       diamondWeapon.setMaterial("Diamond Sword");
       diamondWeapon.setLength(3);
       diamondWeapon.setStrength("Strongest");
       
       String diamondWeaponInfo = diamondWeapon.toString();
       System.out.println(diamondWeapon);
       
    }         
}*/   
       

       
                
                       
       
       
       
       
       
               
       
       
       
       
  
       
       
       
       
       
       
    
   
