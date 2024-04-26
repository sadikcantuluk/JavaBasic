package AbstractClassUse;

public class Main {
    public static void main(String[] args) {
        ManCalculater man = new ManCalculater();
        WomenCalculater women = new WomenCalculater();
        KidsCalculater kid = new KidsCalculater();

        kid.Point();
        women.Point();
        man.Point();
    }
}
