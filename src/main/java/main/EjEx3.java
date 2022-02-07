package main;

import entidades.Libro;
import servicio.ServiLibro;

public class EjEx3 {

    public static void main(String[] args) {

        Libro lib1 = new Libro();
        ServiLibro lib = new ServiLibro();
        /*lib.crearLibro();
        
        
        if (lib.Prestamo() == true) {
            System.out.println("Se ha prestado el libro");
        } else {
            System.out.println("El libro no puede ser prestado");
        }
        if (lib.Devolucion() == true) {
            System.out.println("Ha devuelto el libro");
        } else {
            System.out.println("El libro no se encuentra prestado");
        }
        lib.mostrarLibros();
        //lib.Menu();
        
               /*int opc = 0;

        do {
            System.out.println("Que desea hacer");
            System.out.println("1_Agregar libro");
            System.out.println("2_Prestar un libro");
            System.out.println("3_Devolver un libro");
            System.out.println("4_Mostrar catalogo");
            System.out.println("5_Salir");

            switch (opc) {
                case 1: {
                    lib.crearLibro();
                }
                break;
                case 2: {
                    if (lib.Prestamo() == true) {
                        System.out.println("Se ha prestado el libro");
                    } else {
                        System.out.println("El libro no puede ser prestado");
                    }
                }
                break;
                case 3: {
                    if (lib.Devolucion() == true) {
                        System.out.println("Ha devuelto el libro");
                    } else {
                        System.out.println("El libro no se encuentra prestado");
                    }
                }
                break;
                case 4: {
                    lib.mostrarLibros();
                }
                break;
            }
        } while (opc != 5);*/
               //lib.crearLibro();
          lib.Menu(lib1);
               
    }

}
