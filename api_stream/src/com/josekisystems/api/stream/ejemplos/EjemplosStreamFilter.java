package com.josekisystems.api.stream.ejemplos;


import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamFilter {
    public static void main(String[] args) {
        //1
        System.out.println(" === 1 Stream Filter ===");
        Stream<Usuario> nombres = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau", "Nina Nlacrua_1","Nina Nlacrua_2")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Nina"));
                //.peek(System.out::println);

        //nombres.forEach((System.out::println) );
        System.out.println("nombres.count() = " + nombres.count());


    }
}

