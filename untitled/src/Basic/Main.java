package Basic;

import Inheritance.InheritancePencil;
import Inheritance.InheritanceTree;
import InterfaceUse.BookInterfaceUse;
import OverloadingUse.Overloading;
import ScannerUse.BilgiKarti;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //variables();

        //conditionBlocks();

        //cycles();

        //series();

        //workingWithStrings();

        //argumentsVariables(3,4,11);

        //classUse();

        //kullanicidanVeriAlma();

        //BilgiKarti.GetInfo();

        kod5();
    }

    public static void variables() {
        System.out.println("Hello World !");

        //Değişkenler

        int tamsayi = 104;
        String name = "Sadıkcan Tuluk Hoş Geldin";
        double ondalikSayi = 0.987;
        float ondalikSayi2 = 1.23F;  //FLOAT OLD. BELİRTMEK İÇİN SONUNA f(büyük veya küçük) harfi konur.
        char karakter = 'S';
        boolean kosul = true;
        System.out.println(kosul);
    }

    public static void conditionBlocks() {
        //Şart Blokları (if-else ve switch-case)

        int deger = 15;

        if (deger < 10) {
            System.out.println("Sayımız 10'dan küçüktür. => " + deger);
        } else if (deger == 10) {
            System.out.println("Sayımız 10'a eşittir. => " + deger);
        } else {
            System.out.println("Sayımız 10'dan büyüktür. => " + deger);
        }

        switch (deger) {
            case 10:
                System.out.println("Sayımız 10'dur.");
                break;
            case 20:
                System.out.println("Sayımız 20'dur.");
                break;
            case 30:
                System.out.println("Sayımız 30'dur.");
                break;
            case 40:
                System.out.println("Sayımız 40'dur.");
                break;
            default:
                System.out.println("Malesef deger bulunamdaı.");
        }

    }

    public static void cycles() {
        //Döngüler (FOR WHILE DO-WHILE)

        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti.");

        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        }
        System.out.println("While döngüsü bitti.");

        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 10);
        System.out.println("Do-While döngüsü bitti.");
    }

    public static void series() {
        //Diziler

        String[] liste = new String[4];
        liste[0] = "Sadık";
        liste[1] = "Ayşegül";
        liste[2] = "Mehtap";
        liste[3] = "Edanur";

        //VEYA

        String[] liste2 = new String[]{
                "Ayşe", "Fatma", "Hayriye"
        };

        //VEYA

        String[] liste3 = {"Halil", "İbrahim", "Mustafa"};

        for (String item : liste3) {      //JAVA DA FOREACH KULLANIMI.
            System.out.println(item);
        }

        //2 Boyutlu Diziler (Matrisler)
        String[][] matris = new String[3][3];

        matris[0][0] = "Ankara";
        matris[0][1] = "Konya";
        matris[0][2] = "Eskişehir";
        matris[1][0] = "Trabzon";
        matris[1][1] = "Samsun";
        matris[1][2] = "Tokat";
        matris[2][0] = "Adana";
        matris[2][1] = "Mersin";
        matris[2][2] = "Hatay";

        for (int i = 0; i < 3; i++) {
            System.out.println("------------------");
            for (int k = 0; k < 3; k++) {
                System.out.println(matris[i][k]);
            }
        }
    }

    public static void workingWithStrings() {
        //Stringlerle çalışmak.

        String cumle = "Bugün hava çok soğuk.";
        System.out.println(cumle.length());
        System.out.println(cumle.startsWith("Bugün"));
        System.out.println(cumle.endsWith("."));

        char[] charList = new char[4];
        cumle.getChars(6, 10, charList, 0);
        System.out.println(charList);

        int indexNumarasiBastan = cumle.indexOf("a");
        System.out.println(indexNumarasiBastan);

        int indexNumarasiBastan2 = cumle.indexOf("çok");
        System.out.println(indexNumarasiBastan2);

        int indexNumarasiSondan = cumle.lastIndexOf("a");
        System.out.println(indexNumarasiSondan);

        System.out.println(cumle.replace(" ", "-"));
        System.out.println(cumle.substring(6, 10));

        for (String item : cumle.split(" ")) {
            System.out.println(item);
        }

        System.out.println(cumle.toLowerCase());
        System.out.println(cumle.toUpperCase());


        System.out.println(cumle.trim());  //String ifadenin başındaki ve sonundaki boşlukları siler.
    }

    public static void argumentsVariables(int... sayilar) {
        int toplam = 0;
        for (int item : sayilar) {
            toplam += item;
        }
        System.out.println(toplam);
    }

    public static void kullanicidanVeriAlma() {
        Scanner input = new Scanner(System.in);

        int[][] matris = new int[2][2];

        for (int i = 0; i < 2; i++) {
            System.out.println("------------------");
            for (int k = 0; k < 2; k++) {
                System.out.print("Sayı girin : ");
                int a = input.nextInt();
                matris[i][k] = a;
            }
        }

        System.out.print(matris);
    }

    public static void kod1(){
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        String ad = scanner.nextLine();
        System.out.println("sayı: " + sayi);
        System.out.println("ad: " + ad);
    }

    public static void kod2(){
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        scanner.nextLine(); //Dummy
        String ad = scanner.nextLine();
        System.out.println("sayı: " + sayi);
        System.out.println("ad: " + ad);
    }

    public static void kod3(){
        Scanner scanner = new Scanner(System.in);
        String ad = scanner.nextLine();
        int sayi = scanner.nextInt();
        System.out.println("sayı: " + sayi);
        System.out.println("ad: " + ad);
    }

    public static void kod4(){
        Scanner scanner = new Scanner(System.in);
        String ad = scanner.nextLine();
        String ad2 = scanner.nextLine();
        System.out.println("ad: " + ad);
        System.out.println("ad2: " + ad2);
    }

    public static void kod5(){
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        System.out.println("sayi: " + sayi);
        System.out.println("sayi2: " + sayi2);
    }

    public static void kod6(){
        String metin = "Merhaba Dünya!";
        
    }

}




