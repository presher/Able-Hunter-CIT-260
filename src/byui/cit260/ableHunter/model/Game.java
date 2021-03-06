/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.model;

import byui.cit260.ableHunter.view.ItemsInInventory;
import java.io.Serializable;

/**
 *
 * @author Jason
 */
//<<<<<<< HEAD
/*public class Game  implements Serializable{
    
    public static final String PLAYER_A_DEFAULT_MARKER = "X";
    public static final String PLAYER_B_DEFAULT_MARKER = "O";
    
    public static final String ONE_PLAYER = "ONE_PLAYER";
    public static final String TWO_PLAYER = "TWO_PLAYER";
    
    public static final String CONTINUE = "CONTINUE";
    public static final String NEW_GAME = "NEW_GAME";
    public static final String PLAYING = "PLAYING"; 
    public static final String WINNER = "WINNER"; 
    public static final String TIE = "TIE"; 
    public static final String QUIT = "QUIT"; 
    public static final String ERROR = "ERROR";
    public static final String EXIT = "EXIT";

    private String gameType;
    private Player playerA;
    private Player playerB;
    private Player currentPlayer;
    private Player otherPlayer;
    private Player winner;
    private Player loser;
    private String status;
    private Board board;
    private int levels;
    private double totalTime;
    private String[] avatar;// added 11 / 15 / 14
    private String[] weapons;// added 11 / 15 / 14
    private TheMap theMap;// added 11 / 15 / 14
    private Resources resources;// added 11 / 15 / 14

    public String[] getAvatar() {
        return avatar;
    }

    public void setAvatar(String[] avatar) {
        this.avatar = avatar;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }

    public TheMap getTheMap() {
        return theMap;
    }

    public void setTheMap(TheMap theMap) {
        this.theMap = theMap;
    }

    public Game() {
    }
    
    

    
    
    

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public Player getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(Player otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLoser() {
        return loser;
    }

    public void setLoser(Player loser) {
        this.loser = loser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    
    
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

   

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
    
    

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }
    
    public void start() {

       // this.setPlayingOrder(playerA, playerB);

        // clear the board
        this.board.clearTheBoard();
        this.setStatus(Game.NEW_GAME);
    }

    @Override
    public String toString() {
        return "Game{" + "levels=" + levels + ", totalTime=" + totalTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.levels;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.levels != other.levels) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        return true;
    }

    /*public Object getCurrentPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
}*/
//=======
public class Game implements Serializable{
    
    public static final String NEW_GAME = "NEW_GAME";
     public static final String PLAYING = "PLAYING";
     public static final String ONE_PLAYER = "ONE_PLAYER";
      public static final String WINNER = "WINNER"; 
    public static final String TIE = "TIE"; 
    public static final String QUIT = "QUIT"; 
    
    public Game(String gameType){
        
    }
            
            
    
     
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
     private double totalTime;
    private String[] avatar;// added 11 / 15 / 14
    private String[] weapons;// added 11 / 15 / 14
    private TheMap theMap;// added 11 / 15 / 14
    private Resources resources;// added 11 / 15 / 14
    private Scene scene;
    private ItemsInInventory inventoryItems;
    private String status;
    private Player currentPlayer;

    public static String getNEW_GAME() {
        return NEW_GAME;
    }

    public static String getPLAYING() {
        return PLAYING;
    }

    public static String getONE_PLAYER() {
        return ONE_PLAYER;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    private String gameType;
    private Player playerA;
    private Player playerB;
     private Player otherPlayer;

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public Player getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(Player otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public ItemsInInventory getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(ItemsInInventory inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    public Game() {
    }

   
    

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public String[] getAvatar() {
        return avatar;
    }

    public void setAvatar(String[] avatar) {
        this.avatar = avatar;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }

    public TheMap getTheMap() {
        return theMap;
    }

    public void setTheMap(TheMap theMap) {
        this.theMap = theMap;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void setCurrentPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Board getBoard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
//>>>>>>> origin/master
