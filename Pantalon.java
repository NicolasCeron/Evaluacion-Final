

package EvaluacionFinal;

public class Pantalon extends Componente {
    boolean conCremallera;

    public Pantalon(boolean conCremallera, int id, String nombre, String talla, String color, boolean escomunitario, double precio) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.conCremallera = conCremallera;
    }

    public boolean isConCremallera() {
        return conCremallera;
    }

    public void setConCremallera(boolean conCremallera) {
        this.conCremallera = conCremallera;
    }

    @Override
    public String toString() {
        return  "Pantalon en almacen{" + 
                "\n id= " + id + 
                "\n nombre= " + nombre + 
                "\n talla= " + talla + 
                "\n color= " + color + 
                "\n es comunitario= " + escomunitario + 
                "\n precio= " + precio +
                "\n conCremallera=" + conCremallera + '}';
    }
    
}
