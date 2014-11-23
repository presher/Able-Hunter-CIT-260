/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import byui.cit260.ableHunter.model.Board;
import byui.cit260.ableHunter.model.Mountain;
import byui.cit260.ableHunter.model.Player;

/**
 *
 * @author Jason
 */
public class MountainControl {
    
   
    
  /*  Mountain board;
    
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
        System.out.println();
         
        return board;
    }

    private void printHeadRow() {

        // print first cell

        System.out.print("\n\t      1   ");
        int columnsInRow = this.board.getColumnCount();
        // print remaining cells in row
        for (int i = 1; i < columnsInRow - 1; i++) {// Changed columnsInRow -1 t0 +1
            int col = i + 1; //Changes Column Number
            System.out.print("  " + col + "   ");
        }
        System.out.print(" " + columnsInRow + "   ");
    }

    private void printDividerRow() {

        // print first cell

        System.out.print("\n\t  |------");
        int columnsInRow = this.board.getColumnCount();
        // print remaining cells in row
        for (int i = 1; i < columnsInRow + 1; i++) { //Changed columnsInRow to +1 from -1
            System.out.print("------");
        }
        System.out.print("-----|");
    }

    private void printDividerRowMiddle() {

        // print first cell

        System.out.print("\n\t  |------");
        int columnsInRow = this.board.getColumnCount();
        // print remaining cells in row
        for (int i = 1; i < columnsInRow + 1; i++) { //Changed columnsInRow to +1 from -1
            System.out.print("------");
        }
        System.out.print("-----|");
    }
    
    private void printRow(int rowNumber, Player[] rowLocations) {
        
        // print first cell
        String letter = " ";
        if (rowLocations[0] != null) {
            letter = rowLocations[0].getMarker();
        }
        System.out.print("\n\t" + rowNumber + " |  " + letter + "  |");

        // print remaining cells in row
        for (int i = 1; i < rowLocations.length; i++) { // 
            if (rowLocations[i] == null) {
                letter = " ";
            } else {
                letter = rowLocations[i].getMarker();
            }
            System.out.print("  " + letter + "  |");
        }
    }*/
    
    
    
    
    
    
    
     
    
}
