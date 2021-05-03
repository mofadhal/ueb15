
/**
 * Write a description of class PalindromRekursiv here.
 *
 * @author (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (01.05.2021)
 */
public class PalindromRekursiv implements Palindrom
{
    public boolean istPalindrom(String wort){
        wort = wort.toLowerCase();
        int vorne = 0;
        int hinten = wort.length() - 1;
        while (vorne < hinten && wort.charAt(vorne) == wort.charAt(hinten))
        {
            ++vorne;
            --hinten;
        }
        return vorne >= hinten;
    }
    
    }

