public class Presidente {

    private String nombre;
    private String apellidos;
    private int anioEleccion;



    public static Presidente instancia;
    public static Presidente getInstance() {
        if(instancia == null) {
            instancia = new Presidente();
        }
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getAnioEleccion() {
        return anioEleccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAnioEleccion(int anioEleccion) {
        this.anioEleccion = anioEleccion;
    }
}
