package toshibaTraining.Oop;

public class BankOfficer {
    private String username;
    private String password;
    private String name;
    private int id;
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
