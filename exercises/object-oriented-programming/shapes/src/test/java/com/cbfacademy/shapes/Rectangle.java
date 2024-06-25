package com.cbfacademy.shapes;

public class Rectangle extends Shape {

    public Rectangle(double length, double width) { // constructor method
      this.length = length;
      this. width = width;
    }

    @Override
    public double getArea() {
      return (length * width);
    }
  }