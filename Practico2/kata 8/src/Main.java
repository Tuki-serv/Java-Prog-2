import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextInt();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextInt();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextInt();

        double precioFinal = calcularPrecioFinal(precioBase,impuesto,descuento);

        System.out.println("El precio final es: " + precioFinal);

    }

    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        impuesto = (precioBase * impuesto )/ 100;
        descuento = (precioBase * descuento )/ 100;
        return precioBase + impuesto - descuento;
    }
}