public class Main {
    public static void main(String[] args) {

        Presidente presidente = Presidente.getInstance();


        presidente.setNombre("Pedro");
        presidente.setApellidos("Sanchez Martin");
        presidente.setAnioEleccion(2016);

        System.out.println("Nombre: " +presidente.getNombre());
        System.out.println("Apellidos: " +presidente.getApellidos());
        System.out.println("Año eleccion:  " +presidente.getAnioEleccion());
    }
}