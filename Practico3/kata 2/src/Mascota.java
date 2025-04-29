public class Mascota {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar información de la mascota
    public void mostrarInfo() {
        System.out.println("\nInformación de la mascota:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Método para aumentar la edad en 1 año
    public void cumplirAnios() {
        edad++;
        System.out.println("¡Feliz cumpleaños! Ahora " + nombre + " tiene " + edad + " años.");
    }

    // Getters (opcional, pero buena práctica)
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }
}