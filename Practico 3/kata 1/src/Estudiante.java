public class Estudiante {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor para inicializar los atributos
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Método para mostrar información del estudiante
    public void mostrarInfo() {
        System.out.println("Información del estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    // Método para subir la calificación (máximo 10)
    public void subirCalificacion(double puntos) {
        if (calificacion + puntos <= 10) {
            calificacion += puntos;
            System.out.println("Calificación aumentada a: " + calificacion);
        } else {
            System.out.println("No se puede superar la calificación máxima (10).");
        }
    }

    // Método para bajar la calificación (mínimo 0)
    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos >= 0) {
            calificacion -= puntos;
            System.out.println("Calificación reducida a: " + calificacion);
        } else {
            System.out.println("No se puede tener una calificación negativa.");
        }
    }

    // Getters y Setters (opcional, pero buena práctica)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        } else {
            System.out.println("La calificación debe estar entre 0 y 10.");
        }
    }
}