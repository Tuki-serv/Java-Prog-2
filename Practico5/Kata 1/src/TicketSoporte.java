import java.time.LocalDateTime;

public class TicketSoporte {
    private static int contador;
    private int id;
    private Usuario usuario;
    private String descripcion;
    private EstadoTicket estado;
    private LocalDateTime fechaCreacion;
    private Tecnico tecnico;


    public TicketSoporte(Usuario usuario, String descripcion, EstadoTicket estado) {
        contador ++;
        this.id = contador;
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaCreacion = LocalDateTime.now();

    }

    public TicketSoporte(String descripcion, EstadoTicket estado) {
        this(null, descripcion, estado);
    }

    public void asignarTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
        if (tecnico != null) {
            estado = EstadoTicket.EN_PROCESO;
        }
    }

    public void cerrarTicket(){
        this.estado = EstadoTicket.CERRADO;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoTicket getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "TicketSoporte{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", fechaCreacion=" + fechaCreacion +
                ", tecnico=" + tecnico +
                '}';
    }
}
