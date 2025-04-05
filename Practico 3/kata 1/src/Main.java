import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Crear una instancia de Estudiante
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "Programación II", 7.5);

        // Mostrar información inicial
        estudiante1.mostrarInfo();

        // Subir calificación (debe pasar de 7.5 a 9.5)
        estudiante1.subirCalificacion(2.0);

        // Intentar subir más de 10 (debe fallar)
        estudiante1.subirCalificacion(1.5);

        // Bajar calificación (debe pasar de 9.5 a 8.0)
        estudiante1.bajarCalificacion(1.5);

        // Intentar bajar menos de 0 (debe fallar)
        estudiante1.bajarCalificacion(10.0);

        // Mostrar información final
        estudiante1.mostrarInfo();
    }
}