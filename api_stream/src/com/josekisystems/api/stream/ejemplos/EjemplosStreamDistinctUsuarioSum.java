package com.josekisystems.api.stream.ejemplos;


import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemplosStreamDistinctUsuarioSum {
    public static void main(String[] args) {
        //1
        System.out.println(" === maptoInt ===");
        IntStream nombres = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau","Laika Llacrau" ,"Laika Llacrau")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u ->u.toString().length());

        nombres.forEach(System.out::println);

        //2
        System.out.println(" === SUM ===");
        IntStream nombres2 = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau","Laika Llacrau" ,"Laika Llacrau")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u ->u.toString().length())
        .peek(System.out::println);

        System.out.println("sum() = " + nombres2.sum());

        //3
        System.out.println(" === SummaryStatics ===");
        IntStream nombres3 = Stream
                .of("Rorro Lacrau", "Bibi Blacrau", "Laika Llacrau","Laika Llacrau" ,"Laika Llacrau")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u ->u.toString().length());

        IntSummaryStatistics stats = nombres3.summaryStatistics();
        System.out.println("Sum() = " + stats.getSum());
        System.out.println("Max() = " + stats.getMax());
        System.out.println("Min() = " + stats.getMin());
        System.out.println("Count() = " + stats.getCount());
        System.out.println("statstoString() = " + stats.toString());


    }
}

