package misClases;

/**
 *
 * @author Luis Arroyo
 */
public class Problem12 {

    static private int NumeroTriangular(int n) {
        int valor = n;

        if (n == 0) {
            return 0;
        }
        //System.out.print(valor + ", ");

        valor += NumeroTriangular(n - 1);
        return valor;
    }

    static public long CantidadFactores(int cntDivisores) {
//        System.out.println();
//        System.out.println(valor);
        int i = 1;
        while (true) {
            int cantidad = 0;
            long nroTriangular = NumeroTriangular(i);
            //System.out.println(nroTriangular);
            int tope = (int) Math.sqrt(nroTriangular);
            for (int j = 1; j <= tope; j++) {
                if (nroTriangular % j == 0) {
                    cantidad++;
                }
            }
            if (cantidad*2 > cntDivisores) {
                return nroTriangular;
            }
            i++;
        }

    }

}
