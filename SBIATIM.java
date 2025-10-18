class SBIATIM extends BankATM{
    public SBIATIM(Account account){
        super(account);
    }
    @Override
    public void withdraw(double amount){
        double a=getBalance();
        double charge=10;
        if(amount+charge>a){
            System.out.println("There is no sufficent balance.");
        }
        else{
            Account.setBalance(Account.getBalance()-(amount+charge));
            System.out.println("The"+amount+"is credited By SBIATM with charge of 10 ruppes");
        }
    }
}
