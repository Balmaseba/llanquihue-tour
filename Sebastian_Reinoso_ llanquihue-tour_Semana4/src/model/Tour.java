package model;

public class Tour {
    private String nombre;
    private String tipo;
    private int precio;

    //Creamos constructor vacío

    public Tour(){
    }

    //Creamos constructor para todos los datos

    public Tour (String nombre, String tipo, int precio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    //Creamos getter y setter para acceso controlado


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Generamos el toString()

    @Override
    public String toString() {
        return "Nombre: '" + nombre + '\'' + "|" +
                ", Tipo de tour: '" + tipo + '\'' + "|" +
                ", Valor del tour: $" + precio;
    }
}
