import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nota;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = input.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println(" Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            } else {
                System.out.println("Nota guardada correctamente.");
            }
        } while (nota < 0 || nota > 10);
    }
}