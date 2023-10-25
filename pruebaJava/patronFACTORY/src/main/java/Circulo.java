public class Circulo extends Figura{

    public Circulo(String color) {
        super(color);
    }

    @Override
    public String dibujarFigura() {
        return "Circulo de color " + getColor();
    }
}


