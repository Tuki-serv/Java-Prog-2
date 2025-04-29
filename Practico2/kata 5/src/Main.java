import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = 1;
        int suma = 0;

        while (x != 0){
            System.out.println("Ingrese 0 para salir");
            System.out.print("Ingrese un número: ");
            x = input.nextInt();
            if (x % 2 == 0) {
                suma = suma + 2;
            }
        }

        System.out.println("La suma es: "+suma);

    }
}