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
  
  public class Sphere extends Shape {

    public Sphere(double radius) { // constructor method
      this.radius = radius;
    }
  
    @Override
    public double getArea() {
      return (4 * Math.PI * (radius*radius));
    }
  }

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

  public class Cylinder extends Shape {

    public Cylinder(double radius, double height) {
      this.height = height;
    }

    @Override
    public double getArea() {
      return (height * Math.PI * (radius*radius));
    }
  }

  }