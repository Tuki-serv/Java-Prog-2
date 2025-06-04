//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gallina a = new Gallina("turuleka",1,2);
        Gallina b = new Gallina("pepita",2,4);

        a.mostrarEstado();
        b.mostrarEstado();

        a.ponerHuevo();
        b.ponerHuevo();

        a.envejecer();
        b.envejecer();

    }
}