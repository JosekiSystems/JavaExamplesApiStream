package com.josekisystems.api.stream.ejemplos;

import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        //1
        System.out.println(" === 1 List to Stream to UpperCase  ===");

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Rorro","Lacrau"));
        lista.add(new Usuario("Bibi","Lacrau"));
        lista.add(new Usuario("Laika","Lacrau"));
        lista.add(new Usuario("Nina","Lacrau"));
        lista.add(new Usuario("Alice","Lacrau"));
        lista.add(new Usuario("Andrés","Guzmán"));

        lista.stream().map(u -> u.getNombre().toUpperCase()
                .concat(" ")
                .concat(u.getApellido().toUpperCase()))
        .forEach(System.out::println);

        //2
        System.out.println(" === 2 List to Stream to UpperCase FlatMap toLowerCase ===");

        List<Usuario> lista2 = new ArrayList<>();
        lista2.add(new Usuario("Rorro","Lacrau"));
        lista2.add(new Usuario("Bibi","Lacrau"));
        lista2.add(new Usuario("Laika","Lacrau"));
        lista2.add(new Usuario("Nina","Lacrau"));
        lista2.add(new Usuario("Alice","Lacrau"));
        lista2.add(new Usuario("Andrés","Guzmán"));
        lista2.add(new Usuario("Bruce","Lee"));
        lista2.add(new Usuario("Bruce","Willis"));


        lista2.stream().map(u -> u.getNombre().toUpperCase()
                .concat(" ")
                .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre2 ->{
                    if(nombre2.contains("Bruce".toUpperCase())){
                        return Stream.of(nombre2);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .forEach(System.out::println);

        //3
        System.out.println(" === 3 peek & Count ===");

        List<Usuario> lista3 = new ArrayList<>();
        lista3.add(new Usuario("Rorro","Lacrau"));
        lista3.add(new Usuario("Bibi","Lacrau"));
        lista3.add(new Usuario("Laika","Lacrau"));
        lista3.add(new Usuario("Nina","Lacrau"));
        lista3.add(new Usuario("Alice","Lacrau"));
        lista3.add(new Usuario("Andrés","Guzmán"));
        lista3.add(new Usuario("Bruce","Lee"));
        lista3.add(new Usuario("Bruce","Willis"));


        Stream<String> nombres3 = lista3.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre3 ->{
                    if(nombre3.contains("Bruce".toUpperCase())){
                        return Stream.of(nombre3);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);
        System.out.println(nombres3.count());
    }
}
