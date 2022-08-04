package misClases;

public class ListPrime {

    private int max;

    public ListPrime() {

    }

    public ListPrime(int max) {

        this.max = max;

    }

    public int CalcularMayorPrimo() {
        if (this.max == 1) {
            return 2;
        }
        int cntPrime = 1;
        int i = 1;

        while (cntPrime != this.max) {

            for (int j = 3; j <= i; j += 2) {

                if (i == j) {
                    cntPrime++;
                    if (cntPrime == this.max) {
                        return i;
                    }
                }

                if (i % j == 0) {
                    break;
                }

            }
            i += 2;                                                               //hack :v
        }
        return 0;

    }

}
