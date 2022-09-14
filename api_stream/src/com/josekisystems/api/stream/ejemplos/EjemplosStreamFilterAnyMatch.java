package com.josekisystems.api.stream.ejemplos;


import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFilterAnyMatch {
    public static void main(String[] args) {
        //1
        System.out.println(" ===   AnyMatch  ===");
        boolean existe = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau", "Nina Nlacrua1","Nina Nlacrua2")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(7));

        System.out.println(" ===  AnyMatch Value === ");
        System.out.println(existe);


    }
}

