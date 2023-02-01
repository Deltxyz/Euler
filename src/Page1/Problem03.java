package Page1;

public class Problem03 {
    
//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
    //Answer:  6857

    public long MayorPrimo(long aux) {
        long i;
        for (i = 2; i <= aux; i++) {
            if ((aux % i) == 0) {
                aux = aux / i;
                i--;
            }
        }

        return i--;
    }

}
