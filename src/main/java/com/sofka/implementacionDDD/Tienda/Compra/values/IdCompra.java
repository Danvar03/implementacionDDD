package com.sofka.implementacionDDD.Tienda.Compra.values;

import co.com.sofka.domain.generic.Identity;

public class IdCompra extends Identity {
    public IdCompra(String uuid) {
        super(uuid);
    }

    public IdCompra() {
    }

    public static IdCompra of(String id) {
        return new IdCompra(id);
    }
}