import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un libro con datos iniciales
        System.out.println("Registro de Libro");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Año de publicación: ");
        int año = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Libro libro = new Libro(titulo, autor, año);

        // Menú interactivo
        boolean salir = false;
        while (!salir) {
            System.out.println("\nOpciones:");
            System.out.println("1. Cambiar año de publicación");
            System.out.println("2. Mostrar información");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nuevo año de publicación: ");
                    int nuevoAño = scanner.nextInt();
                    scanner.nextLine();
                    libro.setAñoPublicacion(nuevoAño);
                    break;
                case 2:
                    libro.mostrarInfo();
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}