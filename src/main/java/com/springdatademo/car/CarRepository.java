package com.springdatademo.car;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, String> {

    List<Car> findByGalleryId(String id);

    List <Car> findByBrand(String brand);

    List <Car> findByModel(String model);

}
