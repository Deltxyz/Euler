package misClases;

public class EvenFibonacciNumbers {

    public int sumarPares(int max) {
        int sumaPares = 0;

        int a = 0;
        int b = 1;
        int c = 1;

        while (a + b < max) {

            c = a + b;
            a = b;
            b = c;
            //System.out.print(c + ", ");

            if (c % 2 == 0) {

                sumaPares += c;
            }

        }

        return sumaPares;
    }

}
