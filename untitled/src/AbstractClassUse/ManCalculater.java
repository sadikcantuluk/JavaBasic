package AbstractClassUse;

public class ManCalculater extends GameCalculater {
    @Override
    public void Point() {
        System.out.println("90 Puan alındı...");
    }

    @Override
    public void CreateItem() {
        super.CreateItem();
    }
}


