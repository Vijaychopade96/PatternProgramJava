package PatternTest;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        int a;
        int b;
        int d=0;

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Any Number");
        a=sc1.nextInt();

        while(a>0){
            b=a%10;
            a=a/10;
            d=(d*10)+b;

        }
        System.out.println("Reversed is:"+d);
    }
}
