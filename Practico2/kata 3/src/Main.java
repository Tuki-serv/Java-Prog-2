import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");

        int edad = input.nextInt();

        if (edad < 12) {
            System.out.println("Eres un niño");
        }
        if (edad >=12 && edad <=17) {
            System.out.println("Eres un adolecente");
        }
        if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un adulto");
        }
        if (edad >= 60) {
            System.out.println("Eres un adulto mayor");
        }
    }
}