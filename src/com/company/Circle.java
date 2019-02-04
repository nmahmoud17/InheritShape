package com.company;

public class Circle extends Shape {

    private double radius;

    public Circle (String color, boolean filled, double radius) {
        super (color, filled);
        this.radius = radius;
    }
}
