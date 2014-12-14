/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.view.View;
import java.io.IOException;

/**
 *
 * @author adm-achina
 */
public abstract class CharacterControl  extends View{
        public String characterControl;

    public CharacterControl(String promptMessage) {
        super(promptMessage);
    }
    
    
       public void CharControls() throws IOException{
            char avatar, ignore;
                CharacterControl characterControlInput = null;
        for(;;){
            do{
                this.console.println("\n Please enter w to move one space");
                this.console.println("Enter q to continue");
                   
               avatar = (char) System.in.read();
             do {
                ignore = (char) System.in.read();
            }// Do Loop 2
            while(ignore != '\n');
             if (avatar == 'w'){
                this.console.print("\n Avatar has moved 1 space");
            }
             else if (avatar != 'q'){
                 this.console.println("Please enter the correct letter to continue.");
             }
     }// Do loop One
           while( avatar < '1' | avatar > '4' & avatar != 'q');
       
            
                if (avatar == 'q') break;
         }
         
        }     
}


