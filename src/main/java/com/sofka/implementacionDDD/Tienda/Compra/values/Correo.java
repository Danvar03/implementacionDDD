package com.sofka.implementacionDDD.Tienda.Compra.values;


import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Correo implements ValueObject<String> {

    private final String correo;

    public Correo(String correo) {
        if(correo.length()>100){
            throw new IllegalArgumentException("El correo no puede superar los 100 caracteres");
        }
        if(correo.length()<8){
            throw new IllegalArgumentException("El correo no puede ser inferior a los 8 caracteres");
        }
        this.correo = Objects.requireNonNull(correo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Correo correo1 = (Correo) o;
        return Objects.equals(correo, correo1.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correo);
    }

    @Override
    public String value() {
        return null;
    }
}
