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
    public static void bankOfficers() throws Exception {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Hay nhap thong tin dang nhap:");
        System.out.print("Username: ");
        String bankUsername = myScan.next();
        System.out.print("Password: ");
        String bankPassword = myScan.next();
        if (checkBankOfficer(bankUsername,bankPassword)){
            while(true){
                System.out.println("Xin chao tai khoan: "+bankUsername);
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
                        System.out.println("Nhap id account can tim:");
                        int accountId = myScan.nextInt();
                        boolean flagAccountId = true;
                        for(int i=0;i<Bank.linkListAccounts.size();i++)
                        {
                            if(Bank.linkListAccounts.get(i).getAccountID() == accountId)
                            {
                                System.out.println(Bank.linkListAccounts.get(i));
                                flagAccountId = false;
                            }
                        }
                        if(flagAccountId){
                            System.out.println("account Id vua nhap khong ton tai");
                        }

                    }
                    else if(accountFuntion == 2){
                        System.out.println("Thong tin toan bo account:");
                        if(Bank.linkListAccounts.size() == 0){
                            System.out.println("Chua co tai khoan nao duoc tao");
                            continue;
                        }
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
                        System.out.println("Thay doi thong tin account");
                        System.out.print("Nhap acount id can thay doi thong tin: ");
                        int accountId = myScan.nextInt();

                        boolean changeFlag = true ;
                        for(int i=0;i<Bank.linkListAccounts.size();i++)
                        {
                            if(Bank.linkListAccounts.get(i).getAccountID() == accountId)
                            {
                                System.out.println("Thong tin cua accountId "+accountId+" ban vua nhap "+ Bank.linkListAccounts.get(i));
                                System.out.print("Nhap customer name moi:");
                                String acountName = myScan.next();
                                System.out.print("Nhap customer address moi:");
                                String accountAdress = myScan.next();
                                System.out.print("Nhap customer username moi: ");
                                String accountUsername = myScan.next();
                                System.out.print("Nhap customer password moi: ");
                                String accountPassword = myScan.next();
                                System.out.print("Nhap so du moi: ");
                                int acountBalance = myScan.nextInt();
                                Account account = new Account(accountId,acountName,accountAdress,accountUsername,accountPassword,acountBalance);
                                Bank.linkListAccounts.set(i,account);
                                System.out.println("Thay doi thanh cong");
                                System.out.println(account.toString());
                                changeFlag = false;
                            }

                        }
                        if(changeFlag){
                            System.out.println("Id da nhap khong co");
                        }

                    }
                    else if(accountFuntion == 5){
                        System.out.println("Nhap id account can xoa:");
                        int accountId = myScan.nextInt();
                        boolean deleteFlag = true;
                        for(int i=0;i<Bank.linkListAccounts.size();i++)
                        {
                            if(Bank.linkListAccounts.get(i).getAccountID() == accountId)
                            {
                                System.out.println("Da xoa phan tu "+ Bank.linkListAccounts.get(i) );
                                deleteFlag = false;
                                Bank.linkListAccounts.remove(i);
                            }

                        }
                        if(deleteFlag){
                            System.out.println("Id da nhap khong co");
                        }


                    }
                    else if(accountFuntion == 6){
                        System.out.println("Ban da dang xuat");
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
    public static void customer() throws Exception {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Chuc nang danh cho nguoi dung");
        System.out.print("Nhap customer username: ");
        String accountUsername = myScan.next();
        System.out.print("Nhap customer password: ");
        String accountPassword = myScan.next();
        int customerID = -1;
        boolean flagCustomer = true;
        for(int i=0;i<Bank.linkListAccounts.size();i++)
        {
            if(Bank.linkListAccounts.get(i).checkAccount(accountUsername, accountPassword))
            {
                customerID = i;
                flagCustomer = false;
            }
        }
        if(flagCustomer){
            System.out.println("Tai khoan hoac mat khau khong dung");
        }
        else {
            while (true) {
                try {
                    System.out.println("Xin chao khach hang: "+ accountUsername);
                    System.out.println("Moi ban chon chuc nang");
                    System.out.println("1:Truy van tai khoan");
                    System.out.println("2:Rut tien");
                    System.out.println("3:Gui tien");
                    System.out.println("4:Dang xuat");
                    int customerNumberFuntion = myScan.nextInt();
                    if(customerNumberFuntion == 1){
                        System.out.println("Thong tin tai khoan:");
                        System.out.println(Bank.linkListAccounts.get(customerID));
                    }
                    else if(customerNumberFuntion == 2){
                        System.out.print("So tien hien tai dang co: ");
                        int customerBalance = Bank.linkListAccounts.get(customerID).getBalance();
                        System.out.println(customerBalance);
                        System.out.print("Moi ban nhap so tien can rut: ");
                        int widthDrawMoney = myScan.nextInt();
                        if(customerBalance >= widthDrawMoney){
                            Bank.linkListAccounts.get(customerID).widthDrawMoney(widthDrawMoney);
                            System.out.println("Rut tien thanh cong\n" +
                                    "So tien hien tai: "+Bank.linkListAccounts.get(customerID).getBalance());
                            System.out.println("Moi ban thuc hien cac chuc nang khac");
                        }
                        else {
                            System.out.println("So tien khong du de rut");
                        }
                    }
                    else if(customerNumberFuntion ==3){
                        System.out.print("So tien hien tai dang co: ");
                        int customerBalance = Bank.linkListAccounts.get(customerID).getBalance();
                        System.out.println(customerBalance);
                        System.out.print("Moi ban nhap so tien can gui vao: ");
                        int depositMoney = myScan.nextInt();
                        Bank.linkListAccounts.get(customerID).depositMoney(depositMoney);
                        System.out.println("So tien sau khi gui them la: "+Bank.linkListAccounts.get(customerID).getBalance());
                        System.out.println("Moi ban thuc hien cac chuc nang khac");
                    }
                    else if(customerNumberFuntion == 4){
                        System.out.println("Quy khach vua dang xuat");
                        break;
                    }
                    else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Hay nhap so tu 1 den 4");
                }
            }
        }
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
                        System.out.println("Chuc nang dang hoan thien");
                        //bankAdminOfficer();

                    } else if (mainFuntion == 2) {
                        bankOfficers();
                    } else if (mainFuntion == 3) {
                        customer();
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
