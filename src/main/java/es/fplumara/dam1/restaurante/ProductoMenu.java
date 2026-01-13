package es.fplumara.dam1.restaurante;

public  abstract class ProductoMenu {
    private String id;
    private String nombre;
    private double precioBase;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    protected ProductoMenu(String id, String nombre, double precioBase) throws IllegalAccessException {
     this.id = id;
     this.nombre =nombre;
     this.precioBase = precioBase;


         //
          //El blank sirve como trim + empty
         if (id == null || id.isBlank()) {
             throw new IllegalAccessException("Id no puede ser ni núlo ni vacio");

         }

         //revisar, no entiendo lo del precio
         if (precioBase <= 0 ) {

               throw new IllegalAccessException("IllegalArgumentException");
           }

           if (nombre == null || nombre.isBlank()) {

               throw new IllegalAccessException("IllegalArgumentException");

           }


     }
    abstract  double precioFinal();
    abstract String ticketLine();
}
