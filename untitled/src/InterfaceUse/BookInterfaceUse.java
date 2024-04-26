package InterfaceUse;

import InterfaceUse.BasicCRUD;

public class BookInterfaceUse implements BasicCRUD {
    @Override
    public void delete() {
        System.out.println("Silme işlemi tamamlandı.");
    }

    @Override
    public void update() {
        System.out.println("Güncelleme işlemi tamamlandı.");
    }

    @Override
    public void add() {
        System.out.println("Ekleme işlemi tamamlandı.");
    }

    @Override
    public void create() {
        System.out.println("Oluşturma işlemi tamamlandı.");
    }
}
