package Page1;

public class Problem08 {
    
//Find the thirteen adjacent digits in the 1000-digit number that have
//the greatest product. What is the value of this product?
    //Answer:  23514624000

    private String number;

    public Problem08() {

    }

    public Problem08(String number) {
        this.number = number;
        this.Correccion();

    }

    public long MayorProducto(int nCifras) {                                    //no lo intentes con int :')

        long multiplicacion = 0;
        long numAux = 1;

        for (int i = 0; i < this.number.length() - nCifras; i++) {

            String aux = this.number.substring(i, i + nCifras);
            numAux = 1;
            for (int j = 0; j < nCifras; j++) {

                numAux *= Character.getNumericValue(aux.charAt(j));
                if (numAux == 0) {
                    break;
                }

            }

            multiplicacion = Math.max(multiplicacion, numAux);

        }

        return multiplicacion;

    }

    private void Correccion() {

        this.number = this.number.replace("\n", "");
    }

}
