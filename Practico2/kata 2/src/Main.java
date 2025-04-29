import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1,num2,num3;

        System.out.print("Ingrse el primer número: ");
        num1 = input.nextInt();

        System.out.print("Ingrse el segundo número: ");
        num2 = input.nextInt();

        System.out.print("Ingrse el tercer número: ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 >num3) {
            System.out.println("El mayor es " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es " + num2);
        } else {
            System.out.println("El mayor es " + num3);
        }
    }
}
