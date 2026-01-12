package es.fplumara.dam1.restaurante;

import es.fplumara.dam1.museo.Entrada;

import java.util.ArrayList;
import java.util.List;

public interface Personalizable {
    void addExtra(String nombreExtra, double coste );

    String ticketLine();
}
