public class Main {
    public static void main(String[] args) {
    Figura figura =  FiguraFactory.getFigura("triangulo");

        figura.setColor("rojo");
        System.out.println(figura.dibujarFigura());
    }
}