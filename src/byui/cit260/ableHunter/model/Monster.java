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
public class Monster implements Serializable{
    public String description;
    public double width;
    public double height;
    public double weight;
    public double hitPoints;
    public double life;
    
    public Monster(){
        this.description = "\n This is Bob the Monster he likes to eat the Able Hunter.";
        this.height = 3.2;//scale 1-5
        this.hitPoints = 50.0;//each hit takes away 50 life points
        this.life = 100.00;//percent
        this.weight = 1000.00;//pounds
        this.width = 5.2; //scale of 1-10
}
    
}
