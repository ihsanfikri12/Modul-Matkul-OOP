import java.util.Scanner;

class Prosedur {

    public static void main(String args []) {
        int nilaiPertama, nilaiKedua;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan nilai Pertama = ");
        nilaiPertama = scan.nextInt();
        System.out.print("Masukan nilai Kedua = ");
        nilaiKedua = scan.nextInt();

        pertambahan(nilaiPertama, nilaiKedua);
        
        pertambahan(5,10);

        pertambahan(10,30);
    }

    static void pertambahan(int nilaiPertama, int nilaiKedua) {

        int nilaiKetiga = nilaiPertama + nilaiKedua;

        System.out.println("Hasil pertambahan dari " + 
                            nilaiPertama + " + " +nilaiKedua +
                            " adalah = " + nilaiKetiga);
    }
}