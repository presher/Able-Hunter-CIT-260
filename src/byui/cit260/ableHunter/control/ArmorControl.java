/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import java.io.Serializable;

/**
 *
 * @author Jason
 */
public class ArmorControl implements Serializable{
            double height = 0;
            double length;
            double cubicFt;
            double width = 0;
            
    ArmorControl(length, height){
            
            if(height < 0){
                    return = 0;
            }
            if(length < 0 | length > 36){
                    return = -1;}
               
            
            cubicFt = length * width * height;
                    return = cubicFt;
                    
}   

    public ArmorControl() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getCubicFt() {
        return cubicFt;
    }

    public void setCubicFt(double cubicFt) {
        this.cubicFt = cubicFt;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "ArmorControl{" + "height=" + height + ", length=" + length + ", cubicFt=" + cubicFt + ", width=" + width + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.length) ^ (Double.doubleToLongBits(this.length) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.cubicFt) ^ (Double.doubleToLongBits(this.cubicFt) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
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
        final ArmorControl other = (ArmorControl) obj;
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cubicFt) != Double.doubleToLongBits(other.cubicFt)) {
            return false;
        }
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        return true;
    }
    
}
