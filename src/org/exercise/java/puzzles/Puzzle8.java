// ###🟠Puzzle 8:Scomposizione in fattori primi

// **Descrizione:
// Restituire la lista dei fattori primi di un numero intero positivo.

// Firma metodo attesa:
// public static List<Integer>fattoriPrimi(int numero)

package org.exercise.java.puzzles;

import java.util.ArrayList;
import java.util.List;

public class Puzzle8 {
    public static List<Integer> fattoriPrimi(int numero) {

        List<Integer> numsList = new ArrayList<>();

        int counter = 2;

        while (numero != 1) {

            if (numero % counter == 0) {
                numsList.add(counter);
                numero = numero / counter;
                counter = 2;
            } else {
                if (counter >= 3) {
                    counter += 2;
                } else {
                    counter += 1;
                }
            }
        }
        return numsList;
    }
}
