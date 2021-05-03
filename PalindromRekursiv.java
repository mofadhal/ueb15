
/**
 * Write a description of class PalindromRekursiv here.
 *
 * @author (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (01.05.2021)
 */
public class PalindromRekursiv implements Palindrom
{
    /**
     * 
     * @param wort Das eingegebe Wort .
     * @return false ,  wenn das eingegebene Wort nicht palindrom ist . 
     *         true ,  wenn das eingegebene Wort palindrom ist .
     */
    public boolean istPalindrom(String wort){
        if(wort.length() == 0 || wort.length() == 1){
            return true; 
        }

        if(wort.charAt(0) == wort.charAt(wort.length()-1)){
            return istPalindrom(wort.substring(1, wort.length()-1));
        }

        return false;
    
    }

}