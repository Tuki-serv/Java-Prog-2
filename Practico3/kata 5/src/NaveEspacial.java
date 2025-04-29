public class NaveEspacial {
    // Atributos privados
    private final String nombre;
    private int combustible;
    private static final int COMBUSTIBLE_MAXIMO = 100;
    private static final int COMBUSTIBLE_DESPEGUE = 10;

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial > COMBUSTIBLE_MAXIMO) {
            this.combustible = COMBUSTIBLE_MAXIMO;
            System.out.println("¡Atención! El combustible no puede superar " + COMBUSTIBLE_MAXIMO + ". Se ajustó al máximo.");
        } else {
            this.combustible = combustibleInicial;
        }
    }

    // Métodos de comportamiento
    public void despegar() {
        if (combustible >= COMBUSTIBLE_DESPEGUE) {
            combustible -= COMBUSTIBLE_DESPEGUE;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("Error: " + nombre + " no puede despegar. Combustible insuficiente (mínimo " + COMBUSTIBLE_DESPEGUE + " unidades).");
        }
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("Error: " + nombre + " no puede avanzar " + distancia + " unidades. Combustible insuficiente.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= COMBUSTIBLE_MAXIMO) {
            combustible += cantidad;
            System.out.println(nombre + " recargó " + cantidad + " unidades. Combustible actual: " + combustible);
        } else {
            int excedente = (combustible + cantidad) - COMBUSTIBLE_MAXIMO;
            System.out.println("¡Atención! Sobrepasas el límite por " + excedente + " unidades. Se recargó hasta el máximo (" + COMBUSTIBLE_MAXIMO + ").");
            combustible = COMBUSTIBLE_MAXIMO;
        }
    }

    public void mostrarEstado() {
        System.out.println("\nEstado de " + nombre + ":");
        System.out.println("Combustible: " + combustible + "/" + COMBUSTIBLE_MAXIMO);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCombustible() {
        return combustible;
    }
}