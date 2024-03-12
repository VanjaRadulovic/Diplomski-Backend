package com.example.demo.model.business;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BusinessAddress {
    private String streetName;
    private String cityName;
    private String zipCode;
    private String country;
}