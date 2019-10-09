package ru.mirea.Lab1;
import java.lang.*;
public class Ball {
    private double diameter;
    private String type;

    public Ball(double d, String t){
        diameter = d;
        type = t;
    }
    public Ball( String t){
        diameter = 0;
        type = t;
    }

    public Ball(){
        diameter = 0;
        type = "football";
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiameter(){
        return diameter;
    }
    public String getType(String type) {
        return type;
    }
    public String toString() {
        return this.diameter + ", type " + this.type;
    }

    public void Ball() {
        System.out.println("A ball with a diameter of " + diameter + " is a " + type + " ball");
    }
}
