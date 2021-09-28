package com.sofka.implementacionDDD.Tienda.VideoJuego.values;

import co.com.sofka.domain.generic.Identity;

public class IdVideojuego extends Identity {
    public IdVideojuego(String uuid) {
        super(uuid);
    }

    public IdVideojuego() {
    }

    public static IdVideojuego of(String id){
        return new IdVideojuego(id);
    }
}
