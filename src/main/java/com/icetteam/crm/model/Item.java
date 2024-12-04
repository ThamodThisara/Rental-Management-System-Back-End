package com.icetteam.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {
    private Integer id;
    private String name;
    private Double rentalPerDay;
    private Double finePerDay;
    private String availability;
}
