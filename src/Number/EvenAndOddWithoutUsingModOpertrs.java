package Number;

import java.util.Scanner;

public class EvenAndOddWithoutUsingModOpertrs {
    static boolean isEven(int n){
        return ((n/2)* 2==n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No");
        int n=sc.nextInt();

        if (isEven(n)){
            System.out.println("No is EVEN");
        }else {
            System.out.println("No is Odd");
        }
    }
}
