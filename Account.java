package toshibaTraining.Oop;

public class Account {
    private int accountID;
    private String customerName;
    private String customerAddress;
    private String cutomerUserName;
    private String cutomerPassword;
    private int Balance;
    public Account(int accountID,String customerName, String customerAddress, String cutomerUserName,String cutomerPassword,int balance) {
        super();
        this.accountID = accountID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.cutomerUserName = cutomerUserName;
        this.cutomerPassword = cutomerPassword;
        this.Balance = balance;
    }
    public int getAccountID(){
        return this.accountID;
    }
    public boolean checkAccount(String cutomerUserName, String cutomerPassword){
        return (this.cutomerUserName.equals(cutomerUserName) && this.cutomerPassword.equals(cutomerPassword));
    }
    public String toString(){
        return "ID: "+accountID+", Name: "+customerName+", Address:"+customerAddress
                +", Customer UserName: "+cutomerUserName+", Customer Password: "+cutomerPassword
                +", Balance: " + Balance;
    }
    public String getAccount(){
        return "true";
    }
    public int getBalance(){
        return Balance;
    }
    public int depositMoney(int depositMoney){
        this.Balance = this.Balance+depositMoney;
        return Balance;
    }
    public int widthDrawMoney(int widthDrawMoney){
        this.Balance = this.Balance-widthDrawMoney;
        return this.Balance;
    }
}
