import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of interface Palindrom here.
 *
 * @author (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (11.05.2021)
 */
public interface Palindrom {

    /**
     * @param wort Das eingegebe Wort .
     * @return true , wenn das eingegebene Wort palindrom ist .
     * false , wenn das eingegebene Wort nicht palindrom ist .
     */
    boolean istPalindrom(String wort);

    /**
     * Diese Methode list einen File durch und ruft die istPalindrom Methode .
     * @param path paht der File
     * @return ArrayList der aus einen String und Boolean entsteht
     */
    public default ArrayList<Pair<String, Boolean>> fileLesen(String path) {
        ArrayList<Pair<String, Boolean>> result = new ArrayList<Pair<String, Boolean>>();

        File files = new File(path);
        Scanner sc = null;
        try {
            sc = new Scanner(files);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return result;
        }

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            boolean palindrome = istPalindrom(line);
            Pair<String, Boolean> temp = new Pair(line, palindrome);
            result.add(temp);
        }
        return result;
    }

    /**
     * Ein InnerKlasse .
     * Es speichert die Ein gegebene Info (String , Boolean) in einer File
     * @param <T>  String
     * @param <T1> Boolean
     */
     class Pair<T, T1> {
        T x;
        T1 y;

        Pair(T x, T1 y) {
            this.x = x;
            this.y = y;
        }

        public T first() {
            return this.x;
        }

        public T1 second() {
            return this.y;
        }

        @Override
        public String toString() {
            return x + " " + y + '\n';
        }
    }


    /**
     *Diese Methode list einen File und überprüft , ob die eingelsene Line pilandrom
     * und misst die Zeit der Prozess .Danach werden die Geschwindigkeit in einer File .
     * @param inputPath path der eingelesene File .
     * @param outputPath path der geschreibene File .
     */
    void geschwindigkeitsmessung(String inputPath, String outputPath);

}