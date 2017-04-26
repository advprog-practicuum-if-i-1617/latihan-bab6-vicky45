package perusahaanX;

public class softwareEngineer extends pegawaiPerusahaanX {

    private int a, bonPerBu = 300000;

    public softwareEngineer(String np, int bulan) {
        super(np, bulan);
    }

    @Override
    public int getGajiPokok() {
        //tunjangan = 5500000
        a = gajiPokok+getBonus()+5500000;
        return a;
    }
    @Override
    public int getBonus(){
        a = (bonus / 2) + bonPerBu;
        return a;
    }
}
