package com.company;

public class Shape {

    private String color;
    private boolean filled;

    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void printShape() {
        System.out.println("The shapes color is: " + color);
        System.out.println("Is the shape filled? " + filled);
    }
}
