package com.josekisystems.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerate {
    public static void main(String[] args) {
        //1
        System.out.println(" === 1 Stream Generate Limit sleep + Count (Atomic Integer) ===");
        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "Hola Mundo"+" num =  "+contador.incrementAndGet();
                })
                .limit(5)
                .forEach(System.out::println);
    }
}
