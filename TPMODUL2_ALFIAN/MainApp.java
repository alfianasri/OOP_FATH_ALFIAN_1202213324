public class MainApp {
    public static void main(String[] args) throws Exception{
        Perangkat perangkat1 = new Perangkat("Logitech", 8 , 4.5F);
        perangkat1.informasi();
        System.out.println("");
        
        Handphone handphone1 = new Handphone("Logitech", 6 , 3.5F,true);
        handphone1.informasi();
        System.out.println("");
        handphone1.telfon(694413938);
        handphone1.kirimSMS(694413938);
        handphone1.kirimSMS(694413938,341912772);
        System.out.println("");
       
        Laptop Laptop1 = new Laptop("Logitech", 8 , 3.0F,true);
        Laptop1.informasi();
        System.out.println("");
        Laptop1.bukaGame("8 Ball Pool");
        Laptop1.kirimEmail("alfianasri6@gmail.com");
        Laptop1.kirimEmail("alfianasri6@gmail.com","alfianasri5@gmail.com");
        System.out.println("");
    }
}
