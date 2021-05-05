/**
 * Write a description of class PalindromIterativ here.
 *
 * @author (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (01.05.2021)
 */
public class PalindromIterativ implements Palindrom
{  

    /**
     * 
     * @param wort Das eingegebe Wort .
     * @return true , wenn das eingegebene Wort palindrom ist .
     *         false , wenn das eingegebene Wort nicht palindrom ist . 
     */
    public boolean istPalindrom(String wort){

        int vorne = 0, hinten = wort.length() - 1;
        while (vorne < hinten) {
            if (wort.charAt(vorne) != wort.charAt(hinten))
                return false;

            vorne++;
            hinten--;
        }
        
        return true;
    }
}
