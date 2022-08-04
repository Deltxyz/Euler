package misClases;

public class LargestPalindromeProduct {

    private int cntCifras;

    public LargestPalindromeProduct() {

    }

    public LargestPalindromeProduct(int cntCifras) {
        this.cntCifras = cntCifras;

    }

    public int CalularMayorPalindromo() {
        int num = 0;
        int max = (int) Math.pow(10, this.cntCifras) - 1;                       //maximum value

        for (int i = max; i > 0; i--) {
            for (int j = i; j > 0 && i * j > num; j--) {
                if (((i * j) + "").equals(new StringBuffer((i * j) + "").reverse().toString())) {
                    num = i * j;
                }
            }
        }

        return num;
    }

    public int CalularMayorPalindromo(int cntCifras) {
        this.cntCifras = cntCifras;
        return this.CalularMayorPalindromo();
    }

}
