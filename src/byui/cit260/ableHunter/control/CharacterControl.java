/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import java.io.IOException;

/**
 *
 * @author adm-achina
 */
public class CharacterControl {
        public String characterControl;
    
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) //Coded by Jason
         throws java.io.IOException{
            char avatar, ignore;
                CharacterControl characterControlInput = new CharacterControl();
        for(;;){
            do{
                System.out.println("\n Please enter w to move one space");
                System.out.println("Enter q to continue");
                   
               avatar = (char) System.in.read();
             do {
                ignore = (char) System.in.read();
            }// Do Loop 2
            while(ignore != '\n');
             if (avatar == 'w'){
                System.out.print("\n Avatar has moved 1 space");
            }
             else if (avatar != 'q'){
                 System.out.println("Please enter the correct letter to continue.");
             }
     }// Do loop One
           while( avatar < '1' | avatar > '4' & avatar != 'q');
       
            
                if (avatar == 'q') break;
         }
        }     
}


