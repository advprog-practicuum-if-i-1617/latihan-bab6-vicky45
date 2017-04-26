package perusahaanX;
// entends untuk pewarisan dari SUPER CLASS pegawaiPerusahaanX
public class projectManager extends pegawaiPerusahaanX {

    private int a;

    public projectManager(String np, int bulan) {
        super(np, bulan);
    }

    @Override
    public int getBonus() {
        if (bulan >= 120) {
            a = (bonus / 2) + 450000 + 700000;
            return a;
        } else {
            int a = (bonus / 2) + 450000 + (350000 / 2);
            return a;
        }
    }

    @Override
    public int getGajiPokok() {
        //tunjangan 6000000
        a = gajiPokok + getBonus() + 6000000;
        return a;
    }
}
