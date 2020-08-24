package toshibaTraining.Oop;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // write your code here
        try {
            Scanner myScan = new Scanner(System.in);
            System.out.println("=====================Bank Account Management System=============================");
            System.out.println("Chon chuc nang: \n1:Bank officer\n2:Customer\n3:Exit");
            int number = myScan.nextInt();
            if (number == 1) {
                System.out.println(number);

            } else if (number == 2) {
                System.out.println(number);

            } else if (number == 3) {
                System.out.println("Chuong trinh ket thuc");
                System.exit(0);
            }
        }
        catch (Exception e){
            System.out.println("Hay nhap tu 1-3");
        }

    }
}
