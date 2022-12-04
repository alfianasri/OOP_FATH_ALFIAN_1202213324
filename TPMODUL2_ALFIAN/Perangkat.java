public class Perangkat {
    protected String drive; int ram; float processor;
    
    public Perangkat(String drive, int ram, float processor){
        this.processor = processor;
        this.ram = ram;
        this.drive = drive;
    }
    public void informasi(){
        System.out.println("Perangkat tidak diketahui memiliki drive tipe "+drive+", ram sebesar "+ram+ " dan processor " +processor+ " Ghz");
    }
}
