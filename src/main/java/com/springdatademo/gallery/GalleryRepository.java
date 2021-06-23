package com.springdatademo.gallery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GalleryRepository extends JpaRepository<Gallery, String> {

    Gallery findGalleryByDescription(String description);

}