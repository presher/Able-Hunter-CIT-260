/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import ablehunter.java.displayInfo;
import byui.cit260.ableHunter.model.Mountain;
import byui.cit260.ableHunter.model.Player;

/**
 *
 * @author Jason
 */
public class MountainView extends View implements displayInfo{
     Mountain board;

    public MountainView(String promptMessage) {
        super(promptMessage);
    }
    
     @Override
     public Object display(Object object) {
        this.board = (Mountain) object;
        this.printHeadRow();
        this.printDividerRow();
       // this.printDividerRowMiddle();
        for (int i = 0; i < this.board.getRowCount(); i++) {
            Player[] rowOfLocations = this.board.getBoardLocations()[i];
            this.printRow(i+1, rowOfLocations); //Changes Row Number
            this.printDividerRow();
            this.printDividerRowMiddle();
        }
        this.console.println();
         
        return board;
    }

    private void printHeadRow() {

        // print first cell

        this.console.print("\n\t      1   ");

        int columnsInRow = this.board.getColumnCount();
        // print remaining cells in row
        for (int i = 1; i < columnsInRow - 1; i++) {// Changed columnsInRow -1 t0 +1
            int col = i + 1; //Changes Column Number
            this.console.print("  " + col + "   ");
        }
        this.console.print(" " + columnsInRow + "   ");
    }

    private void printDividerRow() {

        // print first cell

        this.console.print("\n\t  |------");
        int columnsInRow = this.board.getColumnCount();
        // print remaining cells in row
        for (int i = 1; i < columnsInRow + 1; i++) { //Changed columnsInRow to +1 from -1
            this.console.print("------");
        }
        this.console.print("-----|");
    }

    private void printDividerRowMiddle() {

        // print first cell

        this.console.print("\n\t  |------");
        int columnsInRow = this.board.getColumnCount();
        // print remaining cells in row
        for (int i = 1; i < columnsInRow + 1; i++) { //Changed columnsInRow to +1 from -1
            this.console.print("------");
        }
        this.console.print("-----|");
    }
    
    private void printRow(int rowNumber, Player[] rowLocations) {
        
        // print first cell
        String letter = " ";
        if (rowLocations[0] != null) {
            letter = rowLocations[0].getMarker();
        }
        this.console.print("\n\t" + rowNumber + " |  " + letter + "  |");

        // print remaining cells in row
        for (int i = 1; i < rowLocations.length; i++) { // 
            if (rowLocations[i] == null) {
                letter = " ";
            } else {
                letter = rowLocations[i].getMarker();
            }
            this.console.print("  " + letter + "  |");
        }
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
