import java.util.HashSet;

class HashSetPertama {
    public static void main(String args []) {

        HashSet <String> item = new HashSet <String> ();

        item.add("Pedang");
        item.add("1192");
        item.add("api");
        item.add("1192");

        System.out.println("Item nya adalah = " + item);

        System.out.println("\nHapus element api");
        item.remove("api");
        System.out.println("tambah element air");
        item.add("air");

        System.out.println("\nItem nya sekarang adalah = " + item);

        System.out.println("Ukuran Item nya = " + item.size());
        System.out.println("Apakah ada element air didalam item ? " + item.contains("air"));

        for (String i : item) {
            System.out.println(i);
        }
    }
}