// ###🟢Puzzle 2:Inverti array

// **Descrizione:
// Invertire l’ordine degli elementi in un array di interi.

// Firma metodo attesa:
// public static int[] invertiArray(int[] array)

package org.exercise.java.puzzles;

public class Puzzle2 {
    public static int[] invertiArray(int[] array) {

        int[] invertedArray = new int[array.length];
        int counter = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            invertedArray[counter] = array[i];
            counter++;
        }

        return invertedArray;
    }
}
