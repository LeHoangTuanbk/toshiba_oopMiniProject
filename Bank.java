package toshibaTraining.Oop;

public class Bank {
    private int bankId = 1;
    private String bankName = "Viettinkbank";
    private String location = "Ha Ba Trung, Ha Noi";
    public String getBankInformation(){
        return "Id ngan hang: "+this.bankId+"\n"+"Ten ngan hang: "+this.bankName+"\n"+"Vi tri dia li: "+this.location+"\n";
    }
    public String getAllOfficers(){
        return "true";
    }
    public boolean createBankOfficer(){
        return true;
    }
    public boolean edtitBankOfficer(){
        return true;"tuan"
    }
    public boolean deleteBankOfficer(){
        return true;
    }





}
