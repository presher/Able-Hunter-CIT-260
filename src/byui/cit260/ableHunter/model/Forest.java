/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jason
 */
public class Forest implements Serializable{
    private String forestName; //Name of the forest
    private String weather; //hot, cold, rain, snow
    private String timeOfDay; //day or night
    private String dificulty; //easy, medium, hard

    public Forest() {
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

    public String getDificulty() {
        return dificulty;
    }

    public void setDificulty(String dificulty) {
        this.dificulty = dificulty;
    }

    @Override
    public String toString() {
        return "Forest{" + "forestName=" + forestName + ", weather=" + weather + ", timeOfDay=" + timeOfDay + ", dificulty=" + dificulty + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.forestName);
        hash = 41 * hash + Objects.hashCode(this.weather);
        hash = 41 * hash + Objects.hashCode(this.timeOfDay);
        hash = 41 * hash + Objects.hashCode(this.dificulty);
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
        if (!Objects.equals(this.dificulty, other.dificulty)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
