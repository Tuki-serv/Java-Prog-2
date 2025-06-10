//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SistemaSoporte sis = new SistemaSoporte();

        sis.crearTicket(new TicketSoporte("redes",EstadoTicket.ABIERTO));
        sis.asignarTecnico(new Tecnico("Luis","software"));
        sis.crearTicket(new TicketSoporte(new Usuario("Lucas","luca@gmail.com"),"redes",EstadoTicket.ABIERTO));
        sis.mostrarTickesAbiertos();


        sis.cerrarTicket(sis.getListaTickets().get(1));
        sis.mostrarTickesCerrados();
    }
}