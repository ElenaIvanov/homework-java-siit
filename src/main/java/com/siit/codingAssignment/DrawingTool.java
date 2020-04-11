package com.siit.codingAssignment;


import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@EqualsAndHashCode
@ToString
public class DrawingTool {
    DrawingTool dt = new DrawingTool();
    public static final List<Shape> shapes = new ArrayList<>();

    static {
        shapes.add(new Circle(10));
        shapes.add(new Square(123));
        shapes.add(new Triangle(12, 15, 12, 11, 1));
        shapes.add(new Rectangle(12, 32));
        shapes.add(new Square(15));
    }

    public void addShape(Shape shape) {
        boolean key = false;
        for (Shape shapeS : shapes) {
            if (shapeS.equals(shape)) {
                throw new IllegalArgumentException();
            } else {
                key = true;
            }
        }
        if (key) {
            shapes.add(shape);
        }
    }

    public double getTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.areaValue();
        }
        return totalArea;
    }

    public double getTotalPerimeter(ArrayList<Shape> shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.perimeterValue();
        }
        return totalPerimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status = true;

        while (status) {
            System.out.println("Select 1 to add a shape.");
            System.out.println("Select 2 to display all area and perimeters.");
            System.out.println("Select 3 to display total area and perimeters.");
            System.out.println("Select 0 to exit the program.");
            String optionSelected = scanner.next();

            switch (optionSelected) {

                case "1":
                    System.out.println("Choose the type of shape you want to add.");
                    String typeOfShape = scanner.next();

                case "Circle": {
                    System.out.println("Enter radius value:");
                    double radius = scanner.nextDouble();
                    shapes.addShape(new Circle(radius));
                    break;
                }


            }
        }


    }

}
