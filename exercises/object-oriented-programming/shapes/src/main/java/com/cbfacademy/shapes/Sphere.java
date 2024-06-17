package com.cbfacademy.shapes;

public abstract class Shape {

  protected String name;

  public abstract double getArea();
  
  public String getName() {
    return this.name;
  }
}

public class Sphere extends Shape {

  private double radius;

  public Sphere(double radius) {
    this.name = "Sphere";
    this.radius = radius; 
  }

  @Override
  public double getArea() {
    
  }
}

public class Rectangle extends Shape {
  
  private double length;
  private double width; 

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
  
  @Override
  public double getArea() {
    return length * width;
  }

}

public class Cylinder extends Shape {

  private double height;

  public Cylinder(double radius, double height) {
    this.height = height;
  }

  @Override
  public double getArea() {
    return height
  }
}