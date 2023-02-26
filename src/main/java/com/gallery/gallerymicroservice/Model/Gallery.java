package com.gallery.gallerymicroservice.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="gallery")
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false)
    private Long id;

    @Column(name="name")
    private String name;
    @ElementCollection
    private List<Long> productids;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductids(List<Long> productids) {
        this.productids = productids;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Long> getProductids() {
        return productids;
    }
}
