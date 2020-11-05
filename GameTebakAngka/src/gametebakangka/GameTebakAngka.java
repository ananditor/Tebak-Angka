/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;

/**
 *
 * @author anand
 */
import java.util.Scanner;

public class GameTebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);// acak angka dari 0-100
        int c = 100;
        System.out.println("---------------------------------------");
        System.out.println("Selamat  Datang  di  Game  Tebak  Angka");
        System.out.println("---------------------------------------");
        System.out.println("Silahkan  Tebak  Angka  dari  0  -  100");
        System.out.println("---------------------------------------");
        do {
            System.out.println("Silahkan Masukkan Angka yang Anda Tebak");
            System.out.println("---------------------------------------");
            Scanner jawab = new Scanner(System.in);
            int b = jawab.nextInt();

            if (c > 0) {
                if (b == a) {
                    System.out.println("Selamat!!! Angka yang anda tebak BENAR!");
                    break;
                } else if (b < a) {
                    System.out.println("---------------------------------------");
                    System.out.println("Maaf, angka yang di tebak terlalu KECIL");
                } else if (b > a) {
                    System.out.println("---------------------------------------");
                    System.out.println("Maaf, angka yang di tebak terlalu BESAR");
                }

                System.out.println("---------------------------------------");
                c--;
            } else {
                System.out.println("---------------------------------------");
                System.out.println("Maaf    Kesempatanmu     Telah    Habis");
                System.out.println("Angka    yang    Dimaksud    adalah    " + a);
                System.out.println("---------------------------------------");
                break;
            }
        } while (c >= 0);
    }

}
