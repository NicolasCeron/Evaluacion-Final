
package EvaluacionFinal;

public class Chaqueta extends Componente {
    int numBotones; 

    public Chaqueta(int numBotones, int id, String nombre, String talla, String color, boolean escomunitario, double precio) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.numBotones = numBotones;
    }
    
    public int getNumBotones() {
        return numBotones;
    }

    public void setNumBotones(int numBotones) {
        this.numBotones = numBotones;
    }

    @Override
    public String toString() {
        return " Chaqueta{" + 
                "\n id= " + id + 
                "\n nombre= " + nombre + 
                "\n talla= " + talla + 
                "\n color= " + color + 
                "\n es comunitario= " + escomunitario + 
                "\n precio= " + precio +
                "\n numero de botones= " + numBotones +
                "\n}";

    }
    
}
