class Percabangan2 {
    public static void main(String args []) {
        int nilaiPertama = 10;
        int nilaiKedua = 20;
        int nilaiKetiga = 5;

        if(nilaiPertama < nilaiKedua) {
            System.out.println("nilai Pertama kurang dari dari nilai kedua");
        }
        else if(nilaiKedua > nilaiPertama) {
            System.out.println("nilaiKedua lebih besar dari nilaiPertama");
        }
        else if(nilaiKetiga < nilaiPertama) {
            System.out.println("nilaiKetiga lebih kecil dari nilaiPertama");
        }
        else {
            System.out.println("Nilai setara semua");
        }
        
    }
}