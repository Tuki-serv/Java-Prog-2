public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        setNombre(nombre);
        setApellido(apellido);
        setCurso(curso);
        setCalificacion(calificacion);
    }

    public void mostrarInfo (){
        System.out.println("Nombre: "+getNombre()+" | Apellido: "+getApellido());
        System.out.println("Curso: "+getCurso());
        System.out.println("Calificación: "+getCalificacion());
    }

    public void subirCalificacion (double puntos) {
        if (puntos + this.calificacion > 10) {
            System.out.println("supera la nota maxima 10");
        } else {
            this.calificacion += puntos;
        }
    }

    public void bajarCalificacion(double puntos) {
        if (this.calificacion - puntos < 0)  {
            System.out.println("es menor a la nota min 0");
        } else {
            this.calificacion -= puntos;
        }
    }

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
        if (calificacion < 0) {
            System.out.println("Valor negativo, por favor igrese una valor valido");
        } else if (calificacion > 10) {
            System.out.println("Valor no valido, ingrese valores que no superen a 10");
        } else {
            this.calificacion = calificacion;
        }
    }
}
