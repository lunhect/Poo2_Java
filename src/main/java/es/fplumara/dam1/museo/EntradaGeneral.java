package es.fplumara.dam1.museo;

import java.time.LocalDate;

public class EntradaGeneral extends Entrada {
    private String zonaVIP;

    private int nivelPrioridad;

    public EntradaGeneral(String id, double precioBase, LocalDate fecha) {
       super(id, precioBase, fecha);
       this.zonaVIP = zonaVIP;
        this.nivelPrioridad = nivelPrioridad;
    }

    @Override
    double precioFinal() {
        return 0;
    }

    @Override
    String descripcion() {
        return "";
    }

}
