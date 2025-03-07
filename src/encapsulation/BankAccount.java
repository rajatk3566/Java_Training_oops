package encapsulation;

public class BankAccount {
    // Variables Declaration
    private  double balance;
    // method to deposit money
    public void deposit(double amount){
        if (amount>0){
            balance = amount+ balance;
            System.out.println("Deposited Amount: "+amount);
        }
        else{
            System.out.println("Invalid Deposit");
        }
    }
    // method to get balance
    public double getBalance (){
        return  balance;
    }
}