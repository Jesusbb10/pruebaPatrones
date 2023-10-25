public class FiguraFactory {

    public static Figura getFigura(String tipo) {
        if (tipo.equals("triangulo")) {
            return new Triangulo("");
        } else if(tipo.equals("rectangulo")) {
            return new Rectangulo("");
        }else if (tipo.equals("circulo")){
            return new Circulo("");
        } else if( tipo.equals("cuadrado")) {
            return new Cuadrado("");
        }
        return null;
    }
}
