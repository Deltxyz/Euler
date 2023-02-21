/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Page1;

//2¹⁵ = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//What is the sum of the digits of the number 2¹⁰⁰⁰?
public class Problem16 {

    public static void mostrar() {

        for (int i = 0; i <= 36; i++) {
//            System.out.print("[ "+i + " -> " + (int)Math.pow(2, i) + " ]");
            System.out.print("[ " + (long) Math.pow(2, i) + " ]");
            if (i % 4 == 0) {
                System.out.println("");

            }
        }
    }

}
