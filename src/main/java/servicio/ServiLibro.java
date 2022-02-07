package servicio;

import entidades.Libro;
import java.util.*;


public class ServiLibro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashSet<Libro> libros = new HashSet();

    public Libro crearLibro() {

        Libro lib = new Libro();

        String opc = "";

        do {
            System.out.println("Ingrese titulo del libro");
            String Titulo = leer.next();
            System.out.println("Ingrese el autor");
            String Autor = leer.next();
            System.out.println("Ingrese el numero de ejemplares");
            Integer numEjemplares = leer.nextInt();
            Integer ejemplaresPrestados = 0;
            
            libros.add(new Libro(Titulo, Autor, numEjemplares, ejemplaresPrestados));

            System.out.println("Quiere agregar otro libro s/n");
            opc = leer.next();

        } while (!opc.equals("n"));

        lib.setEjemplaresPrestados(0);
        return new Libro(opc, opc, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean Prestamo(Libro aux) {
        System.out.println("Que libro quiere prestar");
        String libroPres = leer.next();
        //boolean cond = true;
       /* for (Libro a : libros) {
            if (libroPres.equals(aux.getTitulo()) && aux.getNumEjemplares() > 0) {
                aux.setNumEjemplares(aux.getNumEjemplares() - 1);
                aux.setEjemplaresPrestados(aux.getEjemplaresPrestados() + 1);
                return true;
            }
        }*/
       /* for (int i = 0; i < libros.size(); i++) {
            if (libroPres.equals(aux.getTitulo()) && aux.getNumEjemplares() > 0){
                aux.setNumEjemplares(aux.getNumEjemplares() - 1);
                aux.setEjemplaresPrestados(aux.getEjemplaresPrestados() + 1);
                cond = true;
            } else {
                cond = false;
            }
        }*/
       
       Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro a = it.next();
            if (libroPres.equals(a) && a.getNumEjemplares() > 0) {
                a.setNumEjemplares(a.getNumEjemplares() - 1);
                a.setEjemplaresPrestados(a.getEjemplaresPrestados() + 1);
                return true;
            }
        }
        return false;
    }

    public boolean Devolucion(Libro aux) {
        System.out.println("Que libro desea devolver?");
        String devoLib = leer.next();

        for (Libro a : libros) {
            if (devoLib.equals(aux.getTitulo()) && aux.getEjemplaresPrestados() > 0) {
                aux.setEjemplaresPrestados(aux.getEjemplaresPrestados() - 1);
                aux.setNumEjemplares(aux.getNumEjemplares() + 1);
                return true;
            }
        }
        return false;
    }

    public void mostrarLibros(Libro a) {
        System.out.println("La lista de libros es:");
        
        for (Libro aux : libros) {
            System.out.println(aux);
        }
    }

    public void Menu(Libro a) {
        int opc = 0;

        do {
            System.out.println("Que desea hacer");
            System.out.println("1_Agregar libro");
            System.out.println("2_Prestar un libro");
            System.out.println("3_Devolver un libro");
            System.out.println("4_Mostrar catalogo");
            System.out.println("5_Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1: {
                    crearLibro();
                }
                break;
                case 2: {
                    if (Prestamo(a)== true) {
                        System.out.println("Se ha prestado el libro");
                    } else {
                        System.out.println("El libro no puede ser prestado");
                    }
                }
                break;
                case 3: {
                    if (Devolucion(a)== true) {
                        System.out.println("Ha devuelto el libro");
                    } else {
                        System.out.println("El libro no se encuentra prestado");
                    }
                }
                break;
                case 4: {
                    mostrarLibros(a);
                }
                break;
            }
        } while (opc != 5);

    }
}
