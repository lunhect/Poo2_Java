package es.fplumara.dam1.restaurante;

public class Postre extends ProductoMenu {

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


        if (esCasero) {
            return precioBase + 1.50;
        } else {
            return precioBase;
        }
    }


    @Override
    String ticketLine() {
        return "[POSTRE]" + nombre + "(casero:" + (esCasero ? "SI" : "NO") + ")" + "| base: " + precioBase + "€ |" +"total: "  +precioFinal();
    }
                                                    //  esCasero (? "si es casero" + incremento + : "si no" no

}
