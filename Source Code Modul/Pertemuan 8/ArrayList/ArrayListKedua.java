import java.util.ArrayList;

class ArrayListKedua {
    @SuppressWarnings("unchecked")
    public static void main(String args []) {
        ArrayList biodata = new ArrayList ();
        biodata.add("fikri");
        biodata.add("nurul");
        biodata.add("Nonton anime");

        // int angka = (Integer) biodata.get(1);

        System.out.println("nama nya adalah = " + biodata.get(0));
        System.out.println("Angka nya adalah = " + biodata.get(1));
        
        
        ArrayList <Integer> umur = new ArrayList <Integer> ();
        umur.add(17);
        umur.add(20);

        int umur2 = umur.get(1);
        System.out.println(umur);

    }
}