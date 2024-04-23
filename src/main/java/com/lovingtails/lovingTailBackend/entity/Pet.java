package com.lovingtails.lovingTailBackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pet {

    @Id
    private int id;
    private String type;
    private String breed;
    private String name;
    private String gender;
    private int age;
    private String color;
    private String description;
    private String latitude;
    private  String longitude;
    private String ownerName;
    private String ownerMobileNumber;

}
