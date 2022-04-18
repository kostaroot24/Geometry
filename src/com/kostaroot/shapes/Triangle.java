package com.kostaroot.shapes;

import com.kostaroot.verchines.Vertice2D;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Triangle extends PlaneShape{
    public Triangle (Vertice2D a,Vertice2D b,Vertice2D c){
        super(Arrays.asList(a,b,c),"Triangle");
    }

    @Override
    public double getPerimeter() {
        List<Vertice2D> list = this.getVertexList();
        return list.get(0).getDistance(list.get(1)) + list.get(0).getDistance(list.get(2))+
                list.get(1).getDistance(list.get(2));
    }

    @Override
    public double getArea() {
        List<Vertice2D> list = this.getVertexList();
        return Math.sqrt(this.getPerimeter()/2*(this.getPerimeter() - list.get(0).getDistance(list.get(1)))*
                (this.getPerimeter() - list.get(0).getDistance(list.get(2)))*
                (this.getPerimeter() - list.get(1).getDistance(list.get(2))));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
