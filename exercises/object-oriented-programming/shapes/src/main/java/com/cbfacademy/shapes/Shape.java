package com.cbfacademy.shapes;

public abstract class Shape {
  
  protected double radius;
  protected double length;
  protected double width;
  protected double height;

  abstract double getArea();

  String getName() {
    return this.getClass().getSimpleName();
  }
  
}