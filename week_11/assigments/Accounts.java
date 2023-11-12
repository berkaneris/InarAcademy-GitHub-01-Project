package week_11.assigments;

import week_09.assigments.Account;

class SavingAccounts extends Account {
    public SavingAccounts(){

    }
    public SavingAccounts(int id , double balance){
        super(id, balance);
    }
    @Override
    public String toString(){
        return "ID :" + this.getId() +
                "\nBalance is $" + this.getBalance();
    }

}
class CheckingAccount extends Account{
    private final double OVERDRAFT_LIMIT = -500;
    public CheckingAccount(){
    }
    public CheckingAccount(int id , double balance){
        super(id, balance);
    }
    public double getOVERDRAFT_LIMIT(){
        return OVERDRAFT_LIMIT;
    }
    @Override
    public String toString(){
        return  "ID :" + this.getId() +
                "\nBalance is $" + this.getBalance() +
                "\nLimit is $" + OVERDRAFT_LIMIT;
    }
}
