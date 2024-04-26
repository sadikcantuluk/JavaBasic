package ScannerUse;

import java.util.Scanner;

public class Calculater {
    public static void Hesapla() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayıyı girin :");
        double sayi1 = Double.valueOf(scanner.nextLine());
        System.out.print("2. Sayıyı girin :");
        double sayi2 = Double.valueOf(scanner.nextLine());

        System.out.println("---------------------");
        System.out.println("Toplama işlemi için 1 tuşuna basın.");
        System.out.println("Çıkarma işlemi için 2 tuşuna basın.");
        System.out.println("Çarpma işlemi için 3 tuşuna basın.");
        System.out.println("Bölme işlemi için 4 tuşuna basın.");
        System.out.println("---------------------");

        System.out.print("Yapacağınız işlemin numarasını seçin :");
        int type = Integer.valueOf(scanner.nextLine());

        switch (type) {
            case 1: {
                System.out.println("İşlem Sonucunuz :" + (sayi1 + sayi2));
                break;
            }
            case 2: {
                System.out.println("İşlem Sonucunuz :" + (sayi1 - sayi2));
                break;
            }
            case 3: {
                System.out.println("İşlem Sonucunuz :" + (sayi1 * sayi2));
                break;
            }
            case 4: {
                System.out.println("İşlem Sonucunuz :" + (sayi1 / sayi2));
                break;
            }
            default: {
                System.out.println("Tanımsız işlem türü !!");
            }

        }

        System.out.print("Tekrar hesap yapmak istiyorsanız y istemiyorsanız n tuşuna bas:");
        String feedback = scanner.next();

        if (feedback.equalsIgnoreCase("y")) {
            Calculater.Hesapla();
        } else {
            System.out.println("İyi günler.Tekrar bekleriz.");
        }
    }
}