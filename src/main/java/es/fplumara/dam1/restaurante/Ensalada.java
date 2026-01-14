package es.fplumara.dam1.restaurante;
import java.util.List;
import java.util.ArrayList;


public class Ensalada extends ProductoMenu implements Personalizable, AptoPara {

    private TamanoEnsalada tamanoEnsalada;
    private List<String> nombresExtras = new ArrayList<>();
    private List<Double> costesExtras = new ArrayList<>();

    public Ensalada(String id, String nombre, double precioBase, TamanoEnsalada tamanoEnsalada) throws IllegalAccessException {

        super(id, nombre, precioBase);

        if (tamanoEnsalada == null) {
            throw new IllegalArgumentException("El tamaño no puede ser nulo");
        }
        this.tamanoEnsalada = tamanoEnsalada;
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
    public String ticketLine() {



        return "[ENSALADA]" + nombre +"(tamano:" + tamanoEnsalada + ")" + "| base:" + precioBase + "€" +"| incTam:"  + getTamanoEnsalada() +"€" + "| extras:" + nombresExtras.size() + "| total:"+ precioFinal() + "€";
    }


 private double getIncrementoTamano() {

        return (tamanoEnsalada == tamanoEnsalada.GRANDE) ? 2 : 0;
    }

    //Metodo privado, operador ternario el equivalente en if esle sería:
    // if tamanoEnsalada.GRANDE = incremento 2.0 else incremento 0.0




    public double precioFinal() {
        double totalExtras = 0; //acumulo precio extras

        for (double coste : costesExtras) {
            totalExtras += coste;
        }
        double incrementoTamano = 0.0;
        if (tamanoEnsalada == TamanoEnsalada.GRANDE) {
            incrementoTamano = 2.0;
        }
        return precioBase + totalExtras + incrementoTamano;
    }

    //USANDO STREAM

    /*  public double precioFinal() {
    public double precioFinal() {
    return precioBase
           + costesExtras.stream().mapToDouble(Double::doubleValue).sum()
           + (tamanoEnsalada == TamanoEnsalada.GRANDE ? 2.0 : 0.0);
          }
           }
*/


    @Override
    public boolean esApto(String restriccion) {

        if (restriccion == null) {
            throw new IllegalArgumentException("Restricción no válida");
        }

        if (restriccion.equalsIgnoreCase("VEGETARIANO")) {
            return true;
        } else if (restriccion.equalsIgnoreCase("VEGANO")) {
            return nombresExtras.isEmpty();
        } else {
            throw new IllegalArgumentException("RIllegalArgumentException");
        }
    }

    public TamanoEnsalada getTamanoEnsalada() {
        return tamanoEnsalada;
    }

    public void setTamanoEnsalada(TamanoEnsalada tamanoEnsalada) {
        this.tamanoEnsalada = tamanoEnsalada;
    }
}











