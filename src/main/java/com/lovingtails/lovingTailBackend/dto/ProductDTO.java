package com.lovingtails.lovingTailBackend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {

    private int id;
    private String name;
    private String price;
    private String description;
}
