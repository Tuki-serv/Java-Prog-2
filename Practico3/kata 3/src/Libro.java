import java.time.Year;

public class Libro {
    // Atributos privados (encapsulamiento estricto)
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion); // Usamos el setter para validación
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // Setter con validación
    public void setAñoPublicacion(int nuevoAño) {
        int añoActual = Year.now().getValue();
        if (nuevoAño >= 1900 && nuevoAño <= añoActual) {
            this.añoPublicacion = nuevoAño;
        } else {
            System.out.println("Error: El año debe estar entre 1900 y " + añoActual + ".");
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("\nInformación del libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
    }
}