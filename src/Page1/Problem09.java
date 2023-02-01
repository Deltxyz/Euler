package Page1;

public class Problem09 {
    
//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//a2 + b2 = c2

//For example, 32 + 42 = 9 + 16 = 25 = 52.

//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
    //Answer:  31875000

    private int suma_abc;
    private int a;
    private int b;

    public Problem09() {

    }

    public Problem09(int suma_abc) {
        this.suma_abc = suma_abc;
    }

    public int MultiplicacionABC() {

        for (int i = suma_abc; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                float c = (float) Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
                //System.out.println(a + "^2 + " + b + "^2 = " + c);

                if (i + j + c == this.suma_abc) {
                    return (int) (i * j * c);

                }
            }
        }

        return 0;
    }

}
