import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] precios = {2.3,4.5,5.1,3};

        for (double i : precios) {
            System.out.println(i);
        }
        System.out.print("Elija la posición: ");
        int mod = input.nextInt();
        System.out.print("Ingrese el nuevo valor: ");
        precios [mod] = input.nextDouble();

        for (double i: precios) {
            System.out.println(i);
        }

    }
}