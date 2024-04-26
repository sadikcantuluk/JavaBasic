package ScannerUse;

import java.util.Scanner;

public class BilgiKarti {
    public static void GetInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen adınızı girin: ");
        String isim = scanner.nextLine();
        System.out.print("Lütfen soyadınızı girin: ");
        String soyad = scanner.nextLine();
        System.out.print("Lütfen yaşınızı girin: ");
        String yas = scanner.nextLine();

        System.out.println("-----------------------------");

        System.out.println("Bilgi Kartı");
        System.out.println("Ad: "+isim);
        System.out.println("Soyad: "+soyad);
        System.out.println("Yas: "+yas);
    }
}
