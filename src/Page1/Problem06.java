package Page1;

public class Problem06 {
    
//The sum of the squares of the first ten natural numbers is,

//The square of the sum of the first ten natural numbers is,

//Hence the difference between the sum of the squares of the first ten natural
//numbers and the square of the sum is

//Find the difference between the sum of the squares of the first one 
//hundred natural numbers and the square of the sum.
    //Answer:  25164150

    private int valorMax;

    public Problem06() {

    }

    public Problem06(int valorMax) {
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
