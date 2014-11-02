/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.model.Player;
import java.awt.Point;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jason
 */
public class Board extends AbstractTableModel{
int rowCount  ;
    int columnCount ;
    private String name;
    private Point boardDimensions = new Point();
    private Player[][] boardLocations;

    public Board() {
    }
public Board(int noRows, int noColumns) {
        this.boardDimensions.setLocation(noRows, noRows);
        this.boardLocations = new Player[noRows][noColumns];
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getBoardDimensions() {
        return boardDimensions;
    }

    public void setBoardDimensions(Point boardDimensions) {
        this.boardDimensions = boardDimensions;
    }

    public Player[][] getBoardLocations() {
        return boardLocations;
    }

    public void setBoardLocations(Player[][] boardLocations) {
        this.boardLocations = boardLocations;
    }
    
    
    
    /*int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public int getRowCount() {
        //To change body of generated methods, choose Tools | Templates.
        return (int) this.boardDimensions.getX();
    }

    @Override
    public int getColumnCount() {
         //To change body of generated methods, choose Tools | Templates.
        return (int) this.boardDimensions.getY();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         //To change body of generated methods, choose Tools | Templates.
         return boardLocations[rowIndex][columnIndex];
    }
    public Player getPlayerAt(int row, int column) {
        return this.boardLocations[row][column];
    }
    public class Location {

        private int row;
        private int column;
        private String value;
        private Player player;

        Location() {
        }

         int getRow() {
            return row;
        }

         void setRow(int row) {
            this.row = row;
        }

         int getColumn() {
            return column;
        }

         void setColumn(int column) {
            this.column = column;
        }

         String getValue() {
            return value;
        }

         void setValue(String value) {
            this.value = value;
        }

         Player getPlayer() {
            return player;
        }

         void setPlayer(Player player) {
            this.player = player;
        }
        String[] getCoordinates() {
            String[] coordinates = new String[2];
            Integer intRow = this.getRow() + 1;
            Integer intColumn = this.getColumn() + 1;
            coordinates[0] = intRow.toString();
            coordinates[1] = intColumn.toString();
            coordinates[2] = intRow.toString();
            coordinates[3] = intColumn.toString();
            
            
            return coordinates;
        }
        
    }
}
