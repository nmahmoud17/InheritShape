package com.company;

public class Circle extends Shape {

    private double radius;

    public Circle (String color, boolean filled, double radius) {
        super (color, filled);
        this.radius = radius;
    }

    public void getArea() {
        double i = radius;
        System.out.println("The circle's Area is: " + Math.pow(i, 2)* Math.PI);
    }

    public void getPerimeter() {
        System.out.println("The circle's perimeter is: " + 2*Math.PI*radius);
    }

    @Override
    public void printDetails() {
        getArea();
        getPerimeter();
    }
}
