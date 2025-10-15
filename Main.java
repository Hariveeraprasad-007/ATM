abstract class ATM{
    abstract void withdraw(double amount);
    abstract void deposite(double amount);
    abstract void checkBalance();
}
class BankATM extends ATM{
    private double balance;
    public BankATM(double intialbalance){
        this.balance=intialbalance;
    }
    @Override
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("there is no sufficent balance to withdraw");
        }
        else{
            balance-=amount;
            System.out.println("With draw - "+amount);
        }
    }
    @Override
    public void deposite(double amount){
        balance+=amount;
        System.out.println("Deposited: "+amount);
        
    }
    public void checkBalance(){
        System.out.println("Balance: "+balance);
    }
}
public class Main{
    public static void main(String[] args){
        ATM atm=new BankATM(10000);
        atm.withdraw(5000);
        atm.deposite(100000);
        atm.checkBalance();
        atm.withdraw(5000000);
    }
}
