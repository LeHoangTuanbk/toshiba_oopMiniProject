package toshibaTraining.Oop;

public class BankOfficer {
    private static String username="admin";
    private static String password="admin";
    private String name="admin";
    private int id;
    public static boolean checkBankOfficer(String bankOfficerUsername, String bankOfficerPassword){
        return (username.equals(bankOfficerUsername) && password.equals(bankOfficerPassword));
    }
    public String getBankOfficer(){
        return this.id+" "+this.name+""+this.username+""+this.password;
    }

    public boolean setBankOfficer(int id, String username, String password, String name){
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        return true;
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
    public String findAccount(){
        return "true";
    }
    public boolean deleteAccount(){
        return true;
    }


}
