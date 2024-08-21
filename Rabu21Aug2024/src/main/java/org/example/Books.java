package org.example;

import java.util.Scanner;

public class Books {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah buku yang akan dibeli: ");
        int jumlah = sc.nextInt();
        int exemplar = jumlah * 10;
        int hargaSatuan = 5000;
        int hargaTotal = exemplar * hargaSatuan;

        if(exemplar <= 100){
            System.out.println("Total buku yang dibeli: " + jumlah + ", total exemplar: " + exemplar + ", total harga: " + hargaTotal);
        } else if (exemplar > 100 && exemplar <= 200) {
            double harga100 = 100 * hargaSatuan * (1 - 0.05);
            double hargaSisa = (exemplar - 100) * hargaSatuan * (1 - 0.15);
            double total = harga100 + hargaSisa;
            System.out.println("total buku yang dibeli adalah: " + jumlah + ", total exemplar: " + exemplar + ", total harga: " + hargaTotal);
        } else if (exemplar > 200) {
            double harga100Pertama = 100 * hargaSatuan * (1 - 0.07);
            double harga100Kedua = 100 * hargaSatuan * (1 - 0.17);
            double hargaSisa = (exemplar - 200) * hargaSatuan * (1 - 0.27);
            double total = harga100Pertama + hargaSisa + harga100Kedua;
            System.out.println("total buku yang dibeli adalah: " + jumlah + ", total exemplar: " + exemplar + ", total harga: " + hargaTotal);
        }

    }
}