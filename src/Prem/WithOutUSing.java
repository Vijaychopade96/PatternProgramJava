package Prem;

import java.util.Scanner;

public class WithOutUSing {
    public static void main(String[] args) {
        int num1;
        int num2;
        int mod;
        int q;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Two No");
        num1=sc1.nextInt();
        num2=sc1.nextInt();
        q=num1/num2;
        mod=num1-num2*q;
        System.out.println("Modulo Division :Is"+mod);
    }
}
