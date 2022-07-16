package Baslangic;

import java.util.Scanner;

public class Ndeme {
    public static void main(String[] args){
        int matematikNotu, fizikNotu, kimyaNotu, turkceNotu, tarihNotu, muzikNotu; 
        double ortalama;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSırasıyla Matematik, Fizik, Kimya, Türkçe, Tarih ve Müzik notlarınızı giriniz:");
        matematikNotu = scanner.nextInt();
        fizikNotu = scanner.nextInt();
        kimyaNotu = scanner.nextInt();
        turkceNotu = scanner.nextInt();
        tarihNotu = scanner.nextInt();
        muzikNotu = scanner.nextInt();
        ortalama = (matematikNotu+fizikNotu+kimyaNotu+turkceNotu+tarihNotu+muzikNotu)/6.0;

        System.out.printf("\nMatematik:\t%d\nFizik:\t\t%d\nKimya:\t\t%d\nTürkçe:\t\t%d\nTarih:\t\t%d\nMuzik:\t\t%d\n**ORTALAMA**:\t%.2f\n",
        matematikNotu, fizikNotu,kimyaNotu,turkceNotu,tarihNotu,muzikNotu,ortalama);

        System.out.println(ortalama>64 ? "\nSınıfı geçti!\n" : "\nSınıfta kaldı!");
        
        System.out.println("--------------------------------");
    }
}