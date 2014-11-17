/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;


public abstract class AbleHunterMainMenuImpl extends AbleHunterMainMenu {//Felix and Jason Team

    public void doInput(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void doAction(char choice) {
        
        switch (choice) {
            case 'N':
            this.startNewGame();
                break;
                case 'G':
                    this.getSavedGame();
                    break;
                case "H":
                    this.displayHelpMenu();                   
                    break;
                case "S":
                    this.saveGame();
                    break;
                case "Q":
                     case "P":
                               this.HelpToPLAY();
                               break;
                                case "W"://Get Existing Game
                                   this.MakeWeapons();
                                    break;
                                    case "A":
                                        this.MakeArmor();
                                        break;
                                            case "M":                                                        
                                               this.UseMap();
                                                break;
                                            case "D":
                                                this.Defend();
                                                break;
                                                    case "E":
                                                        quit = true;
                                                        return;
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
        }
        /**  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. **/
    }

    @Override
    public String getInputHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doActionHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getSavedGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
