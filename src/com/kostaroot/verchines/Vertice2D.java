package com.kostaroot.verchines;

public class Vertice2D extends Vertice {
    private double x;
    private double y;

    public Vertice2D( double x, double y ){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance ( Vertice2D vertex ){
        return Math.sqrt(Math.pow( this.x - vertex.getX(),2 ) + Math.pow( this.y - vertex.getY(),2 ));
    }

    @Override
    public String toString() {
        return "Vertex: " +
                "x=" + x +
                ", y=" + y;
    }
}