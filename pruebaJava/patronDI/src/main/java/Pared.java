public class Pared {

    private double altura;
    Pared pared;

    private int area;

    public Pared (Pared pared, double altura, int area) {
        this.pared = pared;
        this.altura = altura;
        this.area  = area;
    }

    public Pared getPared() {
        return pared;
    }

    public double getAltura() {
        return altura;
    }

    public void setPared(Pared pared) {
        this.pared = pared;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
