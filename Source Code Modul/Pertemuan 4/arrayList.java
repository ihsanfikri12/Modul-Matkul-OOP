import java.util.Scanner;

class arrayList {
    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan jumlah avatar = ");
        int jumlah = scan.nextInt();
        scan.nextLine();

        String[] avatar = new String[jumlah];

        for(int j=0; j<jumlah; j++) {
            System.out.print("Masukan nama avatar ke " + j + " = ");
            avatar[j] = scan.nextLine();
        }
        
        System.out.println("");
        
        for(int i=0; i<jumlah; i++) {
            System.out.println("Avatar ke " + i + " adalah " + avatar[i]);
        }
        
    }
}