package com.kostaroot;

import com.kostaroot.shapes.Shape;
import com.kostaroot.shapes.Triangle;
import com.kostaroot.verchines.*;

public class Executor {

    public void run(){
        Vertice3D vertice3D = new Vertice3D(1,2,3);
        System.out.println("x= "+vertice3D.getX()+" y= "+vertice3D.getZ());
        System.out.println("Distance = "+vertice3D.getDistance(new Vertice3D(1,2,0)));

        Shape shape = new Triangle(new Vertice2D(0,0),new Vertice2D(2,0),new Vertice2D(0,2));
        System.out.println(shape.toString());
    }
}
