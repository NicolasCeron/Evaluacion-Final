
package EvaluacionFinal;

import java.util.Objects;

public class Componente {
    int id;
    String nombre;
    String talla;
    String color;
    boolean escomunitario;
    double precio;

    public Componente(int id, String nombre, String talla, String color, boolean escomunitario, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.escomunitario = escomunitario;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEscomunitario() {
        return escomunitario;
    }

    public void setEscomunitario(boolean escomunitario) {
        this.escomunitario = escomunitario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Componente{" + "id=" + id + 
                ", nombre=" + nombre + 
                ", talla=" + talla + 
                ", color=" + color + 
                ", escomunitario=" + escomunitario + 
                ", precio=" + precio +
                '}';
    }

   
    @Override
    public boolean equals(Object id) { 
        if (this == id) return true; 
        if (id == null || getClass() != id.getClass()) return false; 
        Componente componente = (Componente)id; 
        return getId() == componente.getId(); }
   

    @Override
       public int hashCode() {
           return Objects.hash(getId());
       }

    public int compareTo(Componente o) {
        return Integer.compare(getId(), o.getId());
    }
}
