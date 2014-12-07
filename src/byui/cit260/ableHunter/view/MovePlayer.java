/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import ablehunter.java.errorInfo;
import byui.cit260.ableHunter.control.AbleHunterControl;
import byui.cit260.ableHunter.model.Board;
import byui.cit260.ableHunter.model.Game;
import java.awt.Point;
import java.io.BufferedReader;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Jason
 */
public final class MovePlayer implements errorInfo{//Created and Coded by Jason
   private Game game;
    protected final BufferedReader keyBoard = AbleHunterControl.getInFiles();
   //private Board board;
  
   @Override
   public Object getInput(Object object) {
        this.game = (Game) object;
        Scanner inFile = AbleHunterControl.getInputFile(); // get input file 

        // prompt for the row and column numbers
        System.out.println(//"\n\n\t" + game.getCurrentPlayer().getName() + " it is your turn."
                 " Enter a row and column number (For example: 1 3)");

        // read the row and column coordinates
        String[] coordinates;
        Point location = null;
        
        boolean valid = false;

        do {
            String strRowColumn = inFile.nextLine(); // read in row and column
            strRowColumn = strRowColumn.trim(); // trim all blanks from front and end 
                
            strRowColumn = strRowColumn.replace(',', ' '); // replace commas with a blank
            coordinates = strRowColumn.split("\\s"); // tokenize the string

            if (coordinates.length < 1) { // no coordinates specified
                new AbleHunterError().display(
                        "You must enter two numbers, a row and the column, "
                        + "or a \"Q\" to quit. Try again.");
                continue;
            }    

            else if (coordinates.length == 1) { // only one coordinate
                if (coordinates[0].toUpperCase().equals("Q")) { // Quit?
                    return null;
                } else { // wrong number of values entered.
                    new AbleHunterError().display(
                        "You must enter two numbers, a row and the column, "
                        + "or a \"Q\" to quit. Try again.");
                    continue;
                }
            }

            // user java regular expression to check for valid integer number?
            Pattern digitPattern = Pattern.compile(".*\\D.*");
            if (digitPattern.matcher(coordinates[0]).matches()  || 
                digitPattern.matcher(coordinates[1]).matches()
               ) {
                new AbleHunterError().display(
                        "You must enter two numbers, a row and the column, "
                        + "or a \"Q\" to quit. Try again.");
                continue;
            }
            
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
            
            Board board = game.getBoard();
            if (row < 1   ||  row > board.getRowCount() ||
                column < 1  ||  column > board.getColumnCount()) {
                new AbleHunterError().display(
                        "Enter a valid number of rows and columns from 3 to 10. Try again.");
                continue;
            }

            location = new Point(row-1, column-1);
            valid = true;

        } while (!valid);
        
        return location;
            
    }
   
   
   
   
     /*public static void main(String[] args) {
         MovePlayer movePlayer = new MovePlayer();
     }*/
     public MovePlayer(){
       Object Player = getInput(game);
        
       
}  
    public Object display(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
     public void main(String args[]) throws NumberFormatException{
   //public GetInt(){
         boolean quit  = false;
         boolean valid = false;
       System.out.println("Please Enter A Number");
      
        do{   
       try{
           
       //Scanner keyboard = new Scanner(System.in);
       
       String input = null;
      try{          
      while(!valid){
       input = this.keyBoard.readLine();
        if(input.length() < 1){
            System.out.println("Enter a valid input");
        }
      }
       }catch(Exception e){
               System.out.println("Error reading input: " + e.getMessage());
               }
       
           
         String a = input;
           int i = Integer.parseInt(a);
           System.out.println("int value = " + i);
           quit = true;
       }catch(NumberFormatException nfe)
    {
       System.out.println("That will not do try again");
       
    }
       
    } while(!quit);
    
       }
   }



    /*public class Location {
        
        private int row;
        private int column;
        private String value;
        private Player player;
        public String coordinates;

        public String[] getCoordinates() {
            String[] coordinates = new String[2];
            Integer intRow = this.getRow() + 1;
            Integer intColumn = this.getColumn() + 1;
            coordinates[0] = intRow.toString();
            coordinates[1] = intColumn.toString();
            /*coordinates[2] = intRow.toString();
            coordinates[3] = intColumn.toString();
            return coordinates;
        }

        public void setCoordinates(String coordinates) {
            this.coordinates = coordinates;
        }*/
    
        //public void MovePlayer() {
        //}
/*private int row;

        private int column;
        private String value;
        private Player player;
        public String coordinates;
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

        public void setPlayer(Player player) {
            this.player = player;
        }

       /* String[] getCoordinates() {
            String[] coordinates = new String[2];
            Integer intRow = this.getRow() + 1;
            Integer intColumn = this.getColumn() + 1;
            coordinates[0] = intRow.toString();
            coordinates[1] = intColumn.toString();
            /*coordinates[2] = intRow.toString();
            coordinates[3] = intColumn.toString();
            
            
            return coordinates;
        }*/
    
    //public MovePlayer(){
   // @Override
    
//}

   


