package es.fplumara.dam1.restaurante;

public class Ensalada extends ProductoMenu implements Personalizable, AptoPara {
    private TamanoEnsalada tamanoEnsalada;


    @Override
    public boolean esApto(String restricción) {
        return false;
    }




    public Ensalada(String id, String nombre, double precioBase, TamanoEnsalada tamanoEnsalada) throws IllegalAccessException {
        super(id, nombre, precioBase);
        this.tamanoEnsalada = tamanoEnsalada;

     //VALIDACIONES //MIRAR EN CASA

     String tamano = tamanoEnsalada.toString().toUpperCase(); //Convierte a mayusculas

      if (!tamano.equalsIgnoreCase("MEDIANA")  && !tamano.equalsIgnoreCase("GRANDE") {

          throw new IllegalArgumentException("El tamano debe ser o MEDIANA o GRANDE! ");
        }


    }

    @Override
    public void addExtra(String nombreExtra, double coste) {

    }

    @Override
    public String ticketLine() {
        return "";
    }

    @Override
    double precioFinal() {
        return 0;
    }
}
