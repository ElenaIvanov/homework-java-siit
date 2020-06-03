package com.siit.codingAssignment;


import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@EqualsAndHashCode
@ToString
public class DrawingTool {
    public DrawingTool dt = new DrawingTool();
    public static List<Shape> shapes = new ArrayList<>();

    static {
        shapes.add(new Circle(8));
        shapes.add(new Square(14));
        shapes.add(new Triangle(5, 7, 12, 11, 10));
        shapes.add(new Rectangle(8, 14));
        shapes.add(new Square(6));
    }


    public double getTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.areaValue();
        }
        return totalArea;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status = true;

        while (status) {
            System.out.println("Select A to add a shape.");
            System.out.println("Select B to display all area and perimeters.");
            System.out.println("Select C to display total area and perimeters.");
            System.out.println("Select D to exit the program.");
            String optionSelected = scanner.next();

            switch (optionSelected) {

                case "A":
                    System.out.println("Choose the type of shape you want to add.");
                    String typeOfShape = scanner.next();

                case "Circle": {
                    System.out.println("Input radius value:");
                    double radius = scanner.nextDouble();
                    shapes.add(new Circle(radius));
                    break;
                }
                case "Triangle": {
                    System.out.println("Input base, hight and length1, length2, length3 values for computing both area and perimeter.");
                    double base = scanner.nextDouble();
                    double hight = scanner.nextDouble();
                    double length1 = scanner.nextDouble();
                    double length2 = scanner.nextDouble();
                    double length3 = scanner.nextDouble();
                    shapes.add(new Triangle(base, hight, length1, length2, length3));
                    break;
                }
                case "Rectangle": {
                    System.out.println("Input length and width:");
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    shapes.add(new Rectangle(length, width));
                    break;
                }
                case "Square": {
                    System.out.println("Input length value:");
                    double length = scanner.nextDouble();
                    shapes.add(new Square(length));
                    break;
                }
                break;
                case "B":
                    for (Shape shapes : shapes) {
                        System.out.println("Area: " + shapes.areaValue() + ", " + "Perimeter: " + shapes.getTotalPerimeter());
                    }
                    break;

                case "C":
                    System.out.println("Total surface: ");
                    System.out.println("Total perimeter: ");
                    break;
                case "D":
                    status = false;
                    break;
            }

        }


    }

}
