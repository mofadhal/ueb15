
/**
 * Ein Test-klasse .
 *
 * @author (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (11.05.2021)
 */
public class Main {

    public static void main(String[] args) {
        GgT ggtIter = new GgtIterativ();
        Palindrom palindromInter = new PalindromIterativ();
        Palindrom palindromRekur = new PalindromRekursiv();
        GgT ggtrekur = new GgtRekursiv();

//--------------------------Rekursiv-GGT--------------------------------------------
        System.out.println("Itrativ-GGT:-");
        System.out.println(ggtrekur.berechneGgt(123215,133));
        System.out.println(ggtrekur.berechneGgt(12, 15));
//--------------------------Iterativ-GGT----------------------------------------------------
        System.out.println("Reskursiv-GGT:-");
        System.out.println(ggtIter.berechneGgt(123215,133));
        System.out.println(ggtIter.berechneGgt(12, 15));
//-------------------------ist-Palindrom-------------------------------------------------------
        System.out.println("Iterativ-Palindrom:-");
        System.out.println(palindromInter.istPalindrom("aba"));
        System.out.println("Rekursiv-Palindrom:-");
        System.out.println(palindromRekur.istPalindrom("aba"));
//---------------------------palindrom-File--------------------------------------------------------
        System.out.println("Iterativ-File:-");
        System.out.println(palindromInter.fileLesen("test.txt"));
        System.out.println("Rekursiv-File:-");
        System.out.println(palindromRekur.fileLesen("test.txt"));
//---------------------------Geschwindigkeit-Rechnen--------------------------------------------------
        palindromInter.geschwindigkeitsmessung("almanari.txt","speedInter.txt");
        palindromRekur.geschwindigkeitsmessung("almanari.txt","speedRekur.txt");

    }
}
