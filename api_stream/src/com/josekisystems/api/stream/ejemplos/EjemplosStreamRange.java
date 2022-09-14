package com.josekisystems.api.stream.ejemplos;


import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemplosStreamRange {
    public static void main(String[] args) {
        //1
        System.out.println(" === Integer:: SUM ===");
        IntStream numeros = IntStream.range(5,20).peek(System.out::println);

        int resultado = numeros.reduce(0, Integer::sum); //int resultado = nombres.reduce(0,(a,b)-> a+b );
        System.out.println("Sumatorria 1 = "+ resultado);
        //2

        System.out.println(" ===  numeros.sum closed ===");
        IntStream numeros2 = IntStream.rangeClosed(5,20).peek(System.out::println);
        int resultado2 = numeros2.sum();
        System.out.println("Sumatoria 2 = " + resultado2);

        //3

        System.out.println(" === SummaryStatistics Open ===");
        IntStream numeros3 = IntStream.range(5,20);
        IntSummaryStatistics stats = numeros3.summaryStatistics();
        System.out.println("stats.getMax() = " + stats.getMax());
        System.out.println("stats.getMin() = " + stats.getMin());
        System.out.println("stats.getSum() = " + stats.getSum());
        System.out.println("stats.getAverage() = " + stats.getAverage());
        System.out.println("stats.getCount() = " + stats.getCount());


    }
}

