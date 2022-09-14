package com.josekisystems.api.stream.ejemplos;


import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamMap {
    public static void main(String[] args) {
        //1
        System.out.println(" === 1 Stream ToUppper ToLower ===");
        Stream<String> nombres = Stream
                .of("Rorro", "Bibi", "Laika", "Nina")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
            nombres.forEach(System.out::println);

        //2
        System.out.println(" === 2 List ===");
        Stream<String> nombres2 = Stream.of("Rorro2", "Bibi2", "Laika2", "Nina2");
        List<String> lista = nombres2.collect(Collectors.toList());
        lista.forEach(System.out::println);

        //3
        System.out.println(" === 3 Usuario Stream ToUpper ===");
        Stream<Usuario> nombres3 = Stream
                .of("Rorro3 Lacraur", "Bibi3 Lacraub", "Laika3 Lacraul", "Nina3 Lacraun")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(u-> System.out.println(u.getNombre()))
                .peek(u-> System.out.println(u.getApellido()))
                        .map(usuario->{String nombre= usuario.getNombre().toLowerCase();
                        usuario.setNombre(nombre);
                        return usuario;
        });
        List<Usuario> lista2 = nombres3.collect(Collectors.toList());
        System.out.println(" === 3 Usuario List ToLower ===");
        lista2.forEach(u-> System.out.println(u.getNombre()));
        lista2.forEach(u-> System.out.println(u.getApellido()));

        //3
        System.out.println(" === 3.1 Usuario Stream  ===");
        Stream<Usuario> nombres31;
        nombres31 = Stream
                .of("Rorro31 Lacraurr", "Bibi31 Lacraubb", "Laika31 Lacraull", "Nina31 Lacraunn")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario-> {
            String nombre31 = usuario.getNombre().toUpperCase();
            usuario.setNombre(nombre31);
            usuario.setApellido(nombre31);
            return usuario;
        });
        List<Usuario> lista31 = nombres31.collect(Collectors.toList());
        System.out.println(" === 3.1 Usuario List toUpper ===");
        lista31.forEach(System.out::println);



    }
}

