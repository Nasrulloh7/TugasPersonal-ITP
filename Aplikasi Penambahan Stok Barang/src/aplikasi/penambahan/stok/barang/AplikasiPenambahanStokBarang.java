/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.penambahan.stok.barang;

/**
 *
 * @author M. ILMI NASRULLOH - 2602233235 - DCBA
 */

import java.util.Scanner;

public class AplikasiPenambahanStokBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Meminta input nama user
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
        
        System.out.println();
        System.out.println("Stok Gudang Input Barang");
        System.out.println("########################");
        System.out.println();
        
        System.out.printf("Selamat datang %s%n", nama);
        
        // Meminta input informasi barang
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = input.nextLine();
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlahBarang = input.nextInt();
        System.out.print("Masukkan Harga Beli: ");
        double hargaBeli = input.nextDouble();
        System.out.print("Masukkan Harga Jual: ");
        double hargaJual = input.nextDouble();
        
        System.out.println();
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("########################");
        System.out.println();
        
        // Menampilkan informasi barang dengan 2 angka di belakang koma
        System.out.printf("Nama Barang  : %s%n", namaBarang);
        System.out.printf("Jumlah Barang: %d%n", jumlahBarang);
        System.out.printf("Harga Beli   : %.2f%n", hargaBeli);
        System.out.printf("Harga Jual   : %.2f%n", hargaJual);
        
    }
    
}
