package com.gallery.gallerymicroservice.DTO;

public class ProductBarcodeDTO {
    private Long id;
    private String barcode;

    public ProductBarcodeDTO(Long id, String barcode) {
        this.id = id;
        this.barcode = barcode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getId() {
        return id;
    }

    public String getBarcode() {
        return barcode;
    }
}
