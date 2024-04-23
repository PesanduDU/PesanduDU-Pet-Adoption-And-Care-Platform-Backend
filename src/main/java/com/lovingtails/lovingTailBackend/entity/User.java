package com.lovingtails.lovingTailBackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private String mobileNum;
}
