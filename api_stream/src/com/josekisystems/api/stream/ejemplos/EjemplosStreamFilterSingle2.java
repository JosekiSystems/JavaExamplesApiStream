package com.josekisystems.api.stream.ejemplos;


import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamFilterSingle2 {
    public static void main(String[] args) {
        //1
        System.out.println(" === ID Filter.peek ===");
        Usuario usuario = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau", "Nina Nlacrua1","Nina Nlacrua2")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(7))
                .findFirst().orElseGet(() -> new Usuario("Laikita","Price"));

        System.out.println(" === ID Filter.get ===");
        System.out.println(usuario);


    }
}

