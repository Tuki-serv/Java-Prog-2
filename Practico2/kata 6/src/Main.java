import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;
        int a;

        for (int i = 0 ; i <= 10 ; i++) {
            System.out.print("Ingrese un número: ");
            a = input.nextInt();
            if (a == 0) {
                ceros = ceros + 1;
            } else if (a > 0) {
                positivos = positivos + 1;
            } else  {
                negativos = negativos +1;
            }
        }
        System.out.println("Resultado:");
        System.out.println("Positivos: "+positivos);
        System.out.println("Negativos: "+negativos);
        System.out.println("Ceros: "+ceros);
    }
}