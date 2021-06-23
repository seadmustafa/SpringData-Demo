package com.springdatademo.gallery;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GalleryService {

    @Autowired
    GalleryRepository galleryRepository;

    public List<Gallery> getAllGalleries() {
        return galleryRepository.findAll();
    }

    public Optional<Gallery> getGallery(String id) {
        return galleryRepository.findById(id);
    }

    public void addGallery(Gallery gallery) {
        galleryRepository.save(gallery);
    }

    public void updateGallery(String id, Gallery gallery) {
        galleryRepository.save(gallery);
    }

    public void deleteGallery(String id) {
        galleryRepository.deleteById(id);
    }

    public Gallery getGalleryByDescription(String description) {
        return galleryRepository.findGalleryByDescription(description);
    }
}
