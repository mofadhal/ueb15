
/**
 * Write a description of class GgtRekursiv here.
 *
 * @author (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (01.05.2021)
 */
public class GgtRekursiv implements GgT
{
   // almanari
   /**
    * @param a die erste Zahl .
    * @param b die zewite Zahl .
    * @return Größter gemeinsamer Teiler (ggt) von a und b.
    */
   public long berechneGgt(long a, long b){
       if(b == 0L) return a ;
        return berechneGgt(b, a%b);
    }
}
