package com.gallery.gallerymicroservice.DTO;

public class AddProductToGalleryRequest {
        private Long id;
        private Long barcode;

        public AddProductToGalleryRequest(Long id, Long barcode) {
                this.id = id;
                this.barcode = barcode;
        }

        public Long getId() {
                return id;
        }

        public Long getBarcode() {
                return barcode;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public void setBarcode(Long barcode) {
                this.barcode = barcode;
        }
}
