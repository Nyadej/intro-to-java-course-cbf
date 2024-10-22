package com.cbfacademy.shapes;

import java.util.List;

public class Shapes {
    public static double computeArea(List<Enclosure> shapes) {
        return shapes.stream().mapToDouble(Enclosure::area).sum();
    }

    public static double computePerimeter(List<Enclosure> shapes) {
        return shapes.stream().mapToDouble(Enclosure::perimeter).sum();
    }

    public static void main(String[] args) {
        List<Enclosure> shapes = List.of(
                new Square(20), new Square(4), new Square(12),
                new Circle(15), new Circle(10), new Circle(5)
        );

        System.out.println("Total Area: " + computeArea(shapes));
        System.out.println("Total Perimeter: " + computePerimeter(shapes));
    }
}
