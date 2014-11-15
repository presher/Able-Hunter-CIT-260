/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Jason
 */
public enum Avatar implements Serializable{// added 11 / 15 / 14
    
   
    HUNTER_1("The default AVATAR of the Game"),
    BOB_THE_STRONG("Bob is a Survivalist and has made it a long time"),
    PRINCESS_BECKY("She might seem weak but she kicks butt"),
    HE_MAN("The strong man who defeats all"),
    SHE_MAN("When no one else can do it all fall before her");
    
  //private String name;
    
        
    private final String description;
    private final Point coordinates;

     Avatar(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

     
}
