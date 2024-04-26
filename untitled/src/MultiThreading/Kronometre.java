package MultiThreading;

public class Kronometre implements Runnable {

    private Thread thread;
    private String threadName;

    public Kronometre(String threadName) {
        this.threadName = threadName;
        System.out.println(threadName + " Oluşturuluyor...");
    }

    @Override
    public void run() {
        System.out.println(threadName + " Çalıştırılıyor...");

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(threadName + " Bitti.");
    }

    public void start(){
        System.out.println("Thread nesnesi oluşturuluyor...");
        if (thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
