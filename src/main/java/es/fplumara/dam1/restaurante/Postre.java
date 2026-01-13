package es.fplumara.dam1.restaurante;

public class Postre extends ProductoMenu{

    private boolean esCasero;

    public Postre(String id, String nombre, double precioBase, boolean esCasero) throws IllegalAccessException {
        super(id, nombre, precioBase);
        this.esCasero = esCasero;
    }

    public boolean isEsCasero() {
        return esCasero;
    }

    public void setEsCasero(boolean esCasero) {
        this.esCasero = esCasero;
    }

    @Override
    double precioFinal() {
        return 0;
    }

    @Override
    String ticketLine() {
        return "";
    }


}
