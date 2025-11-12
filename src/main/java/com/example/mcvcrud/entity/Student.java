package com.example.mcvcrud.entity;

import com.example.mcvcrud.enums.GENDER;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "full_name",nullable = false)
    private String fullName;

    @Column(name = "age",nullable = false)
    private Integer age;

    @Column(name = "gender")
    private GENDER gender;

}
