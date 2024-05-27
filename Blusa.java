
package EvaluacionFinal;

public class Blusa extends Componente {
    boolean mangaLarga;

    public Blusa(boolean mangaLarga, int id, String nombre, String talla, String color, boolean escomunitario, double precio) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.mangaLarga = mangaLarga;
    }

    public boolean isMangaLarga() {
        return mangaLarga;
    }

    public void setMangaLarga(boolean mangaLarga) {
        this.mangaLarga = mangaLarga;
    }

    @Override
    public String toString() {
        return  "\n Blusa en almacen:" + 
                "\n id= " + id + 
                "\n nombre= " + nombre + 
                "\n talla= " + talla + 
                "\n color= " + color + 
                "\n es comunitario= " + escomunitario + 
                "\n precio= " + precio +
                "\n mangaLarga=" + mangaLarga+ 
                " ";
        
    }    
}
