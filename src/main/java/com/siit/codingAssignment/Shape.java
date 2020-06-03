package com.siit.codingAssignment;

import java.util.ArrayList;

import static com.siit.codingAssignment.DrawingTool.shapes;

public interface Shape {

     double perimeterValue();

     double areaValue();

     public static double getTotalPerimeter(ArrayList<Shape> shapes) {
          double totalPerimeter = 0;
          for (Shape shape : shapes) {
               totalPerimeter += shape.perimeterValue();
          }
          return totalPerimeter;
     }

     public static void addShape(Shape shape) {
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
}
