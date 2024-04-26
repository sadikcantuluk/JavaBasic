package Inheritance;

public class InheritancePencil extends InheritanceTree {
    public String marka;
    public int fiyat;
    public InheritancePencil() {
    }

    @Override
    public String toString() {
        return "Marka : "+this.marka +" "+"Fiyat : "+ this.fiyat+" Madde : "+ this.hammadde;
    }
}
