/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jason
 */
public class TheLocation implements Serializable {
    private int row;
    private int colum;
    private boolean visited;
    private GameScenes scene;
    private ArrayList<Avatar> avatar;
    private TheLocation[][] Location;

    public TheLocation() {
    }

   
    
    

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public GameScenes getScene() {
        return scene;
    }

    public void setScene(GameScenes scene) {
        this.scene = scene;
    }

    public ArrayList<Avatar> getAvatar() {
        return avatar;
    }

    public void setAvatar(ArrayList<Avatar> avatar) {
        this.avatar = avatar;
    }

   public void setTheScene(GameScenes scene) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
}
