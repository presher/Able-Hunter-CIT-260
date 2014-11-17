/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.model;

import java.io.Serializable;

/**
 *
 * @author Jason
 */
public class Game implements Serializable{
     private double totalTime;
    private String[] avatar;// added 11 / 15 / 14
    private String[] weapons;// added 11 / 15 / 14
    private TheMap theMap;// added 11 / 15 / 14
    private Resources resources;// added 11 / 15 / 14

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

    public void setCurrentPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
