/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.control.GameControl;

/**
 *
 * @author Jason
 */
public class PrintReportView extends View {

    public PrintReportView(String promptMessage) {
        super(promptMessage);
    }
    public void displayReport(){
    this.console.println("This will diplay a report");
    this.console.println("\n\nEnter the file path for the file where the is saved");
        String filepath = this.getInput();
        try{
            GameControl.getReport(filepath);
        }catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        AbleHunterMainMenu gameMenu = new AbleHunterMainMenu() {};
        gameMenu.display();
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
