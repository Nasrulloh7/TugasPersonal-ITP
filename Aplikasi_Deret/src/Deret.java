
/**
 * @author M. ILMI NASRULLOH - 2602233235 - DCBA
 */
import java.util.Scanner;

public class Deret {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int banyakAngka = 0;
        int beda = 0;
        int angka, faktorial;
        boolean repeat = true;
        
        while (repeat) {
            System.out.println("\t\t Belajar Deret Aritmatika, Geometri, dan menghitung Faktorial \n");
            
            // Input banyak angka
            boolean validBanyakAngka = false;
            while (!validBanyakAngka) {
                try {
                    System.out.print("Masukkan banyak angka (minimal 2, maksimal 10) \t: ");
                    banyakAngka = input.nextInt();
                    if (banyakAngka >= 2 && banyakAngka <= 10) {
                        validBanyakAngka = true;
                    } else {
                        System.out.println("Input tidak valid!");
                    }
                } catch (Exception e) {
                    System.out.println("Input harus berupa angka!");
                    input.nextLine();
                }
            }
            
            // Input beda
            boolean validBeda = false;
            while (!validBeda) {
                try {
                    System.out.print("Masukkan beda (minimal 2, maksimal 9) \t\t: ");
                    beda = input.nextInt();
                    if (beda >= 2 && beda <= 9) {
                        validBeda = true;
                    } else {
                        System.out.println("Input tidak valid!");
                    }
                } catch (Exception e) {
                    System.out.println("Input harus berupa angka!");
                    input.nextLine();
                }
            }
            System.out.println();
            
            // Hitung dan cetak deret aritmatika
            System.out.println("Deret Aritmatika:");
            angka = 1;
            for (int i = 0; i < banyakAngka; i++) {
                System.out.print(angka + " ");
                angka += beda;
            }
            System.out.println();
            System.out.println();
            
            // Hitung dan cetak deret geometri
            System.out.println("Deret Geometri:");
            angka = 1;
            for (int i = 0; i < banyakAngka; i++) {
                System.out.print(angka + " ");
                angka *= beda;
            }
            System.out.println();
            System.out.println();
            
            // Hitung dan cetak faktorial
            System.out.println("Faktorial dari "+banyakAngka+":");
            faktorial = 1;
            for (int i = banyakAngka; i >=1; i--) {
                faktorial *= i;
                if(i == banyakAngka){
                    System.out.print(i);
                }else {
                    System.out.print(" * " + i);
                }
            }
            System.out.println(" = " + faktorial);
            
            System.out.println();
            
            // Tanya user apakah ingin mengulang program
            System.out.print("Apakah ingin mengulang program (Y/T)? ");
            String ulang = input.next();
            repeat = ulang.equalsIgnoreCase("Y");
            
            System.out.println();
        }
        
        // Menutup program
        System.out.println("Terima kasih telah menggunakan program ini!");
        input.close();
    }

}

