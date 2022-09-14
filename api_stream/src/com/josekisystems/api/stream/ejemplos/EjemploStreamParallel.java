package com.josekisystems.api.stream.ejemplos;

import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
    public static void main(String[] args) {

        //1
        System.out.println(" === 1 Parallel & PrintTime ===");

        List<Usuario> lista3 = new ArrayList<>();
        lista3.add(new Usuario("Rorro","Lacrau"));
        lista3.add(new Usuario("Bibi","Lacrau"));
        lista3.add(new Usuario("Laika","Lacrau"));
        lista3.add(new Usuario("Nina","Lacrau"));
        lista3.add(new Usuario("Alice","Lacrau"));
        lista3.add(new Usuario("Andrés","Guzmán"));
        lista3.add(new Usuario("Bruce","Lee"));
        lista3.add(new Usuario("Bruce","Willis"));

        long t1 = System.currentTimeMillis();


        String resultado = lista3.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n ->{
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName()
                    + " _ "+ n);
                })
                .flatMap(nombre3 ->{
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(nombre3.contains("Bruce".toUpperCase())){
                        return Stream.of(nombre3);
                    }
                    return Stream.empty();
                })
                        .findAny().orElse(" ");

        long t2 = System.currentTimeMillis();

        System.out.println("Tiempo Total : " + (t2-t1));
        System.out.println(resultado);
    }



}
