package com.springdatademo.car;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<Car> getAllCars(String id) {
        return carRepository.findByGalleryId(id);
    }

    public Optional<Car> getCar(String id) {
        return carRepository.findById(id);
    }

    public void addCar(Car car) {
        carRepository.save(car);
    }

    public void updateCar(Car car) {
        carRepository.save(car);
    }

    public void deleteCar(String id) {
        carRepository.deleteById(id);
    }

}
