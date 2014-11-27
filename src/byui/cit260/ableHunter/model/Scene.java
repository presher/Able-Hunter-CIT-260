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
public enum Scene implements Serializable{// added 11 / 15 / 14
    Lodge("The default Scene in the game"),
    Mountain("The second sene choice of the after completing the lodge"),
    Island("The third scene of the game after completing the Mountian scene"),
    Desert("The fourth scene of the game after copleting the Island scene,"),
    Forest("The fianl scene of the game after all other scenes are complete");
    
    private final String description;
    private Mountain mountain;
    private Lodge lodge;
    private Island island;
    private Desert desert;
    private Forest forest;

    Scene(String description) {
this.description = description;
    }
    
    

    public String getDescription() {
        return description;
    }
    
    
    
}
