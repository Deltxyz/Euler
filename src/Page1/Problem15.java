package Page1;

//Starting in the top left corner of a 2×2 grid, and only being able to move to 
//the right and down, there are exactly 6 routes to the bottom right corner.
//How many such routes are there through a 20×20 grid?
//Answer:  137846528820
//XD
public class Problem15 {

    //Sigue los numeros centrales del triangulo de Pascal
    //Formula -> 2n!/n!²
    public static long Calcular(int cnt) {

        long a = 1;
        for (int i = 2 * cnt - 1; i > cnt; i -= 2) {
            a *= i;
        }

        long b = (long) Math.pow(2, (int) (cnt + 1) / 2);

        long c = 1;
        for (int i = 1; i <= (int) ((cnt) / 2); i++) {
            c *= i;
        }

        return a * b / c;

    }

}
