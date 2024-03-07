package co.com.choucair.certificacion.autostoreexito;

import co.com.choucair.certificacion.autostoreexito.interactions.ListProd;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ListProd l = new ListProd();

        l.add("f");
        l.add("f¿f");
        l.add("ggf");

        l.mostrar();
        /*String p = "";
        ArrayList productos = new ArrayList();
        for (int i = 0; i < 5; i++) {
            p = String.valueOf((int)(Math.random()*47+1));
            productos.add(p);
            //actor guarda el nombre del producto
            for (int j = 0; j < (int)(Math.random()*10+1); j++) {
                System.out.println("1");
            }

        }
        System.out.println("DDDDDDDDDDDD");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }

         */
    }
}