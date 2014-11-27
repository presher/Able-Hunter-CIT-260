/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.model;

//<<<<<<< HEAD
import ablehunter.java.AbleHunter;
import byui.cit260.ableHunter.exceptions.MapControlException;
import byui.cit260.ableHunter.model.GameScene.GameSceneType;
import byui.cit260.ableHunter.view.Location;
import java.awt.image.BufferedImage;
import java.io.Serializable;

/**
 *
 * @author Jason
 */
public class TheMap implements Serializable {// added 11 / 15 / 14

    public TheMap() {
    }
    
    
    
    private String[] scene;

    public String[] getScene() {
        return scene;
    }

    public void setScene(String[] scene) {
        this.scene = scene;
    }
//=======


/**
 *
 * @author Jason
 */
//public class TheMap implements Serializable {
    //private static Object GameSceneType;
    //private static Scene Scenes;

    private static GameScene[] createGameScenes() throws MapControlException{
         //To change body of generated methods, choose Tools | Templates.
        BufferedImage image = null;
        Game game = AbleHunter.getCurrentGame();
        GameScene[] scenes = new GameScene[GameSceneType.values().length];
        
        GameScene startingScene = new GameScene();
            startingScene.setDescription("");
            startingScene.setMapSymbol("AHST");
            startingScene.setBlocked(false);
            startingScene.setTravelTime(240.0);
            //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "Location of image");
            //startingScene.setIcon(sartingScceneImgage);
            scenes[GameSceneType.start.ordinal()] = startingScene;
            
        GameScene finishScene = new GameScene();
        finishScene.setDescription("");
        finishScene.setMapSymbol("AHFN");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
         //ImageIcon finishSceneImage = MapControl.getImage(finishScene, "Location of image");
            //finishScene.setIcon(finishScceneImgage);
        scenes[GameSceneType.finish.ordinal()] = finishScene;
        return null;
        
    }
    
    private static GameScene[] assignSceneLocations(){
        return null;
        
    }

   
private int noOfRows;
private int noOfColoums;
private Location[][] Location;

   // public TheMap() {
   // }
public TheMap(int noOfRows, int noOfColums){
    if(noOfRows < 1 || noOfColums < 1){
        System.out.println("The number of rows and colums must be > zero");
        return;
    }
    this.noOfRows = noOfRows;
    this.noOfColoums = noOfColums;
    
    this.Location = new Location[noOfRows][noOfColums];
    for(int row = 0 ; row < noOfRows; row++){
        for(int colum = 0; colum < noOfColums; colum++){
            TheLocation theLocation = new TheLocation();
            theLocation.setColum(colum);
            theLocation.setRow(row);
            theLocation.setVisited(false);
            
            Location[row][colum] = Location[row][colum];
        }
    }
}

private static TheMap createTheMap() throws MapControlException{
    TheMap map = new TheMap(20,20);
    GameScene[] scenes = createGameScenes();
    GameScene.assignScenesToLocations(map, scenes);

    return map;
}

    

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColoums() {
        return noOfColoums;
    }

    public void setNoOfColoums(int noOfColoums) {
        this.noOfColoums = noOfColoums;
    }

    public Location[][] getLocations() {
        return Location;
    }

    public void setLocations(Location[][] locations) {
        this.Location = locations;
    }




    public static void moveAvatarToStatingLocation(TheMap theMap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
// added 11 / 15 / 14

    TheLocation[][] getlocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    

  
//>>>>>>> origin/master
    
    
}
