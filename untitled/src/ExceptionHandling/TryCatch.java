package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args){

        try {
            int[] array = new int[]{3,4,5};
            int sayi = array[4];
        }
        catch (Exception exception){
            System.out.println("Hata oluştu!!");
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Program çalıştı...");
        }

    }
}
