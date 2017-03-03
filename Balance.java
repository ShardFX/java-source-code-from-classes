// Anwar Haikal
// 3/6/15
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation

public class Balance
{
    private String name; // instance variable
    private double balance; // instance variable
    
    // Account constructor that receives two parameters
    public Balance(String name, double balance)
    {
        this.name = name; // assign name to instance variable name
        
        // validate balance is >0.0
        // if not, IV balance keeps its default value of 0.0
        if (balance > 0.0) // balance is valid
            this.balance = balance; // assign to IV balance
    }
    
    //method that deposits only valid amount
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) // if valid
            balance = balance + depositAmount; // add to two balance
    }
    
    // method returns account balance
    public double getBalance()
    {
        return balance;
    }
    
    // method that sets name
    public void setName(String name)
    {
        this.name = name;
    }
    
    //method returns name
    public String getName()
    {
        return name;
    }
}
        

