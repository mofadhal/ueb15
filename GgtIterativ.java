
/**
 * Write a description of class GgtIterativ here.
 *
 * @author (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (01.05.2021)
 */
public class GgtIterativ implements GgT
{
   /**
    * @param a die erste Zahl .
    * @param b die zewite Zahl .
    * @return Größter gemeinsamer Teiler (ggt) von a und b.
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


