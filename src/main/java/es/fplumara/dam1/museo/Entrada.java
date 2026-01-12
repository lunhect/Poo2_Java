package es.fplumara.dam1.museo;

import java.time.LocalDate;

public abstract class Entrada {
private String id;
private double precioBase;
private LocalDate fecha;

    protected Entrada(String id, double precioBase, LocalDate fecha) {
        this.id = id;
        this.precioBase = precioBase;
        this.fecha = fecha;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

// En el abstract se definen los metodos pero no se implementan

    //Defino el metodo precioFinal: no recibe nada, devuelve numero decimales

    abstract  double precioFinal();


    //Defino el metodo descripcion: no recibe nada, devuelve texto
    abstract  String descripcion();


}
