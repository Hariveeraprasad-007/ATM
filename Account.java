class Account{
    private String AccountNumber;
    private double balance;
    private int pin;
    public Account(String AccountNumber,double Balance,int pin){
        this.AccountNumber=AccountNumber;
        this.balance=Balance;
        this.pin=pin;
    }
    public String getAccountNumber(){
        return AccountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double Balance){
        this.balance=Balance;
    }
    public boolean validatepin(int enterpin){
        return enterpin==this.pin;
    }
}