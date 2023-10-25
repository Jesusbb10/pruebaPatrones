public class Cuadrado extends Figura{

    public Cuadrado(String color) {
        super(color);
    }

    @Override
    public String dibujarFigura() {
        return "Cuadrado de color " + getColor();
    }
}

