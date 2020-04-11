package com.siit.codingAssignment;

import lombok.*;


@ToString
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Circle implements Shape {
    private double radius;

    public double perimeterValue() {
        return 2* Math.PI * radius;
    }

    public double areaValue() {
        return  Math.PI * radius * radius;
    }

}
