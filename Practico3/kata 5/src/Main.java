import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SIMULADOR DE NAVES ESPACIALES ===");
        NaveEspacial nave = new NaveEspacial("Enterprise", 50);

        boolean salir = false;
        while (!salir) {
            System.out.println("\nOpciones:");
            System.out.println("1. Despegar (consume 10 unidades)");
            System.out.println("2. Avanzar");
            System.out.println("3. Recargar combustible");
            System.out.println("4. Mostrar estado");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    nave.despegar();
                    break;
                case 2:
                    System.out.print("Distancia a avanzar: ");
                    int distancia = scanner.nextInt();
                    nave.avanzar(distancia);
                    break;
                case 3:
                    System.out.print("Unidades a recargar: ");
                    int cantidad = scanner.nextInt();
                    nave.recargarCombustible(cantidad);
                    break;
                case 4:
                    nave.mostrarEstado();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Finalizando simulación...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}