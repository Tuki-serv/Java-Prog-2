import java.util.ArrayList;

public class SistemaSoporte {
    private ArrayList<TicketSoporte> listaTickets;

    public SistemaSoporte() {
        this.listaTickets = new ArrayList<>();
    }

    public void crearTicket(TicketSoporte ticket){
        listaTickets.add(ticket);
    }

    private void asignacion(Tecnico tec, TicketSoporte t){
        t.asignarTecnico(tec);
    }

    public void mostrarTickesAbiertos(){
        ArrayList ticketsAbiertos = new ArrayList<>();
        //ticketsAbiertos.clear();
        for(TicketSoporte t: listaTickets){
            if (t.getEstado() == EstadoTicket.ABIERTO){
                ticketsAbiertos.add(t);
            }
        }
        System.out.println("Tickes Abiertos: ");
        for(int i = 0; i < ticketsAbiertos.size();i++){
            System.out.println(ticketsAbiertos.get(i));
        }
    }

    public void mostrarTickesCerrados(){
        ArrayList ticketsCerrados = new ArrayList<>();
        //ticketsCerrados.clear();
        for(TicketSoporte t: listaTickets){
            if (t.getEstado() == EstadoTicket.CERRADO){
                ticketsCerrados.add(t);
            }
        }
        System.out.println("Tickes Cerrados: ");
        for(int i = 0; i < ticketsCerrados.size(); i++){
            System.out.println(ticketsCerrados.get(i));
        }
    }

    public void cerrarTicket(TicketSoporte t){
        t.cerrarTicket();
    }

    public void asignarTecnico(Tecnico tec) {
        for (TicketSoporte t : listaTickets) {
            if (t.getDescripcion().equalsIgnoreCase(tec.getEspecialidad())){
                asignacion(tec,t);
            } else {
                System.out.println("No se pudo asignar un tecnico");
            }
        }
    }

    public ArrayList<TicketSoporte> getListaTickets() {
        return listaTickets;
    }

    @Override
    public String toString() {
        return "SistemaSoporte{" +
                "listaTickets=" + listaTickets +
                '}';
    }
}