package misClases;

public class MultiplesOf3Or5 {

//Encuentra la suma de todos los múltiplos de 3 o 5 por debajo de 1000.
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
