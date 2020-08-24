package toshibaTraining.Oop;
import static toshibaTraining.Oop.Bank.checkSuperAdmin;
import java.util.Scanner;

public class Main {
    public static void bankOfficer(){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Hay nhap:");
        System.out.print("Username: ");
        String superUsername = myScan.next();
        System.out.print("Password: ");
        String superPassword = myScan.next();
        if (checkSuperAdmin(superUsername,superPassword)){
            System.out.println("Chon chuc nang");
            System.out.println("1.Tim nhan vien ngan hang");
            System.out.println("2.Hien thi toan bo nhan vien ngan hang");
            System.out.println("3.Them nhan vien ngan hang");
            System.out.println("4.Sua thong tin nhan vien ngan hang");
            System.out.println("5.Xoa thong tin nhan vien ngan hang");
            try {
                int bankFuntion = myScan.nextInt();
                if(bankFuntion == 1){

                }
                else if(bankFuntion == 2){
                    System.out.println(Bank.linkListBankOfficers);
                }
                else if(bankFuntion == 3){
                    BankOfficer bankOfficer = new BankOfficer();
                    System.out.print("Nhap id: ");
                    int BankOfficerId = myScan.nextInt();
                    System.out.print("Nhap bank officers name:");
                    String bankOfficersName = myScan.next();
                    System.out.print("Nhap bank officers username:");
                    String bankOfficersUsername = myScan.next();
                    System.out.println("Nhap bank officers password: ");
                    String bankOfficersPassword = myScan.next();
                    bankOfficer.setBankOfficer(BankOfficerId,bankOfficersUsername,bankOfficersPassword,bankOfficersName);
                    Bank.linkListBankOfficers.add(bankOfficer);
                    System.out.println("Them thanh cong");

                }
                else if(bankFuntion == 4){

                }
                else if(bankFuntion == 5){

                }
                else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Hay nhap tu 1 den 5");
            }
        };

    }
    public static void main(String[] args) throws Exception{
        // write your code here
            while (true){
                try {
                    Scanner myScan = new Scanner(System.in);
                    System.out.println("=====================Bank Account Management System=============================");
                    System.out.println("Chon chuc nang: \n0:Thong tin ngan hang\n1:Bank admin\n2:Bank officer\n3:Customer\n4:Exit");
                    int mainFuntion = myScan.nextInt();
                    if (mainFuntion == 0){
                        Bank bank = new Bank();
                        System.out.println(bank.getBankInformation());
                    }
                    else if (mainFuntion == 1) {
                        bankOfficer();

                    } else if (mainFuntion == 2) {
                        System.out.println(mainFuntion);

                    } else if (mainFuntion == 3) {
                        System.out.println(mainFuntion);
                    } else if (mainFuntion == 4)
                    {
                        System.out.println("Chuong trinh ket thuc");
                        System.exit(0);
                    } else
                    {
                        throw new Exception();
                    }
                }
                catch (Exception e){
                    System.out.println("Hay nhap tu 0 den 4");
                }
            }

        }
}
