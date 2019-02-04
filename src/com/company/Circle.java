package com.company;

public class Circle extends Shape {

    private double radius;

    public Circle (String color, boolean filled, double radius) {
        super (color, filled);
        this.radius = radius;
    }

    public void getArea() {
        double i = radius;
        System.out.println(Math.pow(i, 2)* Math.PI);
    }

    public void getPerimeter() {
        System.out.println(2*Math.PI*radius);
    }
}
