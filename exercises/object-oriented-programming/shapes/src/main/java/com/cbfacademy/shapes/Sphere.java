package com.cbfacademy.shapes;

public class Sphere extends Shape {

        public Sphere(double radius) { // constructor method
          this.radius = radius;
        }
      
        @Override
        public double getArea() {
          return (4 * Math.PI * (radius*radius));
        }
      }

