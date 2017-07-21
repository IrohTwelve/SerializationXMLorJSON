package com.osoleksandr.Conventor;

import java.util.ArrayList;
import java.util.List;

public class XmlTags implements Tags {

    public List<String> xmlTags = new ArrayList<String>();

    public XmlTags() {

        xmlTags.add(0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        xmlTags.add(1, "<name>");
        xmlTags.add(2, "</name>");
        xmlTags.add(3, "<perimeter>");
        xmlTags.add(4, "</perimeter>");
        xmlTags.add(5, "shape");
        xmlTags.add(6, "/shape");
        xmlTags.add(7, "group");
        xmlTags.add(8, "/group");
        xmlTags.add(9, "<radius>");
        xmlTags.add(10, "</radius>");
        xmlTags.add(11, "<sideA>");
        xmlTags.add(12, "</sideA>");
        xmlTags.add(13, "<sideB>");
        xmlTags.add(14, "</sideB>");
        xmlTags.add(15, "<sideC>");
        xmlTags.add(16, "</sideC>");

    }

    public String getHeader() {
        return xmlTags.get(1);
    }

    public String getGroupOpenTag() {
        return xmlTags.get(7);
    }

    public String getGroupCloseTag() {
        return xmlTags.get(8);
    }

    public String getNameOpenTag() {
        return xmlTags.get(1);
    }

    public String getNameCloseTag() {
        return xmlTags.get(2);
    }

    public String getShapeOpenTag() {
        return xmlTags.get(5);
    }

    public String getShapeCloseTag() {
        return xmlTags.get(6);
    }

    public String getRadiusOpenTag() {
        return xmlTags.get(9);
    }

    public String getRadiusCloseTag() {
        return xmlTags.get(10);
    }

    public String getPerimeterOpenTag() {
        return xmlTags.get(3);
    }

    public String getPerimeterCloseTag() {
        return xmlTags.get(4);
    }

    public String getSideAOpenTag() {
        return xmlTags.get(11);
    }

    public String getSideACloseTag() {
        return xmlTags.get(12);
    }

    public String getSideBOpenTag() {
        return xmlTags.get(13);
    }

    public String getSideBCloseTag() {
        return xmlTags.get(14);
    }

    public String getSideCOpenTag() {
        return xmlTags.get(15);
    }

    public String getSideCCloseTag() {
        return xmlTags.get(16);
    }

}
