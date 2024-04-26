package ExceptionHandling;

public class ThrowExceptionUse {
    public static void main(String[] args){
        AccountManager manager = new AccountManager();

        System.out.println(manager.getBalance());
        manager.Deposit(250);
        System.out.println(manager.getBalance());
        try {
            manager.WithDraw(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(manager.getBalance());
        try {
            manager.WithDraw(60);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(manager.getBalance());
    }
}


class AccountManager{
    private double balance;

    public void Deposit(double amount){
        balance = getBalance() + amount;
    }

    public void WithDraw(double amount) throws Exception {
        if (getBalance() > amount){
            balance = getBalance() - amount;
        }
        else{
            throw new Exception("Bakiye Yetersiz !!!!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
