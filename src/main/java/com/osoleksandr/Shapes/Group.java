package com.osoleksandr.Shapes;

import com.osoleksandr.Conventor.XmlTags;

import java.util.ArrayList;
import java.util.List;

public class Group extends Shape {

    XmlTags tags;
    List<Shape> groupOfShapes = new ArrayList<Shape>();

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append(tags.getGroupOpenTag());
        for (int i = 0; i < groupOfShapes.size(); i++) {
            sb.append(groupOfShapes.get(i).toXML());
        }
        sb.append(tags.getGroupCloseTag());
        return sb.toString();
    }
}
