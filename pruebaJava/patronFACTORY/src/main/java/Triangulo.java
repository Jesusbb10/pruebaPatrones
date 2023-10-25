

public class Triangulo extends Figura{

    public Triangulo(String color) {
        super(color);
    }

    @Override
    public String dibujarFigura() {
        return "Triangulo de color " + getColor();
    }
}
