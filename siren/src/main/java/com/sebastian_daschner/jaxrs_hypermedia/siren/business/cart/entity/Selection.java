package com.sebastian_daschner.jaxrs_hypermedia.siren.business.cart.entity;

import javax.validation.constraints.Min;

public class Selection {

    @Min(1)
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
