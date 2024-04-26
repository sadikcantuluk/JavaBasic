package InterfaceUse;

public class Main {
    public static void main(String[] args){
        BookInterfaceUse book = new BookInterfaceUse();

        book.delete();
        book.add();
        book.update();
        book.create();
    }
}
