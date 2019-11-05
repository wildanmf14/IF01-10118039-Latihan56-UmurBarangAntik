public class BarangAntik {

    protected int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur() {
        System.out.printf("Umur barang antik ini adalah\t: %d tahun%n", umur);
    }
}
