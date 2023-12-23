package test.java;

import main.java.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;
    @BeforeEach
    void init(){
        account = new BankAccount();
    }
    @Test
    public void TC001DepositIntoAccount(){
        account.deposit(100);
        assertEquals(100 , account.getBalance());
    }
    @Test
    public void TC002WithdrawFromAccountWithSufficientFund(){
        account.deposit(100);
        account.withdraw(40);
        assertEquals(60 , account.getBalance());
    }
    @Test
    public void TC003WithdrawFromAccountExceedingBalance(){
        account.deposit(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(120);
        });
    }
    @Test
    public void TC004DepositNegativeAmount(){
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100);
        });
    }
    @Test
    public void TC005WithdrawNegativeAmount(){
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-100);
        });
    }
}