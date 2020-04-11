package com.siit.codingAssignment;


import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Square implements Shape {
    private double sideLength;

    @Override
    public double perimeterValue() {
        return sideLength * sideLength;
    }

    @Override
    public double areaValue() {
        return 4 * sideLength;
    }
}
