package co.com.choucair.certificacion.autostoreexito.interactions;

import java.util.ArrayList;

public class ListProd {
    public ArrayList<String> productos = new ArrayList<>();

    public ListProd() {

    }

    public ArrayList getProductos() {
        return productos;
    }

    public void setProductos(ArrayList productos) {
        this.productos = productos;
    }

    public void add(String p){
        productos.add(p);
    }

    public void mostrar(){
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
    }
}
