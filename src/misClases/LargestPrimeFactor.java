package misClases;

public class LargestPrimeFactor {

    public long MayorPrimo(long aux) {
        long i;
        long mayor = 0;
        for (i = 2; i <= aux; i++) {
            if ((aux % i) == 0) {
                aux = aux / i;
                i--;
            }
        }

        return i--;
    }

}
