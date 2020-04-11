package com.siit.codingAssignment;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor

public class Triangle implements Shape {
    private double base;
    private double hight;
    private double length1;
    private double length2;
    private double length3;

    @Override
    public double perimeterValue() {
        return (length1+length2+length3);
    }

    @Override
    public double areaValue() {
        double area = ((base * hight) / 2);
        return area;
    }
}
