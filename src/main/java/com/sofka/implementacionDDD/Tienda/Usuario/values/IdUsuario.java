package com.sofka.implementacionDDD.Tienda.Usuario.values;

import co.com.sofka.domain.generic.Identity;

public class IdUsuario extends Identity {
    public IdUsuario(String id) {
        super(id);
    }

    public IdUsuario() {
    }

    public static IdUsuario of(String id){
        return new IdUsuario(id);
    }
}