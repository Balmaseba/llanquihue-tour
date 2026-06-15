package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {

        GestorDatos gestor = new GestorDatos();
        //Cargamos la lista desde el archivo ubicado en el paquete resources
        ArrayList<Tour> misTour = gestor.cargarTour("src/resources/tour.txt");

        System.out.println("-----CATÁLOGO DE TOURS-----");
        for (Tour t : misTour) {
            System.out.println(t.toString());
        }
        //Creamos un filtro
        System.out.println("\n------FILTRO: TOUR DE PESCA------");
        for (Tour t : misTour) {
            if(t.getTipo().equalsIgnoreCase("Pesca")) {
                System.out.println("Encontrado: " + t.getNombre());
            }
        }

        //Creamos un segundo filtro para experimentar
        System.out.println("\n-----FILTRO: MÁS BARATO------");

        if(!misTour.isEmpty()){

            Tour menorPrecio = misTour.get(0);

            for(Tour t: misTour) {
                if (t.getPrecio() < menorPrecio.getPrecio()){
                    menorPrecio = t;
                }
            }

            System.out.println("Nombre: " + menorPrecio.getNombre() + "|"
                    + " Tipo de tour: " + menorPrecio.getTipo() + "|"
                    + " Valor del tour: " + menorPrecio.getPrecio());

        }

    }
}