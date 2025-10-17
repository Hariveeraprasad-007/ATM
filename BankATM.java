class BankATM extends ATM{
    protected Account Account;
    public BankATM(Account account){
        this.Account=account;
    }
    @Override
    public void withdraw(double amount){
        if(amount>Account.getBalance()){
            System.out.println("There is sufficent Balance");
        }
        else{
            Account.setBalance(Account.getBalance()-amount);
            System.out.println("Amount Debited: "+amount);
            System.out.println("Balance: "+Account.getBalance());
        }
    }
    public void deposite(double amount){
        double balance=Account.getBalance();
        Account.setBalance(balance+amount);
        System.out.println("Amount Credited: "+amount);
        System.out.println("Balance: "+Account.getBalance());
    }
    public void checkBalance(){
        System.out.println("Balance: "+Account.getBalance());
    }
    public double getBalance(){
        return Account.getBalance();
    }
}