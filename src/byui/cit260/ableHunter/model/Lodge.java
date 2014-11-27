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
public class Lodge implements Serializable{
    private String lodgeName; //name of the lodge
    private String weather; //hot, cold, rain, snow
    private String timeOfDay; //day, night
    private String difficulty; // easy, medium, hard
public void displayLodgeScene(){
    System.out.println("You have entered the Lodge Scene");
}
    public Lodge() {
    }

    public String getLodgeName() {
        return lodgeName;
    }

    public void setLodgeName(String lodgeName) {
        this.lodgeName = lodgeName;
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
        return "Lodge{" + "lodgeName=" + lodgeName + ", weather=" + weather + ", timeOfDay=" + timeOfDay + ", difficulty=" + difficulty + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.lodgeName);
        hash = 53 * hash + Objects.hashCode(this.weather);
        hash = 53 * hash + Objects.hashCode(this.timeOfDay);
        hash = 53 * hash + Objects.hashCode(this.difficulty);
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
        final Lodge other = (Lodge) obj;
        if (!Objects.equals(this.lodgeName, other.lodgeName)) {
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
    
    
    
}
