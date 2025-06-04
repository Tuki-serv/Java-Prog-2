public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        setTitulo(titulo);
        setAutor(autor);
        setAñoPublicacio(añoPublicacion);
    }

    public void mostrarInfo(){
        System.out.println("--------------------");
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Auto: "+getAutor());
        System.out.println("Año de publicación: "+getañoPublicacion());
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    public int getañoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacio(int añoPublicacion) {
        if (añoPublicacion >= 1900 && añoPublicacion <= 2025) {
            this.añoPublicacion = añoPublicacion;
            mostrarInfo();
        } else {
            System.out.println("No se puede modificar si el \n" +
                    "año es menor a 1900 o mayor al año actual. ");
        }

    }
}
