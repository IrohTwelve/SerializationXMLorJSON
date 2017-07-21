package com.osoleksandr.Shapes;

import com.osoleksandr.Conventor.XmlTags;


public class Circle extends Shape {


    XmlTags tags;

    private String name = "Circle";
    private int radius;
    private int perimeter;

    public Circle(int radius) {
        this.radius = radius;
        perimeter = 2 * (int) Math.PI * radius;
    }

    @Override
    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append(tags.getShapeOpenTag());
        sb.append(tags.getNameOpenTag()).append(getName()).append(tags.getNameCloseTag());
        sb.append(tags.getRadiusOpenTag()).append(getRadius()).append(tags.getRadiusCloseTag());
        sb.append(tags.getPerimeterOpenTag()).append(getPerimeter()).append(tags.getPerimeterCloseTag());
        sb.append(tags.getShapeCloseTag());
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public int getPerimeter() {
        return perimeter;
    }
}

