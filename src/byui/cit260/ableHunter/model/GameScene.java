/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.model;

/**
 *
 * @author Jason
 */
class GameScene {
    public enum GameSceneType{
        start,
        finish,
        Desert,
        Island,
        Mountain,
        Lodge,
        Forest;

    }

    
     public static void assignScenesToLocations(TheMap map, GameScene[] scenes) {
         //To change body of generated methods, choose Tools | Templates.
         TheLocation[][] locations = map.getlocations();
         locations[0][0].setTheScene(scenes[GameSceneType.Desert.ordinal()]);
         locations[0][6].setTheScene(scenes[GameSceneType.start.ordinal()]);
         locations[0][2].setTheScene(scenes[GameSceneType.Lodge.ordinal()]);
         locations[0][1].setTheScene(scenes[GameSceneType.Mountain.ordinal()]);
         locations[0][3].setTheScene(scenes[GameSceneType.Island.ordinal()]);
         locations[0][4].setTheScene(scenes[GameSceneType.Forest.ordinal()]);
         locations[0][5].setTheScene(scenes[GameSceneType.finish.ordinal()]);
    }
    
    
    void setDescription(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMapSymbol(String ahst) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setBlocked(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTravelTime(Double i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
