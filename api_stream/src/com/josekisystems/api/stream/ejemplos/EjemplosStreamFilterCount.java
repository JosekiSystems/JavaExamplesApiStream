package com.josekisystems.api.stream.ejemplos;


import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFilterCount {
    public static void main(String[] args) {
        //1
        System.out.println(" ===   Count  ===");
        long count = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau", "Nina Nlacrua1","Nina Nlacrua2")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(" ===  Count Value === ");
        System.out.println(count);


    }
}

