package misClases;

public class Triangulo {

    private float base;
    private float altura;

    // constructor vacío
    public Triangulo() {

    }

    public Triangulo(float base, float altura) {
        this.altura = altura;
        this.base = base;
    }

    public float calcularArea() {
        return this.base * this.altura / 2;
    }

}
