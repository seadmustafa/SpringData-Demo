package com.springdatademo.car;

import java.util.List;
import java.util.Optional;

import com.springdatademo.gallery.Gallery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/galleries/{galleryId}/cars")
    public List<Car> getAllCars(@PathVariable("galleryId") String galleryId) {
        return carService.getAllCars(galleryId);
    }

    @GetMapping("/galleries/{galleryId}/cars/{id}")
    public Optional<Car> getCar(@PathVariable("id") String id) {
        return carService.getCar(id);
    }

    @PostMapping(value = "/galleries/{galleryId}/cars")
    public void addCar(@RequestBody Car car, @PathVariable("galleryId") String galleryId) {
        car.setGallery(new Gallery(galleryId, "", ""));
        carService.addCar(car);
    }

    @PutMapping(value = "/galleries/{galleryId}/cars")
    public void updateCar(@RequestBody Car car) {
        carService.updateCar(car);
    }

    @DeleteMapping(value = "/galleries/{galleryId}/cars/{id}")
    public void deleteCar(@PathVariable String id) {
        carService.deleteCar(id);
    }

}
