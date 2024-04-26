package WorkingWithFiles;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //GetFileInfo("deneme.txt");
        //GetFileRead("deneme.txt");
        GetFileWrite("deneme.txt");
    }

    public static void CreateFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosya adını giriniz :");
        String fileName = scanner.nextLine();
        System.out.print("Dosya tipini giriniz :");
        String fileType = scanner.nextLine();

        File file = new File("C:\\Users\\sadik\\OneDrive\\Masaüstü\\Yeni klasör\\FilesForJava\\" + fileName + "." + fileType);
        try {
            if (file.createNewFile()){
                System.out.println("Dosya başarıyla oluşturuldu.");
            }else {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void GetFileInfo(String fullFileName){
        File file = new File("C:\\Users\\sadik\\OneDrive\\Masaüstü\\Yeni klasör\\FilesForJava\\" + fullFileName);
        if (file.exists()){
            System.out.println("Dosya adı :"+file.getName());
            System.out.println("Dosya yolu :"+file.getPath());
            System.out.println("Dosya yolu :"+file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi? :"+file.canWrite());
            System.out.println("Dosya okunabilir mi? :"+file.canRead());
            System.out.println("Dosya boyutu (byte) :"+file.length());
        }else {
            System.out.println("Böyle bir dosya mevcut değil!");
        }
    }
    public static void GetFileRead(String fullFileName){
        File file = new File("C:\\Users\\sadik\\OneDrive\\Masaüstü\\Yeni klasör\\FilesForJava\\" + fullFileName);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void GetFileWrite(String fullFileName){
        FileWriter file = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new FileWriter("C:\\Users\\sadik\\OneDrive\\Masaüstü\\Yeni klasör\\FilesForJava\\" + fullFileName,true);
            bufferedWriter = new BufferedWriter(file);
            bufferedWriter.newLine();
            bufferedWriter.write("DOSYA YAZMA İŞLEMİ");
            System.out.println("Dosya yazıldı.");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
