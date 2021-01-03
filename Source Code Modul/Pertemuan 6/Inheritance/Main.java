class Main {
    public static void main (String args []) {
        Persebaran pertama = new Persebaran();

        System.out.println(pertama.nilaiPersebaran());
        System.out.println(pertama.mean());

        NilaiTengah kedua = new NilaiTengah();

        System.out.println(kedua.nilaiTengah());
        kedua.median();
        System.out.println(kedua.modus());
    }
}