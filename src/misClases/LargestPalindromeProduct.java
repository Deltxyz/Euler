package misClases;

public class LargestPalindromeProduct {

    private int cntCifras;

    public LargestPalindromeProduct() {

    }

    public LargestPalindromeProduct(int cntCifras) {
        this.cntCifras = cntCifras;

    }

    public int CalularMayorPalindromo() {
        int num;
        int palindromo = 0;

        StringBuilder strb = new StringBuilder();

        for (int i = 1; i < Math.pow(10, this.cntCifras); i++) {
            for (int j = 1; j <= i; j++) {
                num = i * j;
                strb.delete(0, strb.length());
                strb.append(num + "");
                if ((strb.reverse().toString()).equals(num + "")) {
                    palindromo = Math.max(num, palindromo);

                }

            }
        }
        return palindromo;

    }

    public int CalularMayorPalindromo(int cntCifras) {
        this.cntCifras = cntCifras;
        return this.CalularMayorPalindromo();
    }

}
