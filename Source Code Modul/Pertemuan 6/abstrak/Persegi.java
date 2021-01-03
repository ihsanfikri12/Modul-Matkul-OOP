class Persegi extends BangunDatar {
    double sisi; 

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        double nilai = this.sisi * this.sisi;
        return nilai;
    }

    @Override
    double keliling() {
        double nilai = 4 * sisi;

        return nilai;
    }
}