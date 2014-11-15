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
    
    
}
