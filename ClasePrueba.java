
package EvaluacionFinal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;


public class ClasePrueba implements IFabricadeTrajes{
     public ArrayList<Componente> componentesEnAlmacen;
     public TreeSet<Traje> Traje;
     public boolean sonRebajas =false;
        
    
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================");
        System.out.print("MENU FABRICA DE TRAJES\n");
        System.out.println("======================");
        System.out.println("1.- Añadir Componente a almacen");
        System.out.println("2.- Listar Componentes del almacen");
        System.out.println("3.- Crear traje y añadir a almacen");
        System.out.println("4.- Listar trajes del almacen");
        System.out.println("7.- Activar/Desactivar las rebajas");
        System.out.println("8.- Crear envio");
        System.out.println("9.- Crea componentes de prueba");
        System.out.println("0. - Salir    ");
        System.out.println("elige una opcion: ");
                int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1 -> {
                do {
                    System.out.print("¿Que tipo de componente desea añadir?  \n1.Falda \n2.Chaqueta \n3.Pantalon \n4.Blusa ");
                    int opcion = scanner.nextInt();

                    //crear componente
                    Componente componente;
                    switch (opcion) {
                        case 1 -> { //falda
                            System.out.print("ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nombre: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Talla: ");
                            String talla = scanner.nextLine();
                            System.out.print("Color: ");
                            String color = scanner.nextLine();
                            System.out.print("¿Es comunitario? (si/no)"); 
                            String answer = scanner.nextLine().toUpperCase();
                            boolean esComunitario = answer.equals("SI") ? true : false;
                            
                            System.out.print("Precio: ");
                            double precio = scanner.nextDouble();
                            System.out.print("¿Tiene cremallera? (si/no)");
                            String answer2 = scanner.nextLine().toUpperCase();
                            boolean conCremallera = answer2.equals("SI") ? true : false;
                            
                            componente = new Falda(conCremallera, id, nombre, talla, color, esComunitario, precio);
                            System.out.println("\nComponente falda añadido correctamente.");
                        }
                        case 2 -> {
                            System.out.print("ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nombre: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Talla: ");
                            String talla = scanner.nextLine();
                            System.out.print("Color: ");
                            String color = scanner.nextLine();
                            System.out.print("¿Es comunitario? ");
                            boolean esComunitario = scanner.nextBoolean();
                            System.out.print("Precio: ");
                            double precio = scanner.nextDouble();
                            System.out.print("numero de botones: ");
                            int botonesChaqueta = scanner.nextInt();
                            componente = new Chaqueta(botonesChaqueta, id, nombre, talla, color, esComunitario, precio);
                            componentesEnAlmacen.add(componente);
                            System.out.println("Componente añadido correctamente.");
                            System.exit(0);
                        }
                        case 3 -> {
                            System.out.print("ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nombre: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Talla: ");
                            String talla = scanner.nextLine();
                            System.out.print("Color: ");
                            String color = scanner.nextLine();
                            System.out.print("¿Es comunitario? ");
                            boolean esComunitario = scanner.nextBoolean();
                            System.out.print("Precio: ");
                            double precio = scanner.nextDouble();
                            System.out.print("¿Tiene cremallera? ");
                            boolean conCremallera = scanner.nextBoolean();
                            componente = new Pantalon(conCremallera, id, nombre, talla, color, esComunitario, precio);
                            componentesEnAlmacen.add(componente);
                            System.out.println("Componente añadido correctamente.");
                        }
                        case 4 -> {
                            System.out.print("ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nombre: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Talla: ");
                            String talla = scanner.nextLine();
                            System.out.print("Color: ");
                            String color = scanner.nextLine();
                            System.out.print("¿Es comunitario? ");
                            boolean esComunitario = scanner.nextBoolean();
                            System.out.print("Precio: ");
                            double precio = scanner.nextDouble();
                            System.out.print("¿Tiene Manga larga? ");
                            boolean conMangaLarga = scanner.nextBoolean();
                            componente = new Blusa(conMangaLarga, id, nombre, talla, color, esComunitario, precio);
                            componentesEnAlmacen.add(componente);
                            System.out.println("Componente añadido correctamente.");
                        }
                    }
                } while (eleccion != 7);
                scanner.close();
            }
            case 2 -> {
                ArrayList<Componente> componentesEnAlmacen = new ArrayList<>();
                // Verificar si la lista de componentes está vacía
                if (componentesEnAlmacen.isEmpty()) {
                    System.out.println("No hay componentes en el almacén.");
                }else{
                // Recorrer la lista de componentes
                    for (Componente componente : componentesEnAlmacen) {
                        // Mostrar la información de cada componente
                        System.out.println("=====================================" );
                        System.out.println("ID: " + componente.getId());
                        System.out.println("Nombre: " + componente.getNombre());
                        System.out.println("Talla: " + componente.getTalla());
                        System.out.println("Color: " + componente.getColor());
                        System.out.println("¿Es comunitario?: " + (componente.isEscomunitario() ? "Sí" : "No"));
                        System.out.println("Precio: $" + componente.getPrecio());
                        System.out.println("=====================================");
                    }
                }
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> {
            }
            case 6 -> {
            }
            case 7 -> {
            }
            case 8 -> {
            }
            case 9 -> {
            }
            case 0 -> {
                System.out.println("Saliendo del programa...");
                System.exit(0);
            }
            default ->
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }

public void añadirComponenteAAlmacen(Componente componente) { 
    Scanner scanner = new Scanner(System.in);
            System.out.print("¿Qué tipo de componente desea añadir?  1.Falda 2.Chaqueta 3.Pantalón 4.Blusa ");
              int opcion = scanner.nextInt();
            

    switch (opcion){
        case 1 -> {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Talla: ");
            String talla = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("¿Es comunitario? ");
            boolean esComunitario = scanner.nextBoolean();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("¿Tiene cremallera? ");
            boolean conCremallera = scanner.nextBoolean();
            componente = new Falda(conCremallera, id, nombre, talla, color, esComunitario, precio);
            componentesEnAlmacen.add(componente);
            System.out.println("Componente añadido correctamente.");
        }
        case 2 -> {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Talla: ");
            String talla = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("¿Es comunitario? ");
            boolean esComunitario = scanner.nextBoolean();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("numero de botones: ");
            int botonesChaqueta = scanner.nextInt();
            componente = new Chaqueta(botonesChaqueta, id, nombre, talla, color, esComunitario, precio);
            componentesEnAlmacen.add(componente);
            System.out.println("Componente añadido correctamente."); 
        }
        case 3 -> {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Talla: ");
            String talla = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("¿Es comunitario? ");
            boolean esComunitario = scanner.nextBoolean();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();

            System.out.print("¿Tiene cremallera? ");
            boolean conCremallera = scanner.nextBoolean();
            componente = new Pantalon(conCremallera, id, nombre, talla, color, esComunitario, precio);
            componentesEnAlmacen.add(componente);
            System.out.println("Componente añadido correctamente.");
        }
        case 4 -> {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Talla: ");
            String talla = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("¿Es comunitario? ");
            boolean esComunitario = scanner.nextBoolean();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();

            System.out.print("¿Tiene Manga larga? ");
            boolean conMangaLarga = scanner.nextBoolean();
            componente = new Falda(conMangaLarga, id, nombre, talla, color, esComunitario, precio);
            componentesEnAlmacen.add(componente);
            System.out.println("Componente añadido correctamente.");
        }    
        default -> {
            System.out.println("Tipo de componente no válido.");
        }
    }
    }

    public ClasePrueba() {
        this.sonRebajas = false;
    }

    @Override
    public void añadirComponenteAAlmacen() {
    }

    @Override
    public void listarComponentes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

