package com.siit.codingAssignment;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor

public class Rectangle implements Shape {
    private double length;
    private double width;

    @Override
    public double perimeterValue() {
        return  2 * length + 2 * width;
    }

    @Override
    public double areaValue() {
        return length * width;
    }
}
