/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.model.Player;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class MovePlayer {//Created and Coded by Jason
   /* public void MovePlayer(){
        int player = 0;
        Scanner movments = new Scanner(System.in);
                int go = 0;
    System.out.println("Enter the amount of spaces you would like to Move 1-5");
            go = movments.nextInt();
    if (player <0 || player >5)
        System.out.println("To move plese enter a valid number from 1-5");
    else{
        System.out.println("You have successfully moved" + go);
                }*/
    //public class Location {

        private int row;
        private int column;
        private String value;
        private Player player;

        MovePlayer() {
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

        public void setPlayer(Player player) {
            this.player = player;
        }

        String[] getCoordinates() {
            String[] coordinates = new String[2];
            Integer intRow = this.getRow() + 1;
            Integer intColumn = this.getColumn() + 1;
            coordinates[0] = intRow.toString();
            coordinates[1] = intColumn.toString();
            /*coordinates[2] = intRow.toString();
            coordinates[3] = intColumn.toString();*/
            
            
            return coordinates;
        }
    }
    

