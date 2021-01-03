import java.util.ArrayList;

class arrayListKetiga {
    public static void main(String args []) {

        ArrayList item = new ArrayList();

        item.add("Pedang");
        item.add(1192);
        item.add(80.95);
        item.add("api");

        System.out.println("Senjata  = "+item.get(0) + 
                           "\nmempunyai kekuatan sebesar = " + item.get(1) +
                           "\nPemakaian baru sekitar = " + item.get(2) + "%" +
                           "\nElement pedang adalah = " + item.get(3));


        item.remove(80.95);
        System.out.println("\n" + item);
    }
}