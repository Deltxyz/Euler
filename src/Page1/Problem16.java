/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Page1;

//2¹⁵ = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
import java.math.BigInteger;

//What is the sum of the digits of the number 2¹⁰⁰⁰?
public class Problem16 {

    public static void CalcularSumaDigitos(int n) {
        BigInteger num = new BigInteger("2").pow(n);
        String numStr = num.toString();
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        System.out.println(sum);
    }

}
