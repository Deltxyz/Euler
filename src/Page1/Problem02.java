package Page1;

public class Problem02 {
    
//Each new term in the Fibonacci sequence is generated by adding the 
//previous two terms. By starting with 1 and 2, the first 10 terms will be:
//
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//By considering the terms in the Fibonacci sequence whose values do not 
//exceed four million, find the sum of the even-valued terms.
    //Answer:  4613732

    private int max;

    public Problem02() {

    }

    public Problem02(int max) {
        this.max = max;
    }

    public int SumarPares() {
        int sumaPares = 0;

        int a = 0;
        int b = 1;
        int c = 1;

        while (a + b < this.max) {

            c = a + b;
            a = b;
            b = c;
            // System.out.print(c + ", ");

            if (c % 2 == 0) {
                sumaPares += c;
            }

        }
        return sumaPares;
    }

    public int SumarPares(int max) {
        this.max = max;
        return this.SumarPares();
    }
}
