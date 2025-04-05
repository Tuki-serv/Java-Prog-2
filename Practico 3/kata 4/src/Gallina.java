public class Gallina {
    // Atributos privados (encapsulamiento)
    private final String idGallina;  // final porque no debe cambiar después de creación
    private int edad;
    private int huevosPuestos;

    // Constructor
    public Gallina(String idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0;  // Inicialmente no ha puesto huevos
    }

    // Métodos de comportamiento
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("¡" + idGallina + " ha puesto un huevo! Total: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println(idGallina + " ahora tiene " + edad + " años.");
    }

    public void mostrarEstado() {
        System.out.println("\nEstado de " + idGallina + ":");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }

    // Getters
    public String getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }
}