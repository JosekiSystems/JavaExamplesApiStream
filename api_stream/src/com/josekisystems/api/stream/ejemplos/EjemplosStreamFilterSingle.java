package com.josekisystems.api.stream.ejemplos;


import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamFilterSingle {
    public static void main(String[] args) {
        //1
        System.out.println(" === 1 Stream Filter ===");
        Stream<Usuario> nombres = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau", "Nina Nlacrua1","Nina Nlacrua2")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Nina"))
                .peek(System.out::println);

        //2
        /*
        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(" === 2 Optional Filter findFirst ===");
        System.out.println(usuario.get());
         */

        //3
        /*
        Optional<Usuario> usuario2 = nombres.findFirst();
        System.out.println(" === 3 Optional Filter findFirst or Else ===");
        System.out.println(usuario2.orElse(new Usuario("Estella","Augusto")));
         */

        //4
        /*
        Optional<Usuario> usuario3 = nombres.findFirst();
        System.out.println(" === 4 Optional Filter findFirst or ElseGet ===");
        System.out.println(usuario3.orElseGet(()->new Usuario("Estella2","Augusto2")));

         */
        //5
        Optional<Usuario> usuario4 = nombres.findFirst();
        System.out.println(" === 5 Optional Filter Is Present ===");
        if(usuario4.isPresent()){
            System.out.println(usuario4);
            System.out.println(usuario4.get().getNombre());
            System.out.println(usuario4.get().getApellido());
        }else{
            System.out.println("No se encotró el usuario");
        }

    }
}

