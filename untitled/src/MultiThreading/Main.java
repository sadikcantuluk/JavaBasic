package MultiThreading;

public class Main {
    public static void main(String[] args){
        Kronometre k1 = new Kronometre("Görev 1");
        Kronometre k2 = new Kronometre("Görev 2");
        Kronometre k3 = new Kronometre("Görev 3");
        Kronometre k4 = new Kronometre("Görev 4");

        k1.start();
        k2.start();
        k3.start();
        k4.start();
    }
}
