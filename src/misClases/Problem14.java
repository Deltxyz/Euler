/* The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */
package misClases;

public class Problem14 {

    private int calcularTerminos(long i) {

        int iteracion = 0;
        
        // tomando en cuenta que todas las secuencias llegan a 16
        while (i != 16) {   
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i * 3 + 1;
            }

            iteracion++;
        }
        
        // al llegar a 16 toma 5 pasos para llegar a 1
        return iteracion + 5; 
    }

    /**
     @param max > el numero mas alto a evaluar
     */
    public int mayorCadena(int max) {
        int maxVal = 0;
        int num = 0;
        
        // casos especiales
        if (max == 1 || max == 2) { 
            return max;
        }
        
        // el numero con la mayor cadena es mayor o igual a la mitad de max
        int a = max /2-1; 
        
        for (int i = a; i <= max; i += 2) { // se evaluan los impares
            
            int val = calcularTerminos(i);
            maxVal = Math.max(maxVal, val);

            if (val == maxVal) {
                num = i;
            }
        }
        
        // si el doble de num se encuentra dentro del rango
        if (num * 2 <= max) { 
            return num * 2;
        }

        return num;
    }

}
