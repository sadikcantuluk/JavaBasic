package Class;

//Class kullanımı.
public class Car {

    //Property tanımlama.

    /*
    Private: Sınıfa özel değişkenlerdir.
    Public: Herkese açık olan değişkenlerdir.
    Protected: Extends edenlere, türetenlere ve aynı pakette olanlara açık olan değişkenlerdir.
    Default: Hiçbir şey yazılmazsa aynı pakettekilerin erişebildiği değişkenlerdir.
     */

    //Fieldları public tamımlamada direkt erişilir.
    //Fieldları private tamımlamada direkt erişilemez. Getter ve Setterlarla erişilir.

    protected int plaka;
    protected String marka;

    //Getter ve Setterlar
    public int getPlaka() {
        return plaka;
    }

    public void setPlaka(int plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Car() {
    }

    public Car(int plaka, String marka) {
        this.plaka = plaka;
        this.marka = marka;
    }

    void carStart(){
        System.out.println("Araba çalışıyor.");
    }

    //toString() override.
    @Override
    public String toString() {
        return "Plaka : "+this.plaka +" "+"Model : "+ this.marka;
    }
}
