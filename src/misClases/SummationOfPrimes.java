package misClases;

public class SummationOfPrimes {

    private int max;

    public SummationOfPrimes() {

    }

    public SummationOfPrimes(int max) {
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
