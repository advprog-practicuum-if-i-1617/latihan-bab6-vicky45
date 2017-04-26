package perusahaanX;

public class testing {

    public static void main(String[] args) {

        softwareEngineer SE = new softwareEngineer("M. Riza a.", 4);
        System.out.println("Untuk Software Engineer\n"+SE.getNamaPegawai());
        System.out.println("masa kerja: " + SE.getBulan() + " tahun");
        System.out.println("gaji      : " + SE.getGajiPokok());
        
        projectManager PM = new projectManager("Ririn danesa", 10);
        System.out.println("Untuk Project Manajer\n"+PM.getNamaPegawai());
        System.out.println("masa kerja: " + PM.getBulan() + " tahun");
        System.out.println("gaji      : " + PM.getGajiPokok());
      
    }

}
