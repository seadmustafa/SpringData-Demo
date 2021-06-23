package com.springdatademo.car;


import com.springdatademo.gallery.Gallery;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Car {

    @Id
    private String id;
    private String brand;
    private String model;
    @ManyToOne
    private Gallery gallery;



}