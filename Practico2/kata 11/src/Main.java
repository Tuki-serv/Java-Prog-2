import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        calcularDescuentoEspecial(precio);

    }

    static void calcularDescuentoEspecial (double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        System.out.print("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.print("El precio final con descuento es: " + (precio - descuentoAplicado));
    }

}