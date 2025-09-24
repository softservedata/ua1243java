package com.softserve.edu.orest.New.hw6;

public class ColorLine extends Line{

    private String color;

    public String getColor() {
        return color;
    }

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", " + super.toString();
    }
}
