public class BankAccountClass
{
    double balance;
    public BankAccount(double n)
    {
        balance = n;
    }
    
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }    
    
    public void deposit(double depAmount)
    {
        balance = balance + depAmount;
    }
    
    public String toString()
    {
        return ("The balance is " + balance);
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void setBalance(double num)
    {
        balance = num;
    }
    
    public BankAccount()
    {
        balance = 100;
    }
}
