/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.enums;

/**
 *
 * @author Jason
 */
public enum Resources {
    Wood("Wood"),
    Iron("Iron"),
    Gold("Gold"),
    Diamond("Diamond"),
    Skins("Skins"),
    Leather("Leather");
String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Resources getWood() {
        return Wood;
    }

    public static Resources getIron() {
        return Iron;
    }

    public static Resources getGold() {
        return Gold;
    }

    public static Resources getDiamond() {
        return Diamond;
    }

    public static Resources getSkins() {
        return Skins;
    }

    public String getResources() {
        return resources;
    }
   String resources;
    
    
   
    private String description;
  

     Resources(String description) {
         this.description = description;
         
    }

    public String getDescription() {
        return description;
    }
    public void display(){
    System.out.println(this.message);
}
    
}
