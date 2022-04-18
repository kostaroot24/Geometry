package com.kostaroot.shapes;


import com.kostaroot.calculation.AreaMeasurable;
import com.kostaroot.calculation.PerimeterMeasurable;
import com.kostaroot.verchines.Vertice2D;

import java.util.List;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    public PlaneShape (List<Vertice2D> vertice2DS, String name){
        super(vertice2DS,name);
    }

    public String toString(){
        return super.toString()+ "area = "+ getArea()+
                "\n Perimeter= "+ getPerimeter();
    }

}
