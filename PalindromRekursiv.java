import java.io.*;
import java.util.Scanner;

/**
 * überprüft , ob die eingegebene paramieter pilndrom sind.
 * und misst der Gescheindigkeit der eingelesene File .
 * und implement von die Klasse Palindrom als Rekursiv .
 * @author (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (11.05.2021)
 */
public class PalindromRekursiv implements Palindrom {

    public boolean istPalindrom(String wort) {
        if (wort.length() == 0 || wort.length() == 1) {
            return true;
        }

        if (wort.charAt(0) == wort.charAt(wort.length() - 1)) {
            return istPalindrom(wort.substring(1, wort.length() - 1));
        }

        return false;

    }


    public void geschwindigkeitsmessung(String inputPath, String outputPath) {
        File files = new File(inputPath);
        Scanner sc;
        BufferedWriter out;
        try {
            sc = new Scanner(files);
            out = new BufferedWriter(new FileWriter(outputPath));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            long startTime = System.nanoTime();
            istPalindrom(line);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            try {
               out.write(line.length() + "," + duration/ 1e3 + '\n');

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}