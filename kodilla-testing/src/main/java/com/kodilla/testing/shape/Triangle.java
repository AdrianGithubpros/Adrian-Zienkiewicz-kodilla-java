package com.kodilla.testing.shape;


public class Triangle implements Shape{

    public String getShapeName(){
        return "Triangle";
    }

    @Override
    public double getField(double a, double h) {
            return a*(h/2);

    }




}
