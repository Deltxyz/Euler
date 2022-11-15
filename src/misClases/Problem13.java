package misClases;

/**
 *
 * @author Luis Arroyo
 */
public class Problem13 {

    private String cadena;

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public long[][] Convertir() {

        String[] cadenas10 = cadena.split("\n");
        long valores[][] = new long[cadenas10.length][5];

        for (int i = 0; i < cadenas10.length; i++) {

            for (int j = 0; j < 5; j++) {
                valores[i][j] = Long.parseLong(cadenas10[i].substring(10 * j, 10 * (j + 1)));

                //System.out.print(valores[i][j] + " ");
            }

            //System.out.println("");
        }

        return valores;
    }

    public String Primeros10Digitos() {
        long[][] datos = Convertir();
        long[] suma = new long[5];

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < datos.length; j++) {
                suma[i] += datos[j][i];
                if (suma[i] >= 1000000000 && i != 0) {
                    suma[i] = 0;
                    suma[i - 1]++;
                }

            }
        }

        return (suma[0]+"").substring(0, 10);
    }

}
