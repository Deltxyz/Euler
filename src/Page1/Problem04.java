package Page1;

public class Problem04 {
    
    

//A palindromic number reads the same both ways. The largest palindrome
//made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.
    //Answer:  906609

    private int cntCifras;

    public Problem04() {

    }

    public Problem04(int cntCifras) {
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
