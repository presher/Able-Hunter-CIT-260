/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.enums;

import byui.cit260.ableHunter.model.TheLocation;
import byui.cit260.ableHunter.model.TheMap;

/**
 *
 * @author Jason
 */
public enum GameScenes {
    
        start ("Start New Game"),
        finish ("Finish Game"),
        Desert ("Desert Scene"),
        Island ("Island Scene"),
        Mountain ("Mountain Scene"),
        Lodge ("Lodge Scene"),
        Forest ("Forest Scene");

     String message;

   private GameScenes(String message){
   this.message = message;}
   
   public String getMessage(){
    return message;}

    public void display(){
        System.out.println(this.message);
}

}
   
   
    
    
   /* void setDescription(String string) {
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
    }*/
    

