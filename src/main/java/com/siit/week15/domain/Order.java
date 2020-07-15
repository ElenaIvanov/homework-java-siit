package com.siit.week15.domain;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
public class Order {

    private int orderNumber;
    private String comments;
    private int customerNumber;
    private LocalDate orderDate;
    private LocalDate requiredDate;
    private LocalDate shippedDate;
    private String status;
}
