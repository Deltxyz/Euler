package Page1;

public class Problem05 {
    
//2520 is the smallest number that can be divided by each of the
//numbers from 1 to 10 without any remainder.

//What is the smallest positive number that is evenly divisible 
//by all of the numbers from 1 to 20?
    //Answer:  232792560

    private int num;

    public Problem05() {

    }

    public Problem05(int num) {
        this.num = num;
    }

    public int calcularMCM(int num) {
        this.num = num;
        return this.calcularMCM();
    }

    public int calcularMCM() {

        int mcm = this.num;
        int valor[] = new int[2];

        for (int i = num - 1; i >= Math.round(num / 2); i--) {
            valor[0] = mcm;
            valor[1] = i;
            mcm = 1;
            int j = 2;

            while (valor[1] != 1) {

                if (valor[1] % j == 0 || valor[0] % j == 0) {

                    if (valor[1] % j == 0) {
                        valor[1] /= j;
                    }
                    if (valor[0] % j == 0) {
                        valor[0] /= j;

                    }
                    mcm *= j;
                    j--;

                }
                j++;

            }
            mcm *= valor[0];

        }

        return mcm;

    }

    public int getNum() {
        return this.num;

    }
}
