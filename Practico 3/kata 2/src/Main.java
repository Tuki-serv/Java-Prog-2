import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos de la mascota
        System.out.println("Registro de Mascota");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Especie: ");
        String especie = scanner.nextLine();

        System.out.print("Edad inicial: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear el objeto Mascota
        Mascota mascota = new Mascota(nombre, especie, edad);

        // Menú interactivo
        boolean salir = false;
        while (!salir) {
            System.out.println("\nOpciones:");
            System.out.println("1. Cumplir años");
            System.out.println("2. Mostrar información");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    mascota.cumplirAnios();
                    break;
                case 2:
                    mascota.mostrarInfo();
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