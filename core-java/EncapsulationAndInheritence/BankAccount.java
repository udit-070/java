// package core-java.EncapsulationAndPolymorphism;

public class BankAccount {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.deposit(3000);
        ac.withdraw(1000);
       System.out.println( ac.getbalance());

    }
}
class Account {
    
    private double balance;

    void deposit(double amount){
        balance = balance + amount;
        }
    
    void withdraw(double amount){
        if(amount> balance){
            System.out.println("Insufficient Funds");
        }
        else{
            balance = balance - amount;
    }
    }
    double getbalance() {
        return balance;
    }


}





