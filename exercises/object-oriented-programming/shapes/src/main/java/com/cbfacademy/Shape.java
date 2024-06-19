package com.cbfacademy.shapes;

public abstract class Shape {
  
  protected double radius;

  abstract double getArea();

  String getName() {
    return this.getClass().getSimpleName();
  }
  

