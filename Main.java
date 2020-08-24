package toshibaTraining.Oop;
//import static toshibaTraining.Oop.Bank.checkSuperAdmin;
import static toshibaTraining.Oop.BankOfficer.checkBankOfficer;
import java.util.Scanner;

public class Main {
//    public static void bankAdminOfficer(){
//        Scanner myScan = new Scanner(System.in);
//        System.out.println("Hay nhap:");
//        System.out.print("Username: ");
//        String superUsername = myScan.next();
//        System.out.print("Password: ");
//        String superPassword = myScan.next();
//        if (checkSuperAdmin(superUsername,superPassword)){
//            System.out.println("Chon chuc nang");
//            System.out.println("1.Tim nhan vien ngan hang");
//            System.out.println("2.Hien thi toan bo nhan vien ngan hang");
//            System.out.println("3.Them nhan vien ngan hang");
//            System.out.println("4.Sua thong tin nhan vien ngan hang");
//            System.out.println("5.Xoa thong tin nhan vien ngan hang");
//            try {
//                int bankFuntion = myScan.nextInt();
//                if(bankFuntion == 1){
//
//                }
//                else if(bankFuntion == 2){
//                    System.out.println(Bank.linkListBankOfficers);
//                }
//                else if(bankFuntion == 3){
//                    BankOfficer bankOfficer = new BankOfficer();
//                    System.out.print("Nhap id: ");
//                    int BankOfficerId = myScan.nextInt();
//                    System.out.print("Nhap bank officers name:");
//                    String bankOfficersName = myScan.next();
//                    System.out.print("Nhap bank officers username:");
//                    String bankOfficersUsername = myScan.next();
//                    System.out.println("Nhap bank officers password: ");
//                    String bankOfficersPassword = myScan.next();
//                    bankOfficer.setBankOfficer(BankOfficerId,bankOfficersUsername,bankOfficersPassword,bankOfficersName);
//                    Bank.linkListBankOfficers.add(bankOfficer);
//                    System.out.println("Them thanh cong");
//
//                }
//                else if(bankFuntion == 4){
//
//                }
//                else if(bankFuntion == 5){
//
//                }
//                else {
//                    throw new Exception();
//                }
//            } catch (Exception e) {
//                System.out.println("Hay nhap tu 1 den 5");
//            }
//        };
//
//    }
    public static void bankOfficers(){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Hay nhap thong tin dang nhap:");
        System.out.print("Username: ");
        String bankUsername = myScan.next();
        System.out.print("Password: ");
        String bankPassword = myScan.next();
        if (checkBankOfficer(bankUsername,bankPassword)){
            while(true){
                System.out.println("Xin chao "+bankUsername);
                System.out.println("Chon chuc nang cua bank offficer");
                System.out.println("1.Tim tai khoan");
                System.out.println("2.Hien thi toan bo tai khoan");
                System.out.println("3.Them tai khoan");
                System.out.println("4.Sua thong tin tai khoan");
                System.out.println("5.Xoa tai khoan");
                System.out.println("6.Dang xuat");
                try {
                    int accountFuntion = myScan.nextInt();
                    if(accountFuntion == 1){
                        System.out.println("Nhap id can tim:");
                        int accountId = myScan.nextInt();
                        for(int i=0;i<Bank.linkListAccounts.size();i++)
                        {
                            if(Bank.linkListAccounts.get(i).getAccountID() == accountId)
                            {
                                System.out.println(Bank.linkListAccounts.get(i));
                            }
                        }

                    }
                    else if(accountFuntion == 2){
                        System.out.println("Thong tin toan bo account:");
                        for(int i=0;i<Bank.linkListAccounts.size();i++)
                        {
                            System.out.println(Bank.linkListAccounts.get(i));
                        }
                    }
                    else if(accountFuntion == 3){
                        System.out.println("Tao moi mot account");
                        System.out.print("Nhap acount id: ");
                        int acountId = myScan.nextInt();
                        System.out.print("Nhap customer name:");
                        String acountName = myScan.next();
                        System.out.print("Nhap customer address:");
                        String accountAdress = myScan.next();
                        System.out.print("Nhap customer username: ");
                        String accountUsername = myScan.next();
                        System.out.print("Nhap customer password: ");
                        String accountPassword = myScan.next();
                        System.out.print("Nhap so du: ");
                        int acountBalance = myScan.nextInt();
                        Account account = new Account(acountId,acountName,accountAdress,accountUsername,accountPassword,acountBalance);
                        Bank.linkListAccounts.add(account);
                        System.out.println("Them thanh cong");
                        System.out.println(account.toString());

                    }
                    else if(accountFuntion == 4){

                    }
                    else if(accountFuntion == 5){

                    }
                    else if(accountFuntion == 6){
                        break;
                    }
                    else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Hay nhap tu 1 den 6");
                }

            }

        }
        else {
            System.out.println("Tai khoan hoac mat khau khong dung");
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
                        System.out.println("Chuc nang dang hoan thien\n");
                        //bankAdminOfficer();


                    } else if (mainFuntion == 2) {
                        bankOfficers();

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
