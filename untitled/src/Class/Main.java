package Class;

public class Main {
    public static void main(String[] args){
        Car newCar1 = new Car(60, "BMW");
        Car newCar2 = new Car();
        newCar2.plaka = 34;
        newCar2.marka = "Mercedes";

        System.out.println(newCar2.plaka);
        System.out.println(newCar1.getPlaka());
        newCar1.getPlaka();
        newCar2.plaka = 79;
        System.out.println(newCar2.plaka);

        //newCar2.carStart();
        // System.out.println("Plaka : "+newCar2.plaka +" "+"Model : "+ newCar2.marka);

        System.out.println(newCar1);
    }
}
