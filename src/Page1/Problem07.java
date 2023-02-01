package Page1;

public class Problem07 {
    
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
//see that the 6th prime is 13.

//What is the 10 001st prime number?
    //Answer:  104743

    private int max;

    public Problem07() {

    }

    public Problem07(int max) {

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
