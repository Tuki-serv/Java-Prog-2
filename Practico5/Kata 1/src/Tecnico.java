public class Tecnico {
    private static int contador;
    private int id;
    private String nombre;
    private String especialidad;
    private TicketSoporte ticket;

    public Tecnico(String nombre, String especialidad) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
