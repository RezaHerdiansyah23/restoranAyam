/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuDriver;

import java.util.Scanner;

/**
 *
 * @author REZA
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);

        int jenisAyam, sambal, totalPorsi, jumlahPorsi, jumlahPorsi1 = 0, harga2, harga = 0, diskon, u = 0;

        do {
            System.out.println("========== Restoran Ayam ==========");
            System.out.println("        Anda akan memilih porsi");
            System.out.println("===Porsi==========||======Harga============");
            System.out.println("1. 1 ekor         ||     = Rp. 35000/ekor");
            System.out.println("2. Setengah ekor  ||     = Rp. 17500/setengah ekor");
            System.out.println("========================================");
            System.out.print("  Masukkan Pilihan Porsi Dengan Angka = ");
            jumlahPorsi = in.nextInt();
            System.out.println("========================================");
            switch (jumlahPorsi) {
                case 1:
                    jumlahPorsi = 35000;
                    break;
                case 2:
                    jumlahPorsi = 17500;
                    break;
            }

            System.out.print("  Jumlah ayam  yang akan di pesan = ");
            totalPorsi = in.nextInt();
            System.out.println("========================================");
            System.out.println("========== Restoran Ayam ==========");
            System.out.println("        Anda akan memilih Jenis Ayam");
            System.out.println("===Porsi==========||======Harga============");
            System.out.println("1. Ayam Bakar              = Rp. 5000");
            System.out.println("2. Ayam Goreng             = Rp. 8000");
            System.out.println("3. Ayam Crispy             = Rp. 10000");
            System.out.println("========================================");
            System.out.print("  Masukkan Pilihan Ayam Dengan Angka = ");
            jenisAyam = in.nextInt();
            System.out.println("========================================");
            switch (jenisAyam) {
                case 1:
                    jenisAyam = 5000;
                    break;
                case 2:
                    jenisAyam = 8000;
                    break;
                case 3:
                    jenisAyam = 10000;
                    break;
            }
            System.out.println("========== Restoran Ayam ==========");
            System.out.println("========== anda akam memilih sambal ==========");
            System.out.println("===Porsi==========||======Harga============");
            System.out.println("1. Sambal Bawang              = Rp. 1000");
            System.out.println("2. Sambal Cabai Ijo           = Rp. 2000");
            System.out.println("3. Sambal Terasi              = Rp. 3000");
            System.out.println("4. Sambal matah               = Rp. 5000");
            System.out.println("========================================");
            System.out.print("  Masukkan Pilihan Ayam Dengan Angka = ");
            sambal = in.nextInt();
            System.out.println("========================================");
            switch (sambal) {
                case 1:
                    sambal = 1000;
                    break;
                case 2:
                    sambal = 2000;
                    break;
                case 3:
                    sambal = 3000;
                    break;
                case 4:
                    sambal = 5000;
                    break;
            }

            System.out.println("Harga Porsi ayam = Rp. " + jumlahPorsi);
            System.out.println("Harga Ayam = Rp. " + jenisAyam);
            System.out.println("Harga sambal = Rp." + sambal);
            if (harga >= 0) {
                harga = jumlahPorsi * totalPorsi + jenisAyam + sambal;

                if (harga >= 70000) {
                    diskon = harga * 10 / 100;
                    harga = harga - diskon;
                    System.out.println("Pembelian anda > 2 ekor, Anda mendapat diskon  10% = Rp. " + diskon);
                }
                if (jumlahPorsi == 1) {
                    System.out.println("Jumlah Ayam yang didapat = " + totalPorsi + " pcs/Ekor");
                    System.out.println(
                            "Anda harus membayar sejumlah Rp. " + harga + " untuk " + totalPorsi + "pcs/Ekor Ayam");
                } else {
                    System.out.println("jumlah Ayam yang di dapat " + totalPorsi + "pcs/setengah ekor");
                    System.out.println("Anda harus membayar sejumlah Rp. " + harga + " untuk " + totalPorsi
                            + " pcs/Setengah Ekor Ayam");
                }

            }
            System.out.println("");
            System.out.print("Ingin transaksi lagi? masukan angka (1) = ");
            u = in.nextInt();
            System.out.println("");

        }
        // kondisi perulangan
        while (u == 1);
        System.out.println("MENUTUP PROGRAM");
    }

}
