/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import java.io.IOException;

/**
 *
 * @author Jason
 */
public class StartGameMenu {

    void displayMenu() throws IOException {
       /*  //To change body of generated methods, choose Tools | Templates.
        private void doAction(char selection) throws IOException {
        //To change body of generated methods, choose Tools | Templates.*/
        StartGameMenu gameStart = new StartGameMenu();
        char input;
            for(;;){
                do{
        input = (char) System.in.read();
        switch (input){
                           case 'N':
                               this.startNewGame();
                               break;
                                case '2'://Get Existing Game
                                   this.startExistingGame();
                                    break;
                                    case 'H':
                                        this.getHelpMenu();
                                        break;
                                            case 'S':                                                        
                                               this.saveGame();
                                                break;
                                                    case 'E':
                                                        return;
                                                    default:
                                                        System.out.println("Oops not a valid input try again");
                                                            break;
        }                                                    
                }while(input != 'E');
                }
    }

    private void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

