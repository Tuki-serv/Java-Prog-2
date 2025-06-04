public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    public Empleado(String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String nombre,String puesto){
        this(nombre,puesto,1500);
    }

    public void actualizarSalario(double porcentaje){
        if (porcentaje >= 0) {
            double aumento = this.salario * (porcentaje/100);
            this.salario += aumento;
        }
    }

    public void actulizarSalario(double cantidadFija){
        if (cantidadFija >= 0) {
            this.salario += cantidadFija;
        }
    }

    public static void mostrarTotalEmpleados(){
        System.out.println("El total de empleados es de: "+totalEmpleados);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}