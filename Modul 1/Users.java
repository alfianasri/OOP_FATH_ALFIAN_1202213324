import java.util.Scanner;
public class Menu {
    public static void main(String[] args){
        System.out.println("Selamat Datang di Reestoran EAD"
        + "\nSilahkan Register Terlebih Dahulu"
        + "\n==================================");

        String username;
        double NoHp;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama: ");
        username = input.next();
        
        System.out.print("No. Handphone: ");
        NoHp = input.nextInt();

        System.out.println("\nRegister Succes"
                            + "\nName : " + username
                            + "\nPhone Number: " + NoHp);
        pilihan pemilihan = new pilihan();
        pemilihan.memilih();
        }
    }
}