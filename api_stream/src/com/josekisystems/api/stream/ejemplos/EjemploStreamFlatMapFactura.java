package com.josekisystems.api.stream.ejemplos;

import com.josekisystems.api.stream.ejemplos.models.Factura;
import com.josekisystems.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        //1
        System.out.println(" === 1 Array (u1,u2) Descripcion ===");

        Usuario u1 = new Usuario("Rorro", "Lacrau");
        Usuario u2 = new Usuario("Bibi", "Lacrau");

        u1.addFactura(new Factura("compras tecnologias"));
        u1.addFactura(new Factura("reparación Automovil"));

        u2.addFactura(new Factura("costo por m"));
        u2.addFactura(new Factura("fotos de paisajes"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);

        for (Usuario u : usuarios) {
            for (Factura f : u.getFacturas()) {
                System.out.println(f.getDescripcion() + ", cliente :  " + u.getNombre());
            }
        }

        //2
        System.out.println(" === 2 FlatMap Descripcion ===");

        Usuario u3 = new Usuario("Laika", "Lacrau");
        Usuario u4 = new Usuario("Nina", "Lacrau");

        u3.addFactura(new Factura("compra croquetas"));
        u3.addFactura(new Factura("costo por espojosidad"));

        u4.addFactura(new Factura("concerts tickets"));
        u4.addFactura(new Factura("Trips tickets"));

        List<Usuario> usuarios2 = Arrays.asList(u3, u4);
                        usuarios2.stream()
                                .flatMap(u6 -> u6.getFacturas().stream())
                                .forEach(f3 -> System.out.println(f3.getDescripcion()
                                        .concat(", cliente :  ")
                                        .concat(f3.getUsuario().toString())));
        //3
        System.out.println(" === 3 Map Descripcion ===");

        Usuario u5 = new Usuario("Bruce", "Lee");
        Usuario u6 = new Usuario("Bruce", "Willies");

        u5.addFactura(new Factura("pans amarillo"));
        u5.addFactura(new Factura("chacos ninja"));

        u6.addFactura(new Factura("Multi pass"));
        u6.addFactura(new Factura("Soup Delivery"));

        List<Usuario> usuarios3 = Arrays.asList(u5, u6);
        usuarios3.stream()
                .map(Usuario::getFacturas)
                .flatMap(List::stream)
                .forEach(f5 ->System.out.println(f5.getDescripcion().concat(", cliente : ")
                        .concat(f5.getUsuario().toString())));

    }
}




