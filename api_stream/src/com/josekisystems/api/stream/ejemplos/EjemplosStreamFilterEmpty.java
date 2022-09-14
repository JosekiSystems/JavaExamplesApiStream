package com.josekisystems.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemplosStreamFilterEmpty {
    public static void main(String[] args) {
        //1
        System.out.println(" === 1 Stream FilterEmpty ===");

       long count = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau", "Nina Nlacrua1","")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count);

    }
}

