public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina, int edad, int huevosPuestos) {
        setIdGallina(idGallina);
        setEdad(edad);
        setHuevosPuestos(huevosPuestos);
    }

    public void mostrarEstado() {
        System.out.println("-----------------------");
        System.out.println("ID Gallina: "+getIdGallina());
        System.out.println("Edad: "+getEdad());
        System.out.println("Huevos puestos: "+getHuevosPuestos());
    }

    public void ponerHuevo(){
        this.huevosPuestos +=1;
        System.out.println("..................................");
        System.out.println(getIdGallina()+" ha puesto un huevo");
        mostrarEstado();
    }

    public void envejecer(){
        this.edad += 1;
        System.out.println("..................................");
        System.out.println("Se ha envejecido a "+getIdGallina());
        mostrarEstado();
    }

    public String getIdGallina() {
        return idGallina;
    }

    private void setIdGallina(String idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
       if (edad >= 0) {
           this.edad = edad;
       } else {
           System.out.println("Ingrese una edad valida");
       }
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    private void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0) {
            this.huevosPuestos = huevosPuestos;
        } else {
            System.out.println("No puede ingresar valores menores a 0");
        }
    }
}
