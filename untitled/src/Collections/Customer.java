package Collections;

public class Customer {
    int id;
    String name;
    String surname;

    public Customer(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Id :" + this.id + " Ad :" + this.name + " Soyad :" + this.surname;
    }
}
