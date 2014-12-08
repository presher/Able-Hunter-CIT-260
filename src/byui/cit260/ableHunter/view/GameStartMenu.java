/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.control.GameControl;
import byui.cit260.ableHunter.model.Inventory;
import java.io.IOException;

/**
 *
 * @author Jason
 */
public class GameStartMenu extends View{

    public GameStartMenu(String promptMessage) {
        super(promptMessage);
    }

    void displayMenu() throws IOException {
       /*  //To change body of generated methods, choose Tools | Templates.
        private void doAction(char selection) throws IOException {
        //To change body of generated methods, choose Tools | Templates.*/
        GameStartMenu gameStart = null;
        char input;
            for(;;){
                do{
        input = (char) System.in.read();
        switch (input){
                           case 'N':
                               this.startNewGame();
                               break;
                           case 'C':
                               this.showScenes();
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
                                            case 'I':
                                                    this.viewInventory();
                                                    break;
                                                    case 'E':
                                                        return;
                                                    default:
                                                        this.console.println("Oops not a valid input try again");
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

    private void viewInventory() {
         //To change body of generated methods, choose Tools | Templates.
        Inventory[] inventory = GameControl.getsortedInventoryList();
                this.console.println("\n  List of Inventory Iems");
                this.console.println("Description" + "\t" + "Required" + "\t" + "In Stock");
                
                for(Inventory inventoryItem: inventory){
                    this.console.println(inventoryItem.getDescription + "\t" + inventoryItem.getAmountNeeded + "\t" + inventoryItem.getItemsCollected);
                }
    }

    private void showScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInputHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doActionHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

