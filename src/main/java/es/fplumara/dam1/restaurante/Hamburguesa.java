package es.fplumara.dam1.restaurante;

public class Hamburguesa extends ProductoMenu, implements Personalizable {

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

    }

    @Override
    double precioFinal() {
        return 0;
    }

    @Override
    String ticketLine() {
        return "[HAMBURGUESA] <nombre> (carne: <tipoCarne>) | base: <precioBase>€ | extras: <N> | total: <precioFinal>€";
    }
}
















