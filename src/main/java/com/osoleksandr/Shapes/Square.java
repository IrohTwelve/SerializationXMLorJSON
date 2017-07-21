package com.osoleksandr.Shapes;

import com.osoleksandr.Conventor.XmlTags;

public class Square extends Shape {

    XmlTags tags;

    private String name = "Square";
    private int sideA;
    private int perimeter;

    public Square(int a) {
        sideA = a;
        perimeter = a * 4;
    }

    @Override
    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append(tags.getShapeOpenTag());
        sb.append(tags.getNameOpenTag()).append(getName()).append(tags.getNameCloseTag());
        sb.append(tags.getSideAOpenTag()).append(getSideA()).append(tags.getSideACloseTag());
        sb.append(tags.getPerimeterOpenTag()).append(getPerimeter()).append(tags.getPerimeterCloseTag());
        sb.append(tags.getShapeCloseTag());
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public int getSideA() {
        return sideA;
    }

    public int getPerimeter() {
        return perimeter;
    }
}
