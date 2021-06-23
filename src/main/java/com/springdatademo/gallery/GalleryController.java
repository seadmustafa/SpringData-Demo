package com.springdatademo.gallery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class GalleryController {

    @Autowired
    private GalleryService galleryService;

    @GetMapping("/galleries")
    public List<Gallery> getAllGalleries() {
        return galleryService.getAllGalleries();
    }

    @GetMapping("/galleries/{id}")
    public Optional<Gallery> getGallery(@PathVariable("id") String id) {
        return galleryService.getGallery(id);
    }

    @PostMapping(value = "/galleries")
    public void addGallery(@RequestBody Gallery gallery) {
        galleryService.addGallery(gallery);
    }

    @PutMapping(value = "/galleries/{id}")
    public void updateGallery(@RequestBody Gallery gallery, @PathVariable String id) {
        galleryService.updateGallery(id, gallery);
    }

    @DeleteMapping(value = "/galleries/{id}")
    public void deleteGallery(@PathVariable String id) {
        galleryService.deleteGallery(id);
    }

    @GetMapping("/galleries/by-description/{description}")
    public Gallery getGalleryByDescription(@PathVariable String description) {
        return galleryService.getGalleryByDescription(description);
    }
}
