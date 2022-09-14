package com.josekisystems.api.stream.ejemplos;


import java.util.stream.Stream;

public class EjemplosStreamReduceInt {
    public static void main(String[] args) {
        //1
        System.out.println(" === SUM ===");
        Stream<Integer> nombres = Stream
                .of(5,10,15,20);

        int resultado = nombres.reduce(0, Integer::sum); //int resultado = nombres.reduce(0,(a,b)-> a+b );
        System.out.println( resultado);
                

    }
}

