/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.model;

import byui.cit260.ableHunter.view.View;
import java.io.Serializable;
import java.util.Objects;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jason
 */
public class Desert extends AbstractTableModel{
    private String desertName;
    private String weather; //hot, cold, rain, snow
    private String timeOfDay; //day or night
    private String difficulty; //easy, medium, hard

    public Desert() {
        
    }

   
public void displayDesertScene(){
    System.out.println("You have entered the Desert Scene");
}
    

    public String getDesertName() {
        return desertName;
    }

    public void setDesertName(String desertName) {
        this.desertName = desertName;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Desert{" + "desertName=" + desertName + ", weather=" + weather + ", timeOfDay=" + timeOfDay + ", difficulty=" + difficulty + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.desertName);
        hash = 37 * hash + Objects.hashCode(this.weather);
        hash = 37 * hash + Objects.hashCode(this.timeOfDay);
        hash = 37 * hash + Objects.hashCode(this.difficulty);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Desert other = (Desert) obj;
        if (!Objects.equals(this.desertName, other.desertName)) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        if (!Objects.equals(this.timeOfDay, other.timeOfDay)) {
            return false;
        }
        if (!Objects.equals(this.difficulty, other.difficulty)) {
            return false;
        }
        return true;
    }

    public void displayHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getInputHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void doActionHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
