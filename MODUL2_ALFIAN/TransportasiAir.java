package MODUL2_ALFIAN;

public class TransportasiAir {
    protected int jumlahKursi,biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan tidak dikteahui dengan kursi berjumlah" + "" + jumlahKursi + " ditetapkan dengan biaya sebesar Rp." + biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air jenis tidak diketahui  sedang berlayar");
    }
    
    public void berlabuh(){
        System.out.println("Transportasi Air jenis tidak diketahui  berlabuh di pantai");
    }
}
