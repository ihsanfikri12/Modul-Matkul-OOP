import java.util.LinkedList;

class LinkedListPertama {
    public static void main(String args []) {

        LinkedList <Integer> item = new LinkedList <Integer>();

        item.add("Pedang");
        item.add(1192);
       
        item.addFirst("Air");
        item.addLast(120);

        int hasil = item.get(1)

        System.out.println("Item pertama = " + item.getFirst());
        System.out.println("Item terakhir = " + item.getLast());

        item.removeFirst();
        System.out.println("Item pertama = " + item.getFirst());

        item.removeLast();
        System.out.println("Item terakhir = " + item.getLast());

    }
}