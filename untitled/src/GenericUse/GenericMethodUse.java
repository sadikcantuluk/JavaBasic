package GenericUse;

public class GenericMethodUse {
    public static <T extends IEntity> void Validate(T entity){

        System.out.println("Validate çalıştı.");
    }
}
