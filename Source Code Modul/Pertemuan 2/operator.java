class operator {
    public static void main(String args[]){
        int nilaiPertama, nilaiKedua;

        nilaiPertama = 10;
        nilaiKedua = 5;
        double nilaiKetiga = 5;

        // System.out.println("nilaiPertama > nilaiKedua = " + (nilaiPertama > nilaiKedua));
        // System.out.println("nilaiPertama < nilaiKedua = " + (nilaiPertama < nilaiKedua));
        // System.out.println("nilaiKedua == nilaiKetiga = " + (nilaiKedua == nilaiKetiga));
        // System.out.println("nilaiPertama != nilaiKetiga = " + (nilaiPertama != nilaiKetiga));
        // System.out.println("nilaiPertama >= nilaiKetiga = " + (nilaiPertama >= nilaiKetiga));
        // System.out.println("nilaiKedua <= nilaiKetiga = " + (nilaiKedua <= nilaiKetiga));

        // boolean hasil; 
        // hasil = nilaiPertama <=10 && nilaiKedua>=5;
        // System.out.println("Nilai pertama >= 5 dan nilai kedua <=10 ? " + hasil);

        // hasil = nilaiPertama < 8 || nilaiKedua==5;
        // System.out.println("Nilai pertama < 8 dan nilai kedua ==10 ? " + hasil);

        // System.out.println("hasil = " + !hasil);

        String perbandingan = 10>5 ? "Ya, itu benar" : "Salah total";
        System.out.println("10>5 = " + perbandingan);

        String perbandingan2 = 10<5 ? "Ya, itu benar" : "Salah total";
        System.out.println("10<5 = " + perbandingan2);

    }
}