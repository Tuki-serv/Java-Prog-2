import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();

        double precioEnvio = calcularCostoEnvio(peso,zona);
        double precioFinal = calcularTotalCompra(precioBase,precioEnvio);

        System.out.println("El total a pagar es: ");
    }

    static double calcularCostoEnvio(double peso,String zona){
        double precioEnvio = 0;
        if (zona == "nacional") {
            precioEnvio = peso * 5;
        }
        if (zona == "internacional") {
            precioEnvio = peso * 10;
        }
        return precioEnvio;
    }

    static double calcularTotalCompra(double precioProducto, double
            costoEnvio) {
        return precioProducto + costoEnvio;
    }

}