package Number;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Number");
        int no=sc1.nextInt();

        if (no%2==0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }


    }
}
