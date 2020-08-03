
package Modelo;

public class Libro {
    private int idlibro;
    private String titulo;
    private int cantidad;
    private int anio;
    private double precio;
    private String estado;
    
    //Constructor Vacio
    public Libro(){ 
    }
    public Libro(String titulo, int cantidad, int anio, double precio, String estado){ 
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.anio = anio;
        this.precio = precio;
        this.estado = estado;
    }

    public int getIdlibro() {
        return idlibro;
    }
    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    
}
