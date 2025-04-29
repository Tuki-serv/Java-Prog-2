import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la categoria del producto | A | B | C : ");
        String categoria = input.nextLine();

        switch (categoria) {
            case "a" :
                precio = precio - (precio * 10 / 100);
                System.out.println("Descuento aplicado: 10% ");
                break;
            case "b" :
                precio = precio - (precio * 15 / 100);
                System.out.println("Descuento aplicado: 15% ");
                break;
            case "c" :
                precio = precio - (precio * 20 / 100);
                System.out.println("Descuento aplicado: 20% ");
                break;
        }

        System.out.println("Precio final: "+ precio);
    }
}