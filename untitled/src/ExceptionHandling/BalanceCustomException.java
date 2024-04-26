package ExceptionHandling;

public class BalanceCustomException extends Exception{

    String message;
    public BalanceCustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
