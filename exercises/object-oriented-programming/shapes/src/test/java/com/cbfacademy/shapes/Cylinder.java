package com.cbfacademy.shapes;

public class Cylinder extends Shape {

    public Cylinder(double radius, double height) {
      this.height = height;
      this.radius = radius;
    }

    @Override
    public double getArea() {
      return (height * Math.PI * (radius*radius));
    }
  }