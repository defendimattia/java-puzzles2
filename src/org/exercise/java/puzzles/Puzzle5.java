// ###🟠Puzzle 5:Palindromo

// **Descrizione:
// Verificare se una stringa è palindroma(legge uguale da sinistra a destra e da destra a sinistra).

// Firma metodo attesa:
// public static boolean ePalindromo(String testo)

package org.exercise.java.puzzles;

public class Puzzle5 {

    public static boolean ePalindromo(String testo) {

        String cleaned = testo.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        for (int i = 0; i < cleaned.length(); i++) {

            if (cleaned.charAt(i) != reversed.charAt(i))
                return false;
        }

        return true;

    }
}
