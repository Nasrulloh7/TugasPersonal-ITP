/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.peramal.cinta;

/**
 *
 * @author M. ILMI NASRULLOH - 2602233235 - DCBA
 */

import java.util.Scanner;
import java.util.Random;

public class AplikasiPeramalCinta {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Selamat Datang di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++\n");
        
        
        // Meminta input dari user
        System.out.println("Data Anda:");
        System.out.println("**********");
        
        System.out.print("Masukkan nama anda: ");
        String namaUser = scanner.nextLine();

        System.out.print("Masukkan umur anda: ");
        int umurUser = scanner.nextInt();
        scanner.nextLine();
        
        
        System.out.println("\nData Pasangan Anda:");
        System.out.println("*******************");

        System.out.print("Masukkan nama pasangan anda: ");
        String namaPasangan = scanner.nextLine();

        System.out.print("Masukkan umur pasangan anda: ");
        int umurPasangan = scanner.nextInt();

        // Menampilkan data input user
        System.out.println("\n");
        
        System.out.printf("  %s [%s] tahun\n", namaUser, umurUser);
        
        System.out.println("    ***    ***    ");
        System.out.println("   ************   ");
        System.out.println("  **************  ");
        System.out.println("  **************  ");
        System.out.println("   ************   ");
        System.out.println("     ********     ");
        System.out.println("      ******      ");
        System.out.println("        **        ");
        
        System.out.printf("  %s [%s] tahun\n" ,namaPasangan, umurPasangan);

        scanner.nextLine();
        
        // Menghitung hasil kecocokan
        int hasil = random.nextInt(51) + 50; // Menghasilkan angka random antara 50 dan 100
        double kecocokan = hasil / 1.1;
        
        System.out.print("\nTekan ENTER untuk melihat hasil ramalan....\n\n");
        scanner.nextLine();

        // Menampilkan hasil kecocokan
        System.out.printf("Kecocokan Anda dengan %s adalah : %.2f%%\n", namaPasangan, kecocokan);
        System.out.println("\n\nTerima kasih karena anda telah menggunakan jasa Ramalan kami.. -_-");
    }
}