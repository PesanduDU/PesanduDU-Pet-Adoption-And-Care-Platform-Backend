package com.lovingtails.lovingTailBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PetDTO {

    private int id;
    private String type;
    private String breed;
    private String name;
    private String gender;
    private int age;
    private String color;
    private String description;
    private String ownerName;
    private String ownerMobileNumber;
}
