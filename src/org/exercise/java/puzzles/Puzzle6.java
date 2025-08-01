// ###🟠Puzzle 6:Media array

// **Descrizione:
// Calcolare la media aritmetica dei valori in un array di double.

// Firma metodo attesa:
// public static double mediaArray(double[]array)

package org.exercise.java.puzzles;

public class Puzzle6 {
    public static double mediaArray(double[] array) {

        double somma = 0;

        for (double i : array) {
            somma += i;
        }

        return somma / array.length;
    }
}
