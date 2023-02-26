package com.gallery.gallerymicroservice.Repository;

import com.gallery.gallerymicroservice.Model.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery,Long> {
}
