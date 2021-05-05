public class Main {

    public static void main(String[] args) {
        GgT y = new GgtRekursiv();
        GgT x = new GgtIterativ();

        String hei = "almanari";
        System.out.println(hei.substring(1, hei.length()-1));
        System.out.println(y.berechneGgt(123215,133));
        System.out.println(y.berechneGgt(12, 15));
        System.out.println(x.berechneGgt(123215,133));
        System.out.println(x.berechneGgt(12, 15));
    }
}
