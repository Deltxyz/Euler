package misClases;

public class SumSquareDifference {

    private int valorMax;

    public SumSquareDifference() {

    }

    public SumSquareDifference(int valorMax) {
        this.valorMax = valorMax;

    }

    public int calcularSumaCuadrados() {

        int suma = this.valorMax * (this.valorMax + 1) * (2 * this.valorMax + 1);
        suma /= 6;

        return suma;

    }

    public int calcularCuadradoSuma() {

        int suma = this.valorMax * (this.valorMax + 1);
        suma /= 2;
        suma *=suma;
        return suma;
    }

    public int diferencias() {
        return (int)Math.abs(this.calcularSumaCuadrados() - this.calcularCuadradoSuma());

    }

}
