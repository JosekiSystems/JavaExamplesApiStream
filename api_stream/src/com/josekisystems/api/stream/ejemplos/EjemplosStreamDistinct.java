package com.josekisystems.api.stream.ejemplos;


import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamDistinct {
    public static void main(String[] args) {
        //1
        System.out.println(" === Distinct ===");
        Stream
                .of("Rorro Lacrau", "Bibi lacrau", "Laika Lacrau", "Laika Lacrau","Laika Lacrau","Laika Lacrau")
                .distinct()
                .forEach(System.out::println);

    }
}

