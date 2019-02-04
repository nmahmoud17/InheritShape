package com.company;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle (String color, boolean filled, double width, double length) {
        super (color, filled);
        this.width = width;
        this.length = length;
    }

    public void getArea(){
        System.out.println("Your area is: " + width*length);
    }

    public void getPerimeter(){
        System.out.println("Your perimeter is: " + (width * 2) +(length*2));
    }

    @Override
    public void printShape(){
        getArea();
        getPerimeter();
    }

}
