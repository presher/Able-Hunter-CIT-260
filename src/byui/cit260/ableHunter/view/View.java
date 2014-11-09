/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jason
 */
public abstract class View implements ViewInterface{//Team Felix and Jason
    private String promptMessage;

     public View(String promptMessage){
        this.promptMessage = promptMessage;
}
     
     @Override
    public void display(){
        String value;
        
        do{
            System.out.println(this.promptMessage);
            value = this.getInput();
            try {
                this.doAction(value);
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while(!value.equals("Q"));
    }
    
    @Override
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        String input = null;
        while (!valid){
            System.out.println("\t\nEnter Your Selection Below");
            selection = keyboard.nextLine();
            selection = selection.trim();
            
//while(selection != "E");
        
    
            if(selection.length() < 1){
                System.out.println("***Invalid Selection***");
              continue;
            }
       
            break;
        }
        return selection;
        
}
     private void doAction(String value)throws IOException {
       Scanner keyboard = new Scanner(System.in);
       String input;
       input = keyboard.nextLine();
       input = input.trim();
       switch (input) {
                case "N":
                    this.getAbleHunterStart();
                    break;
                case "H":
                    this.helpMenu();
                    break;
                case "S":
                    this.saveGame();
                case "E":
                    break;
    }
     }
       
    private void getAbleHunterStart() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("This is the start");
    }

    private void helpMenu() { 
        
        System.out.println("Help Menu");
    }
    
    private void saveGame() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("This Will save Your Game");
    }
   }