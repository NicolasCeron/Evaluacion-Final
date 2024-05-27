
package EvaluacionFinal;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;


public class FabricadeTrajes implements IFabricadeTrajes{
     public ArrayList<Componente> componentesEnAlmacen;
     public TreeSet<Traje> Traje;
     public boolean sonRebajas =false;

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================");
        System.out.print("MENU FABRICA DE TRAJES\n");
        System.out.println("======================\n");
        System.out.println("1.- Añadir Componente a almacen");
        System.out.println("2.- Listar Componentes del almacen");
        System.out.println("3.- Crear traje y añadir a almacen");
        System.out.println("4.- Listar trajes del almacén");
        System.out.println("7.- Activar/Desactivar las rebajas");
        System.out.println("8.- Crear envio");
        System.out.println("9.- Crea componentes de prueba");
        System.out.println("0. - Salir    ");
        System.out.println("elige una opcion: ");
                int eleccion = scanner.nextInt();
    }
    
    @Override 
     public void añadirComponenteAAlmacen() { 
    Scanner scanner = new Scanner(System.in);
    componentesEnAlmacen=new ArrayList();
    
    System.out.print("¿Que tipo de componente desea añadir?  "
            + "\n 1.Falda \n 2.Chaqueta \n 3.Pantalon \n 4.Blusa \n");
        int opcion = scanner.nextInt();
 
    switch (opcion){
        case 1 -> {
            System.out.print("ID: ");
            int idFalda = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nombre: ");
            String nombreFalda = scanner.nextLine();
            System.out.print("Talla: ");
            String tallaFalda = scanner.nextLine();
            System.out.print("Color: ");
            String colorFalda = scanner.nextLine();
            System.out.print("Es comunitario? (Si/No): ");
            String comunitario = scanner.nextLine();
            boolean esComunitarioFalda = false;
            if (Objects.equals(comunitario, "Si")) {
                esComunitarioFalda = true;
            }
            System.out.print("Precio: ");
            double precioFalda = scanner.nextDouble();
            
            System.out.print("Tiene cremallera? (Si/No): ");
            String cremallera = scanner.nextLine();
            boolean conCremalleraFalda = false;
            if (Objects.equals(cremallera,"Si")) {
            conCremalleraFalda = true;
            }
             
            Falda falda = new Falda(idFalda, nombreFalda, tallaFalda, colorFalda, esComunitarioFalda, precioFalda, conCremalleraFalda);
            System.out.println("Falda: "+falda);
            System.out.println("componente añadido correctamente");
            componentesEnAlmacen.add(falda);
        }
        
        case 2 -> {
            System.out.print("ID: ");
            int idChaqueta = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nombre: ");
            String nombreChaqueta = scanner.nextLine();
            System.out.print("Talla: ");
            String tallaChaqueta = scanner.nextLine();
            System.out.print("Color: ");
            String colorChaqueta = scanner.nextLine();
            System.out.print("¿Es comunitario? (Si/No): ");
            String comunitario = scanner.nextLine();
            boolean esComunitarioChaqueta = false;
            if (Objects.equals(comunitario, "Si")) {
                esComunitarioChaqueta = true;
            }            
            System.out.print("Precio: ");
            double precioChaqueta = scanner.nextDouble();
            System.out.print("numero de botones: ");
            int botonesChaqueta = scanner.nextInt();
            
            Chaqueta chaqueta = new Chaqueta(botonesChaqueta, idChaqueta, nombreChaqueta, tallaChaqueta, colorChaqueta, esComunitarioChaqueta, precioChaqueta);
            System.out.println("Falda: "+chaqueta);
            System.out.println("componente añadido correctamente");        
            componentesEnAlmacen.add(chaqueta);
        }
        case 3 -> {
            System.out.print("ID: ");
            int idPantalon = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nombre: ");
            String nombrePantalon = scanner.nextLine();
            System.out.print("Talla: ");
            String tallaPantalon = scanner.nextLine();
            System.out.print("Color: ");
            String colorPantalon = scanner.nextLine();
            System.out.print("¿Es comunitario? (Si/No)");
            String comunitario = scanner.nextLine();
            boolean esComunitarioPantalon = false;
            if(Objects.equals(comunitario, "si")){
                esComunitarioPantalon = true;
            }
            System.out.print("Precio: ");
            double precioPantalon = scanner.nextDouble();
            System.out.print("¿Tiene cremallera? (Si/No)");
            String cremallera = scanner.nextLine();
            boolean conCremallera = false;
            if(Objects.equals(cremallera, "si")){
                conCremallera = true;
            }

            Pantalon pantalon = new Pantalon(conCremallera, idPantalon, nombrePantalon, tallaPantalon, colorPantalon, esComunitarioPantalon, precioPantalon);
            System.out.println("Falda: "+pantalon);
            System.out.println("componente añadido correctamente");        
            componentesEnAlmacen.add(pantalon);
        }
        case 4 -> {
            System.out.print("ID: ");
            int idBlusa = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nombre: ");
            String nombreBlusa = scanner.nextLine();
            System.out.print("Talla: ");
            String tallaBlusa = scanner.nextLine();
            System.out.print("Color: ");
            String colorBlusa = scanner.nextLine();
            System.out.print("¿Es comunitario? (Si/No) ");
            String comunitario = scanner.nextLine();
            boolean esComunitarioBlusa = false;
            if(Objects.equals(comunitario, "Si")){
                esComunitarioBlusa = true;
            }
            System.out.print("Precio: ");
            double precioBlusa = scanner.nextDouble();
            System.out.print("¿Tiene Manga larga? (Si/No) ");
            String mangaLarga = scanner.nextLine();
            boolean conMangaLarga = false;
            if(Objects.equals(mangaLarga, "si")){
                conMangaLarga = true; 
            }
            Blusa blusa = new Blusa(conMangaLarga, idBlusa, nombreBlusa, tallaBlusa, colorBlusa, esComunitarioBlusa, precioBlusa);
            System.out.println("Falda: "+blusa);
            System.out.println("componente añadido correctamente");        
            componentesEnAlmacen.add(blusa);
        }    
        default -> {
            System.out.println("Tipo de componente no válido.");
        }
    }
     
    }
            
     @Override
    public void listarComponentes(){
        String reporte="";
            for(int Componente=0;Componente<componentesEnAlmacen.size();Componente++){
                reporte+=componentesEnAlmacen.get(Componente).toString();
            }
    }

    @Override
    public void añadirTrajeAAlmacen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listarTrajes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void activarDesactivarRebajas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void crearEnvío() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultarEnvio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
