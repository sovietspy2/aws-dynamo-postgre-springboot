package com.example.awsdynamospringboot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "person")
public class Person {
    private String name;
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;

}
