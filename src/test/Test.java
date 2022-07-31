package test;

import misClases.EvenFibonacciNumbers;
import misClases.HolaMundo;
import misClases.LargestPrimeFactor;
import misClases.MultiplesOf3Or5;

public class Test {

    public static void main(String[] args) {
        

        MultiplesOf3Or5 mult = new MultiplesOf3Or5();
        //System.out.println("La suma de multiplos es: " + mult.SumarMultiplos(1000));

        EvenFibonacciNumbers fibonacci = new EvenFibonacciNumbers();
        //System.out.println("Suma de pares menores que 4000000: " + fibonacci.sumarPares(4000000));

        LargestPrimeFactor large = new LargestPrimeFactor();
        System.out.println("El mayor primo de 600851475143 es: " + large.MayorPrimo(1));

        HolaMundo holaMundo = new HolaMundo();
        holaMundo.Escribir();


        //Holas
    }

}
