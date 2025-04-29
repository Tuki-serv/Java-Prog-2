import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Granja Digital de Gallinas ===");

        // Crear dos gallinas con IDs únicos
        Gallina gallina1 = new Gallina("G-001", 1);
        Gallina gallina2 = new Gallina("G-002", 2);

        // Menú de interacción
        boolean salir = false;
        while (!salir) {
            System.out.println("\nOpciones:");
            System.out.println("1. Hacer que Gallina 1 ponga huevo");
            System.out.println("2. Hacer que Gallina 2 ponga huevo");
            System.out.println("3. Hacer envejecer a todas las gallinas");
            System.out.println("4. Mostrar estado de todas");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gallina1.ponerHuevo();
                    break;
                case 2:
                    gallina2.ponerHuevo();
                    break;
                case 3:
                    gallina1.envejecer();
                    gallina2.envejecer();
                    break;
                case 4:
                    gallina1.mostrarEstado();
                    gallina2.mostrarEstado();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}