package toshibaTraining.Oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        // write your code here
            while (true){
                try {
                    Scanner myScan = new Scanner(System.in);
                    System.out.println("=====================Bank Account Management System=============================");
                    System.out.println("Chon chuc nang: \n0:Thong tin ngan hang\n1:Bank admin\n2:Bank officer\n3:Customer\n4:Exit");
                    int number = myScan.nextInt();
                    if (number == 0){
                        Bank bank = new Bank();
                        System.out.println(bank.getBankInformation());
                    }
                    else if (number == 1) {
                        System.out.println(number);

                    } else if (number == 2) {
                        System.out.println(number);

                    } else if (number == 3) {
                        System.out.println(number);
                    } else if (number == 4)
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
