package com.kostaroot.shapes;

import com.kostaroot.verchines.Vertice;
import com.kostaroot.verchines.Vertice2D;

import java.util.List;

public class Shape {
    private final List vertexList;
    private final String name;

    public Shape ( List vertexList, String name ){
        this.vertexList = vertexList;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public List getVertexList(){
        return vertexList;
    }

    @Override
    public String toString() {
        return "vertexList=" + vertexList +
                ", Figure='" + name + '\'' ;
    }
}
