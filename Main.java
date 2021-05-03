public class Main {

    public static void main(String[] args) {
        GgT y = new GgtRekursiv();
        GgT x = new GgtIterativ();

        System.out.println(y.berechneGgt(123215,133));
        System.out.println(y.berechneGgt(12, 15));
        System.out.println(x.berechneGgt(123215,133));
        System.out.println(x.berechneGgt(12, 15));
    }
}
