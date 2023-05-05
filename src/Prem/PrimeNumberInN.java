package Prem;

import java.util.Scanner;

public class PrimeNumberInN {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc1.nextInt();
        System.out.println("Primes Number Between"+n);
        for (int i=2;i<=n;i++){
            if (isPrime(i)){

            }
        }
    }

    private static boolean isPrime(int num) {
        if (num<=1){
            return false;
        }
        for (int j=2;j<=Math.sqrt(num);j++){
            if (num%j==0){
                return  false;
            }

        }
        return true;
    }
}
