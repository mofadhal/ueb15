
/**
 * Write a description of class GgtIterativ here.
 *
 * @author (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (01.05.2021)
 */
public class GgtIterativ implements GgT
{
    /**
    * @param a die erste nummer .
    * @param b die zewite nummer .
    * @return das Ergebnis von a % b .
    */
   public long berechneGgt(long a, long b){
        long c;
         while(b != 0){
            c = a ;
            a = b;
            b = c % b ;
         }
        return a ;
        }
}


