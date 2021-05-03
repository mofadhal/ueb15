
/**
 * Write a description of class GgtRekursiv here.
 *
 * @author (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (01.05.2021)
 */
public class GgtRekursiv implements GgT
{
   
   /**
    * @param a die erste nummer .
    * @param b die zewite nummer .
    * @return das Ergebnis von a % b .
    */
   public long berechneGgt(long a, long b){
        long c ;
        c = a;
        a = b;
        b = c % b ;
        if(b == 0) return a ;
        else berechneGgt(a, b);
        return a ;
    }

}
