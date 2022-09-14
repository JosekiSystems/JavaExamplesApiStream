package com.josekisystems.api.stream.ejemplos;


import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamDistinctUsuario {
    public static void main(String[] args) {
        //1
        System.out.println(" === 1 Stream Filter ===");
        Stream<Usuario> nombres = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau","Laika Llacrau" ,"Laika Llacrau")

                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct();

        nombres.forEach(System.out::println);

    }
}

