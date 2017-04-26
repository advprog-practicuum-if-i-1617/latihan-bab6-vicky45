package perusahaanX;

public class pegawaiPerusahaanX {

    protected int gajiPokok = 2500000, bonus = 250000, bulan;
    private String namaPegawai;

    //np = nama pegawai
    public pegawaiPerusahaanX(String np, int bulan) {
        this.namaPegawai = np;
        this.bulan = bulan * 12;
    }

    public int getBonus() {
        if (bulan > 59) {
            return bonus / 2;
        } else {
            return 0;
        }
    }

    public int getGajiPokok() {
        return gajiPokok + getBonus();
    }

    public int getBulan() {
        return bulan / 12;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }
}
