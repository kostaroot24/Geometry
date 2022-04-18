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

    @Override
    public String toString() {
        return super.toString() +
                "z=" + z +
                '}';
    }


    public double getDistance( Vertice3D vertex ) {
        return Math.sqrt(Math.pow(super.getX()-vertex.getX(),2) + Math.pow(super.getY()-vertex.getY(),2)+
                Math.pow(this.getZ() - vertex.getZ(),2));
    }
}
