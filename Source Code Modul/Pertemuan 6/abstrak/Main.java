class Main {
    public static void main(String args[]) {
        Persegi persegi = new Persegi(5);
        double luasPersegi = persegi.luas();
        double kelilingPersegi = persegi.keliling();

        System.out.println("Luas Persegi adalah = " + luasPersegi);
        System.out.println("Keliling persegi adalah = " + kelilingPersegi);

        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);
        double luasPersegiPanjang = persegiPanjang.luas();
        double luasKelilingPanjang = persegiPanjang.keliling();

        System.out.println("Luas Persegi Panjang adalah = " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang adalah = " + luasKelilingPanjang);
    }
}