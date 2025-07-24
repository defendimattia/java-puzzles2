// ###🟡Puzzle 3:Conta caratteri unici

// **Descrizione:
// Calcolare quanti caratteri unici(senza ripetizioni)sono presenti in una stringa.

// Firma metodo attesa:
// public static int contaCaratteriUnici(String testo)

package org.exercise.java.puzzles;

import java.util.HashMap;
import java.util.Map;

public class Puzzle3 {
    public static int contaCaratteriUnici(String testo) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < testo.length(); i++) {

            if (map.containsKey(testo.charAt(i))) {
                int value = map.get(testo.charAt(i));
                map.put(testo.charAt(i), value + 1);
            } else {
                map.put(testo.charAt(i), 1);
            }

        }

        int counter = 0;
        for (Character c : map.keySet()) {
            if (map.get(c) == 1) {
                counter++;
            }
        }
        return counter;
    }
}
