public class Bank {
    private int balance = 10000;
    public void withdraw(int amount){
        if(amount > balance){
            throw new InsufficientBalanceException("Not enough balance");
        }else {
            balance -= amount;
            System.out.println("Withdrawn Successfully, Remaining Balance: " + balance);
        }
    }
}
