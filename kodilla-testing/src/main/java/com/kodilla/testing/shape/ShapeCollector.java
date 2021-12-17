package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> list = new ArrayList<>();

    public ShapeCollector(List<Shape> list2){
        list = list2;
    }

    public void addFigure(Shape shape){
        list.add(shape);

    }
    public void removeFigure(Shape shape){
        list.remove(shape);

    }
    public Shape getFigure(int n){
    return list.get(n);
    }

    public String showFigures(){
    String string = "";
        for (int i = 0 ; i< list.size() ; i++) {
            string = string + list.get(i).getShapeName()+" ";

        }
    return string;

    }
}
