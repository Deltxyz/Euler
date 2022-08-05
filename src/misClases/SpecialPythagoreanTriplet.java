package misClases;

public class SpecialPythagoreanTriplet {

    private int suma_abc;
    private int a;
    private int b;
    private float c;

    public SpecialPythagoreanTriplet() {

    }

    public SpecialPythagoreanTriplet(int suma_abc) {
        this.suma_abc = suma_abc;
    }

    public int MultiplicacionABC() {

        for (int i = suma_abc; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                c = (float) Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
                //System.out.println(a + "^2 + " + b + "^2 = " + c);

                if (i + j + c == this.suma_abc) {
                    return (int) (i * j * c);

                }
            }
        }

        return 0;
    }

}
