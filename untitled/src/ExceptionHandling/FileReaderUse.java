package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderUse {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = null;
        int total = 0;
        String line = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\sadik\\OneDrive\\Masaüstü\\Yeni klasör\\JavaDemos\\untitled\\src\\ExceptionHandling\\deneme.txt"));
            while((line = (bufferedReader.readLine())) != null){
                total +=  Integer.valueOf(line);
            }
            System.out.println(total);
        }
        catch (FileNotFoundException exception){
            System.out.println("Hata oluştu!!");
            System.out.println(exception.getMessage());
        }
        finally {
            bufferedReader.close();
            System.out.println("Program çalıştı...");
        }

    }
}
