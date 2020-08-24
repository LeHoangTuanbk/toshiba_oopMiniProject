package toshibaTraining.Oop;

public class BankOfficer {
    private String username;
    private String password;
    private String name;
    private int id;
    public boolean checkBankOfficer(String username, String password){
        if(username == this.username && password==this.password)
        {
            return true;

        }
        else
        {
            return false;
        }
    }
    public String getAllAccont(){
        return "true";
    }
    public boolean createAccount(){
        return true;
    }
    public boolean editAccount(){
        return true;
    }
    public boolean deleteAccount(){
        return true;
    }


}
