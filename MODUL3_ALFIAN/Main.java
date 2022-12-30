package MODUL3_ALFIAN;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Calculation calculate = new Calculation();
        boolean repeat = true;
        int pilihan;
        double side;
        double radius;
        double base;
        double upper;
        double height;
        do {
            System.out.println("--- Menu Program ---\n1. Square\n2. Circle\n3. Trapezoid");
            System.out.print("Select menu: ");
            pilihan = input.nextInt();
            try {
                switch(pilihan) {
                    case 1:
                        System.out.print("Masukkan panjang sisi Square: ");
                        side = input.nextFloat();
                        break;
                    case 2:
                        System.out.print("Masukkan jari-jari Circle: ");
                        radius = input.nextFloat();
                        break;
                    case 3:
                        System.out.print("Masukkan sisi bawah Trapezoid: ");
                        base = input.nextFloat();
                        System.out.print("Masukkan sisi atas Trapezoid: ");
                        upper = input.nextFloat();
                        System.out.print("Masukkan tinggi Trapezoid: ");
                        height = input.nextFloat();
                        break;
                    case 0:
                        System.out.println("Program selesai");
                    default:
                        System.out.println("Option not available");
                        continue;
                }
                repeat = false;

            } catch(InputMismatchException e) {
                System.out.println("Input must be a number");
            } catch(IllegalArgumentException e) {
                System.out.println("Input must be a number");
            } catch(InterruptedException e) {
                System.out.println("Input must be a number");
            }
        }while(repeat);
        input.close();
    }
}
