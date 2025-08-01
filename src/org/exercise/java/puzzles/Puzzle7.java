// ###🔴Puzzle 7:Elemento più frequente

// **Descrizione:
// Restituire l’elemento che appare più frequentemente in un array di interi(in caso di parità,uno qualsiasi).

// Firma metodo attesa:
// public static int elementoPiuFrequente(int[] array)

package org.exercise.java.puzzles;

import java.util.HashMap;
import java.util.Map;

public class Puzzle7 {
    public static int elementoPiuFrequente(int[] array) {

        Map<Integer, Integer> mappedArray = new HashMap<>();

        for (int i : array) {
            if (!mappedArray.containsKey(i)) {
                mappedArray.put(i, 1);
            } else {
                mappedArray.put(i, mappedArray.get(i) + 1);
            }
        }

        int higherValue = Integer.MIN_VALUE;
        int higherKey = array[0];

        for (int key : mappedArray.keySet()) {
            if (mappedArray.get(key) > higherValue) {
                higherValue = mappedArray.get(key);
                higherKey = key;
            }
        }

        return higherKey;
    }
}
