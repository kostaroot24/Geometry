package com.kostaroot.verchines;

public class Vertice3D extends Vertice2D{

    private double z;

    public Vertice3D( double x, double y, double z ){
        super(x,y);
        this.z = z;
    }

    public double getZ(){
        return z;
    }
}
