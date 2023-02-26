package com.gallery.gallerymicroservice.DTO;

import java.util.List;

public class GalleryDto {
    private String name;
    private List<Long> ids;

    public GalleryDto(String name, List<Long> ids) {
        this.name = name;
        this.ids = ids;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public String getName() {
        return name;
    }

    public List<Long> getIds() {
        return ids;
    }
}
