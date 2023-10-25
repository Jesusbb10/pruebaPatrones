public class Rectangulo extends Figura{

    public Rectangulo(String color) {
        super(color);
    }

    @Override
    public String dibujarFigura() {
        return "Rectangulo de color " + getColor();
    }
}


