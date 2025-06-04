import com.sun.security.jgss.GSSUtil;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private int MaxCombustible = 100;

    public NaveEspacial(String nombre, int combustible) {
        setNombre(nombre);
        setCombustible(combustible);
    }

    public void mostrarEstado(){
        System.out.println("------------------------");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Combustible disponible: "+getCombustible());
    }

    public void despegar(){
        System.out.println("||||||||||||||||||||||||||||||||");
        if (this.combustible < 10)  {
            System.out.println("No puede despegar, combustible insuficiente");
        } else {
            System.out.println("Se completo el despegue!");

        }
        mostrarEstado();
    }

    public void avanzar(int distancia) {
        System.out.println("||||||||||||||||||||||||||||||||");
        if (this.combustible < 1) {
            System.out.println("No puede avanzar, combustible insuficiente ");
        } else {
            if ((this.combustible - distancia) < 0) {
                System.out.println("No puede avanzar, combustible insuficiente");
            } else {
                this.combustible -= distancia;
                System.out.println("La nave avanzo: "+distancia+" unidades");
            }
        }
        mostrarEstado();
    }

    public void recargarCombustible(int cantidad){
        System.out.println("||||||||||||||||||||||||||||||||");
        if (this.combustible + cantidad > MaxCombustible) {
            System.out.println("Sobrecarga de combustible, no es posible la recarga");
        } else {
            this.combustible += cantidad;
            System.out.println("Se recargo el combustible con exito");
        }
        mostrarEstado();
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    private void setCombustible(int combustible) {
        this.combustible = combustible;
    }
}
