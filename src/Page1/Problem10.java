package Page1;

public class Problem10 {

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.
    //Answer:  142913828922
    private int max;

    public Problem10(int max) {
        this.max = max;

    }

    public long SumaPrimos() {

        if (this.max == 1) {
            return 2;
        }

        long sumaPrimos = 2;

        for (int i = 3; i < this.max; i += 2) {

            int aux = (int) Math.sqrt(i);

            for (int j = 1; j <= aux; j += 2) {

                if (i % j == 0 && j != 1) {
                    break;
                }

                if (aux == j || aux - 1 == j) {
                    sumaPrimos += i;

                }
            }
        }
        return sumaPrimos;
    }

}
