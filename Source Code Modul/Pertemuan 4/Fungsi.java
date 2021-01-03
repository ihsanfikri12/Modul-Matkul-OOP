import java.util.Scanner;

class Fungsi {
    
    public static void main(String args []) {
        int nilaiPertama, nilaiKedua, nilaiKetiga;
        String pilihan;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan nilai pertama = ");
        nilaiPertama = scan.nextInt();

        System.out.print("Masukan nilai kedua = ");
        nilaiKedua = scan.nextInt();
        scan.nextLine();

        System.out.println("Mau melakukan pertambahan atau pengurangan ? ");
        System.out.println("A. tulis 'tambah' untuk melakukan pertambahan");
        System.out.println("B. tulis 'kurang' untuk melakukan pengurangan");
        System.out.print("Pilihan mu = ");
        pilihan = scan.nextLine();

        switch (pilihan.toLowerCase()) {
            case "tambah":
                nilaiKetiga = pertambahan(nilaiPertama, nilaiKedua);
                System.out.println("Hasil pertambahan " + nilaiPertama + "+" +nilaiKedua + " = " + nilaiKetiga);
                break;
            case "kurang":
                nilaiKetiga = pengurangan(nilaiPertama, nilaiKedua);
                System.out.println("Hasil pengurangan " + nilaiPertama + "-" +nilaiKedua + " = " + nilaiKetiga);
                break;
            
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }

    }

    public static int pertambahan(int nilaiPertama, int nilaiKedua) {
        int hasilPertambahan = nilaiPertama+nilaiKedua;

        return hasilPertambahan;
    }

    public static int pengurangan(int nilaiPertama, int nilaiKedua) {
        int hasilPengurangan = nilaiPertama-nilaiKedua;

        return hasilPengurangan;
    }
}