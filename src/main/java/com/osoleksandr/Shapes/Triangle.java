package com.osoleksandr.Shapes;

import com.osoleksandr.Conventor.XmlTags;

public class Triangle extends Shape {

    XmlTags tags;

    private String name = "Triangle";
    private int edgeA;
    private int edgeB;
    private int edgeC;
    private int perimeter;

    public Triangle(int edgeA, int edgeB, int edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;

        perimeter = edgeA + edgeB + edgeC;
    }

    @Override
    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append(tags.getShapeOpenTag());
        sb.append(tags.getNameOpenTag()).append(getName()).append(tags.getNameCloseTag());
        sb.append(tags.getSideAOpenTag()).append(getEdgeA()).append(tags.getSideACloseTag());
        sb.append(tags.getSideBOpenTag()).append(getEdgeB()).append(tags.getSideBCloseTag());
        sb.append(tags.getSideCOpenTag()).append(getClass()).append(tags.getSideCCloseTag());
        sb.append(tags.getShapeCloseTag());
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public int getEdgeA() {
        return edgeA;
    }

    public int getEdgeB() {
        return edgeB;
    }

    public int getEdgeC() {
        return edgeC;
    }

    public int getPerimeter() {
        return perimeter;
    }
}
