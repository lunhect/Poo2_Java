package es.fplumara.dam1.restaurante;

import java.util.List;

public class Hamburguesa extends ProductoMenu, implements Personalizable {

   //Alm
    private List<String> nombresExtras;
    private List<Double> costesExtras;



    private String tipoCarne;


    protected Hamburguesa(String id, String nombre, double precioBase, String tipoCarne) throws IllegalAccessException {
        super(id, nombre, precioBase);
        this.tipoCarne = tipoCarne;

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

  //guardar internamente



    }

    @Override
    double precioFinal() {
        return 0;
    }

    @Override
    String ticketLine() {
        return"";
    }
}
















