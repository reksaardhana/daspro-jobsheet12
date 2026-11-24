package Jobsheet12;

import java.util.Scanner;

public class HitungBalok27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Balok ke-1");
        System.out.print("Masukkan panjang: ");
        int p1 = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int l1 = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t1 = input.nextInt();
        System.out.println("Luas permukaan: " + 2 * (p1 * l1 + p1 * t1
                + l1 * t1));
        System.out.println("Volume: " + p1 * l1 * t1);

        System.out.println("Balok ke-2");
        System.out.print("Masukkan panjang: ");
        int p2 = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int l2 = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t2 = input.nextInt();
        System.out.println("Luas permukaan: " + 2 * (p2 * l2 + p2 * t2
                + l2 * t2));
        System.out.println("Volume: " + p2 * l2 * t2);

        System.out.println("Balok ke-3");
        System.out.print("Masukkan panjang: ");
        int p3 = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int l3 = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t3 = input.nextInt();
        System.out.println("Luas permukaan: " + 2 * (p3 * l3 + p3 * t3
                + l3 * t3));
        System.out.println("Volume: " + p3 * l3 * t3);

        input.close();
    }
}