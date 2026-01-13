package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa extends ProductoMenu implements Personalizable {

    //Atributo
    List<String> nombresExtras;
    List<Double> costesExtras;


    private String tipoCarne;


    protected Hamburguesa(String id, String nombre, double precioBase, String tipoCarne) throws IllegalAccessException {
        super(id, nombre, precioBase);
        this.tipoCarne = tipoCarne;

        //constructor de los Arrays

        nombresExtras = new ArrayList<>();
        costesExtras = new ArrayList<>();


        // el blank  en listas es = empty en vez de blank
        if (tipoCarne == null || tipoCarne.isBlank()) {

            throw new IllegalArgumentException("Illegal argument exception");
        }


    }


    @Override
    public void addExtra(String nombreExtra, double coste) {
        if (nombreExtra == null || nombreExtra.isBlank()) {
            throw new IllegalArgumentException("El nombreExtra no puede ser ni nulo ni vacío");

        }

        if (coste <= 0) {

            throw new IllegalArgumentException("El coste debe ser mayor a cero!");

        }

        nombresExtras.add(nombreExtra);
        costesExtras.add(coste);


    }


    @Override
    public double precioFinal() {
        double totalExtras = 0; //acumulo precio extras

        for (double coste : costesExtras) {
            totalExtras += coste;
        }

        return precioBase + totalExtras;
    }


    @Override
    public String ticketLine() {

        return "[HAMBURGUESA]" + nombre + "(carne:" + tipoCarne + ")" + "| base:" + precioBase + "€" + "| extras:" + nombresExtras.size() + "| total:" + precioFinal() + "€";
    }
}
















