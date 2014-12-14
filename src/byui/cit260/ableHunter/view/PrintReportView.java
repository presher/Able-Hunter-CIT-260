/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

/**
 *
 * @author Jason
 */
public class PrintReportView extends View{

    public PrintReportView(String promptMessage) {
        super(promptMessage);
    }

    /**
     *
     */
    /*public PrintReportView() {
         //To change body of generated methods, choose Tools | Templates.
    }*/

   
    
   // public static void main(String args[]){}

   
    
    public void displayReport(){
    this.console.println("This will diplay a report");
    this.console.println("\n\nEnter the file path for the file where the is saved");
        String filepath = this.getInput();
        try{
            ReportView("C:\\Users\\Jason\\Desktop\\test.txt");
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

    private void ReportView(String cUsersJasonDesktop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
