package com.company;

public class Main {

    public static void main(String[] args) {
        Shape myShape = new Shape("red", true);
        Circle myCircle = new Circle("blue", true, 5.5);
        Rectangle myRectangle = new Rectangle("green", true, 5, 10);

        myShape.printShape();

        System.out.println("--------------------");

        myCircle.printShape();

        System.out.println("--------------------");

        myRectangle.printShape();

    }
}
