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
    
   
    HUNTER_1("Hunter 1"),
    BOB_THE_STRONG("Bob The Strong"),
    PRINCESS_BECKY("Princess"),
    HE_MAN("He_Man"),
    SHE_MAN("She_Man");
    
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
