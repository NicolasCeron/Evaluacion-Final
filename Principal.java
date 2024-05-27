
package EvaluacionFinal;

public class Principal {
    public static void main(String[] args) {
        
        FabricadeTrajes fabrica = new FabricadeTrajes(){};
        
        fabrica.menu();
        fabrica.añadirComponenteAAlmacen();
        fabrica.añadirComponenteAAlmacen();
        fabrica.añadirComponenteAAlmacen();
        fabrica.listarComponentes();
    }
}
//ClasePrueba prueba = new ClasePrueba(){};
        
        //prueba.menu();
