import java.util.ArrayList;
import java.util.Iterator;

class IteratorPertama {
    public static void main(String args []) {
        
        ArrayList <Integer> umur = new ArrayList <Integer> ();
        umur.add(17);
        umur.add(8);
        umur.add(16);

        System.out.println(umur);

        Iterator <Integer> it = umur.iterator();

        System.out.println(it.next());
        System.out.println(it.next());
    }
}