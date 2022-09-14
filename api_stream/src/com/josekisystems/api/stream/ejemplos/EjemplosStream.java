package com.josekisystems.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Stream.builder;

public class EjemplosStream {
    public static void main(String[] args) {
        //1
        System.out.println(" === 1 ===");
        Stream<String> nombres = Stream.of("Rorro","Bibi","Laika","Nina");
        nombres.forEach(System.out::println);
        //2
        System.out.println(" === 2 ===");
        String[] arr = {"Rorro","Bibi","Laika","Nina"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);
        //3
        System.out.println(" === 3 ===");
        String[] arrr = {"Rorro","Bibi","Laika","Nina"};
        Stream<String> nombress = Arrays.stream(arrr);
        nombress.forEach(System.out::println);
        //4
        System.out.println(" === 4 ===");
        Stream<String> nombres2 = Stream.<String>builder()
                .add("Rorro")
                .add("Bibi")
                .add("Laika")
                .build();
        nombres2.forEach(System.out::println);
        //5
        System.out.println(" === 5 ===");
        List<String> lista = new ArrayList<>();
        lista.add("Bibi");
        lista.add("Rorro");
        lista.add("Laika");

        Stream<String> nombres3 = lista.stream();
        nombres3.forEach(System.out::println);
        //6
        System.out.println(" === 6 ===");
        List<String> lista2 = new ArrayList<>();
        lista2.add("Bibi");
        lista2.add("Rorro");
        lista2.add("Laika");

        lista2.stream().forEach(System.out::println);

    }
}

