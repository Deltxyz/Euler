package Page1;

public class Problem01 {
    
    

//If we list all the natural numbers below 10 that are 
//multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//Find the sum of all the multiples of 3 or 5 below 1000.
    //Answer:  233168
    

    private int sumaMultiplos;

    public int SumarMultiplos(int max) {

        for (int i = 0; i < max; i++) {

            if ((i % 3) == 0 || (i % 5) == 0) {

                sumaMultiplos += i;

            }
        }

        return sumaMultiplos;
    }

}
