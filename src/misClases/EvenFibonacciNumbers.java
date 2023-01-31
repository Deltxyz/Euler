package misClases;

public class EvenFibonacciNumbers {

    private int max;

    public EvenFibonacciNumbers() {

    }

    public EvenFibonacciNumbers(int max) {
        this.max = max;
    }

    public int SumarPares() {
        int sumaPares = 0;

        int a = 0;
        int b = 1;
        int c = 1;

        while (a + b < this.max) {

            c = a + b;
            a = b;
            b = c;
            // System.out.print(c + ", ");

            if (c % 2 == 0) {
                sumaPares += c;
            }

        }
        return sumaPares;
    }

    public int SumarPares(int max) {
        this.max = max;
        return this.SumarPares();
    }
}
