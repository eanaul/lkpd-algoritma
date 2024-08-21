package org.example;

public class TahunKabisat {

    public static void main(String[] args) {

        for(int tahun = 1600; tahun <= 2024;  tahun += 4){
            if(tahun % 400 == 0){
                System.out.println(tahun + " adalah tahun kabisat");
            } else if (tahun % 400 != 0 && tahun % 100 == 0) {
                System.out.println(tahun + " bukan tahun kabisat");
            } else if (tahun % 400 != 0 && tahun % 100 != 0 && tahun % 4 == 0) {
                System.out.println(tahun + " adalah tahun kabisat");
            }else{
                System.out.println(tahun + " bukan tahun kabisat");
            }
        }

    }

}
