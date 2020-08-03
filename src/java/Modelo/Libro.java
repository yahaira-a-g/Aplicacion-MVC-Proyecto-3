
package Modelo;

public class Libro {
    private int idlibro;
    private String titulo;
    private String cantidad;
    private String anio;
    private String precio;
    private String estado;
    
    //Constructor Vacio
    public Libro(){ 
    }
    public Libro(String titulo, String cantidad, String anio, String precio, String estado){ 
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    
}
