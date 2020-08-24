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
    public String toString(){
        return "ID: "+accountID+" Name: "+customerName+" Address:"+customerAddress
                +" Customer Name: "+cutomerUserName+" Customer Password: "+cutomerPassword
                +" Balance: " + Balance;
    }
    public String getAccount(){
        return "true";
    }
    public int getBalance(){
        return Balance;
    }
    public int depositMoney(){
        return Balance;
    }
    public int widthDrawMoney(){
        return Balance;
    }
}
