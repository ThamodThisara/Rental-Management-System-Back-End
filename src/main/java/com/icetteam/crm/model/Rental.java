package com.icetteam.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rental {
    private Integer id;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private LocalDate dueDate;
    private Double totalCost;
}
