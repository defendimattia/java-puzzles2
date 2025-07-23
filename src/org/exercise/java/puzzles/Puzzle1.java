// ###🟢Puzzle 1:Massimo comune divisore(MCD)

// **Descrizione:
// Calcolare il massimo comune divisore(MCD)di due numeri interi positivi usando l'algoritmo di Euclide.

// Firma metodo attesa:
// public static int massimoComuneDivisore(int a,int b)

package org.exercise.java.puzzles;

public class Puzzle1 {
    public static int massimoComuneDivisore(int a, int b) {

        if (b == 0) {
            return a;
        }

        while (a % b != 0) {

            int resto = a % b;

            a = b;
            b = resto;
        }

        return b;
    }
}