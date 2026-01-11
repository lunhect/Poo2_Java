package es.fplumara.dam1.museo;

import java.time.LocalDate;

public  class EntradaEstudiante extends Entrada implements Descontable {
    private String centroEducativo;

    public String getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public EntradaEstudiante(String id, double precioBase, LocalDate fecha, String centroEducativo) {
        super(id, precioBase, fecha);
        this.centroEducativo = centroEducativo;
    }

    @Override
    public double aplicarDescuento(double descuento) {
        return 0;
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
