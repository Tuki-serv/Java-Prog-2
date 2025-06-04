public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        setNombre(nombre);
        setEspecie(especie);
        setEdad(edad);
    }

    public void mostrarInfo(){
        System.out.println("---------------------------");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Especie: "+getEspecie());
        System.out.println("Edad: "+getEdad());
    }

    public void cumplirAnios() {
        this.edad += 1;
        mostrarInfo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("Ingrese un valor valido");
        } else {
            this.edad = edad;
        }
    }
}
