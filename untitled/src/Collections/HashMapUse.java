package Collections;

import java.util.HashMap;

public class HashMapUse {
    public static void main(String[] args) {

        HashMap<String, String> sozluk = new HashMap<String, String>();

        sozluk.put("car","araba");
        sozluk.put("book","kitap");
        sozluk.put("pencil","kalem");
        sozluk.put("exit","çıkış");
        sozluk.put("table","masa");

        System.out.println(sozluk);
        System.out.println(sozluk.size());
        System.out.println(sozluk.get("table"));
        System.out.println(sozluk.remove("pencil"));

        System.out.println("-----------------------------");

        for (String item : sozluk.keySet()) {
            System.out.println(item);
            System.out.println("Key :"+item+" Value :"+sozluk.get(item));
        }


    }
}
