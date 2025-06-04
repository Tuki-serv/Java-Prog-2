//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado a = new Empleado("Lucas","Gerente");

        System.out.println("-------------------------------------------------------------");
        System.out.println(a.toString());
        System.out.println("-------------------------------------------------------------");
        a.actualizarSalario(25);
        System.out.println("Aumento por porcentaje");
        System.out.println(a.toString());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Aumento fijo");
        a.actulizarSalario(500);
        System.out.println(a.toString());

        System.out.println("-------------------------------------------------------------");
        Empleado.mostrarTotalEmpleados();

    }
}
