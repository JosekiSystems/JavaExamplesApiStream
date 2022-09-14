package com.josekisystems.api.stream.ejemplos;


import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFlatMap {
    public static void main(String[] args) {

        //1
        System.out.println(" === 1 Flat Map === ");
        Stream<Usuario> nombres = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau_1", "Laika Llacrau_2","Laika Llacrau_3")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .flatMap(u ->{
                    if(u.getNombre().equalsIgnoreCase("Laika")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                });
        //.peek(System.out::println);
        nombres.forEach(System.out::println);

        //2
        System.out.println(" === 2 Flat Map Count=== ");
        Stream<Usuario> nombres2 = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau_1", "Laika Llacrau_2","Laika Llacrau_3")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .flatMap(u ->{
                    if(u.getNombre().equalsIgnoreCase("Laika")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                });
        System.out.println("nombres2.count() = " + nombres2.count());


    }
}

