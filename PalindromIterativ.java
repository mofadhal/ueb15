/**
 * Write a description of class PalindromIterativ here.
 *
 * @author (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (01.05.2021)
 */
public class PalindromIterativ implements Palindrom
{  //lotto
    public boolean istPalindrom(String wort){
    
        
        int i = 0, j = wort.length() - 1;
        while (i < j) {
            if (wort.charAt(i) != wort.charAt(j))
                return false;

            i++;
            j--;
        }
        
        return true;
    }
}
