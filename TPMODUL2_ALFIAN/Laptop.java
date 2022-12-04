public class Laptop extends Perangkat {
    protected boolean webcam; 
    
    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive,ram,processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi(){
        if(webcam){
            System.out.println("Drive laptop ini adalah  " + drive + " , ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini juga memiliki webcam");
        }
        else{
            System.out.println("Drive laptop ini adalah  " + drive + " , ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini juga tidak memiliki webcam");
        }
    }
    public void bukaGame(String Nama_Game){
        System.out.printf("Laptop berhasil membuka "+ Nama_Game);
    }
        
    public void kirimEmail(String Email){
            System.out.printf("\nLaptop berhasil mengirim Email ke  No "+ Email);
    }
            
    public void kirimEmail(String Email1, String Email2){
            System.out.printf("\nLaptop berhasil mengirim Email ke  No "+ Email1 + " dan "+ Email2);
    }
}

