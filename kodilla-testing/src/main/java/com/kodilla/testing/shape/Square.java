package com.kodilla.testing.shape;

public class Square implements Shape{

    public String getShapeName(){
        return "Square";
    }
    @Override
    public double getField(double a, double b){
    return a*b;
    }
}
