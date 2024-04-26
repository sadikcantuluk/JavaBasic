package TypeChangeUse;

public class TypeChange {
    public static void main(String[] args){


        int sayi = 456;
        String metin = "8912";
        Double ondalikli = 1.74;

        String sayiTostring = String.valueOf(sayi);
        System.out.println(sayiTostring.getClass().getName());

        int metinToInteger = Integer.parseInt(metin);
        System.out.println(metinToInteger);

        int doubleToint = ondalikli.intValue();
        System.out.println(doubleToint);

        long doubleTolong = Math.round(ondalikli);
        System.out.println(doubleTolong);


    }
}
