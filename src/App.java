
import java.util.Arrays;

import org.exercise.java.puzzles.Puzzle1;
import org.exercise.java.puzzles.Puzzle2;
import org.exercise.java.puzzles.Puzzle3;
import org.exercise.java.puzzles.Puzzle4;
import org.exercise.java.puzzles.Puzzle5;
import org.exercise.java.puzzles.Puzzle6;
import org.exercise.java.puzzles.Puzzle7;
import org.exercise.java.puzzles.Puzzle8;

public class App {
    public static void main(String[] args) throws Exception {

        // puzzle 1
        System.out.println("Puzzle 1");
        System.out.println(Puzzle1.massimoComuneDivisore(47564, 2636));
        System.out.println("--------------------");

        // puzzle 2
        System.out.println("Puzzle 2");
        System.out.println(Arrays.toString(Puzzle2.invertiArray(new int[] { 1, 2, 3, 4, 5 })));
        System.out.println("--------------------");

        // puzzle 3
        System.out.println("Puzzle 3");
        System.out.println(Puzzle3.contaCaratteriUnici("aaaoaaapaaaiaaauaaayaaataaa"));
        System.out.println("--------------------");

        // puzzle 4
        System.out.println("Puzzle 4");
        System.out.println(Puzzle4.contaParole("prova prova prova  prova  prova prova"));
        System.out.println("--------------------");

        // puzzle 5
        System.out.println("Puzzle 5");
        System.out.println(Puzzle5.ePalindromo("i topi non avevano nipoti"));
        System.out.println("--------------------");

        // puzzle 6
        System.out.println("Puzzle 6");
        System.out.print(Puzzle6.mediaArray(new double[] { 1.1, 1.2, 1.3, 1.4, 1.5 }));
        System.out.println("\n--------------------");

        // puzzle 7
        System.out.println("Puzzle 7");
        System.out.print(
                Puzzle7.elementoPiuFrequente(new int[] { 1, 5, 6, 32, 5, 7, 8, 5, 3, 5, 6, 7, 54, 3, 2, 45, 56 }));
        System.out.println("\n--------------------");

        // puzzle 8
        System.out.println("Puzzle 8");
        System.out.println(Puzzle8.fattoriPrimi(564734255));
        System.out.println("\n--------------------");
    }
}
