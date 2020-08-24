package toshibaTraining.Oop;

import java.util.LinkedList;

public class Bank {
    private int bankId = 1;
    private String bankName = "Viettinkbank";
    private String location = "Ha Ba Trung, Ha Noi";
    private static String superAdminUsername = "admin";
    private static String superAdminPassword = "admin";
    public String getBankInformation(){
        return "Id ngan hang: "+this.bankId+"\n"+"Ten ngan hang: "+this.bankName+"\n"+"Vi tri dia li: "+this.location+"\n";
    }
    public static LinkedList<BankOfficer> linkListBankOfficers = new LinkedList<BankOfficer>();
    public static LinkedList<Account> linkListAccounts = new LinkedList<Account>();

    public static boolean checkSuperAdmin(String superUsername, String superPassword){
        return (superAdminUsername.equals(superUsername) && superAdminPassword.equals(superPassword));
    }

    public String getAllOfficers(int id, String username, String password, String name){

        return "true";
    }
    public boolean createBankOfficer(){

        return true;
    }
    public boolean edtitBankOfficer(){
        return true;
    }
    public String findBankOfficer(){
        return "true";
    }
    public boolean deleteBankOfficer(){
        return true;
    }





}
