import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Ingrese un año para saber si es bisiesto: ");
            int anio = input.nextInt();

            if ((anio % 4 == 0  && anio % 100!=0) || (anio % 400 == 0)) {
                System.out.println("El año " + anio + " es bisiesto");
        } else {
                System.out.println("El año " + anio + " no es bisiesto");
            }
    }
}