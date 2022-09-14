package com.josekisystems.api.stream.ejemplos;


import java.util.stream.Stream;

public class EjemplosStreamReduce {
    public static void main(String[] args) {
        //1
        System.out.println(" === Reduce ===");
        Stream<String> nombres = Stream
                .of("Rorro Lacrau", "Bibi lacrau", "Laika Lacrau", "Laika Lacrau","Laika Lacrau","Laika Lacrau")
                .distinct();
                
                String resultado = nombres.reduce("resultado  = ",(a,b)-> a + " # "+b);
        System.out.println( resultado);
                

    }
}

