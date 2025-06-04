//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante a = new Estudiante("Juan","Perez","2b",7);
        a.mostrarInfo();
        System.out.println("-----------------------------");
        a.subirCalificacion(2);
        a.mostrarInfo();
        System.out.println("-----------------------------");
        a.bajarCalificacion(4);
        a.mostrarInfo();
    }
}