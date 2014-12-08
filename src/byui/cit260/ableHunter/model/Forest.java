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
public class Forest extends AbstractTableModel{
    private String forestName; //Name of the forest
    private String weather; //hot, cold, rain, snow
    private String timeOfDay; //day or night
    private String difficulty; //easy, medium, hard

    public Forest() {
        
    }

    
public void displayForestScene(){
    System.out.println("You have entered the Forest Scene");
}
   
    
    public String getForestName() {
        return forestName;
    }

    public void setForestName(String forestName) {
        this.forestName = forestName;
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

    public void setDifficulty(String dificulty) {
        this.difficulty = dificulty;
    }

    @Override
    public String toString() {
        return "Forest{" + "forestName=" + forestName + ", weather=" + weather + ", timeOfDay=" + timeOfDay + ", dificulty=" + difficulty + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.forestName);
        hash = 41 * hash + Objects.hashCode(this.weather);
        hash = 41 * hash + Objects.hashCode(this.timeOfDay);
        hash = 41 * hash + Objects.hashCode(this.difficulty);
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
        final Forest other = (Forest) obj;
        if (!Objects.equals(this.forestName, other.forestName)) {
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
