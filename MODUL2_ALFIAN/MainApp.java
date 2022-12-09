package MODUL2_ALFIAN;

public class MainApp{
    public static void main(String[] args) throws Exception {
        
    TransportasiAir transportasiAir1 = new TransportasiAir(4, 20000);
    transportasiAir1.informasi();
    transportasiAir1.berlayar();
    transportasiAir1.berlabuh();
    System.out.println("");

    Sampan sampan1 = new Sampan(20,50000,2);
    sampan1.informasi();
    sampan1.berlayar();
    sampan1.berlabuh();
    sampan1.berlabuh(2);
    System.out.println("");

    Kapal kapal1 = new Kapal(50,100000,"Diesel");
    kapal1.informasi();
    kapal1.berlayar();
    kapal1.berlayar(20);
    kapal1.berlabuh();
    System.out.println("");
    }
}

