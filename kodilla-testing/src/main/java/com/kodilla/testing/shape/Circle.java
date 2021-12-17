package com.kodilla.testing.shape;

public class Circle implements Shape {

    public String getShapeName(){
        return "Circle";
    }
    @Override
    public double getField(double a,double b){

        return a*a*3.14;
    }

}
