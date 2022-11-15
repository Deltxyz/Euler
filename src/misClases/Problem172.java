/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misClases;

import static java.lang.String.valueOf;
import java.util.Arrays;

/**
 *
 * @author larro
 */
public class Problem172 {

    //How many 18-digit numbers n (without leading zeros) are there such that no
    //digit occurs more than three times in n?
    private static int[] number;
    private static float cantidad;
    private static int[] cnt = new int[10];

    public static float Contar1() {
        number = new int[3];

        for (number[0] = 100000; number[0] < 1000000; number[0]++) {
            if (Evaluar(0)) {
                System.out.print(number[0]);
                for (number[1] = 0; number[1] < 1000000; number[1]++) {
                    if (Evaluar(1)) {
                        System.out.print(number[1]);

                        for (number[2] = 0; number[2] < 1000000; number[2]++) {
                            System.out.println(number[2]);
                            if (Evaluar(2)) {

                                cantidad++;
                            }
                        }
                    }
                }
            }
            System.out.println("");

            Arrays.fill(cnt, 0);

        }
        return cantidad;
    }

    private static boolean Evaluar(int x) {
        byte a;

        for (int i = 0; i < 6; i++) {
            a = Byte.parseByte((number[x] + "").charAt(i) + "");

            cnt[a]++;

            if (cnt[a] > 3) {
                return false;
            }
        }

        return true;
    }
}
