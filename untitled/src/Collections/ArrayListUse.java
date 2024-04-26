package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUse {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add("Sadık");

        System.out.println(arrayList);
        System.out.println("---------------------------");

        //Bu haliyle typeSafe yok.

        ArrayList<Integer> sayilar = new ArrayList<Integer>();

        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);
        sayilar.add(7);

        System.out.println(sayilar);
        System.out.println("---------------------------");

        sayilar.remove(2);
        sayilar.set(3, 8);


        for (int item : sayilar) {
            System.out.println(item);
        }

        System.out.println("---------------------------");

        System.out.println(sayilar.size());
        System.out.println(sayilar.remove(3)); //remove geriye değer dönderiri.
        System.out.println(sayilar.get(1));

        System.out.println("---------------------------");

        ArrayList<String> sehirler = new ArrayList<String>();

        sehirler.add("Tokat");
        sehirler.add("Aydın");
        sehirler.add("Manisa");
        sehirler.add("Kayseri");
        sehirler.add("Adana");

        Collections.sort(sehirler);

        for (String item : sehirler) {
            System.out.println(item);
        }

        System.out.println("---------------------------");

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Sadıkcan","Tuluk"));
        customers.add(new Customer(2,"Edanur","Turan"));
        customers.add(new Customer(3,"Mehtap","Çamlı"));
        customers.add(new Customer(4,"Ayşegül","Bozdemir"));

        for (Customer item : customers) {
            System.out.println(item);
        }


    }

}






