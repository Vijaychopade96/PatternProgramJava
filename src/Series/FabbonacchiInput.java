package Series;

import java.util.Scanner;

public class FabbonacchiInput {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Number 1");
        int no1=sc1.nextInt();
        System.out.println("Enter Number 2");
        int no2=sc1.nextInt();

        for (int i=0;i<no1;i++){
            System.out.println(no1+"\t");
            int a=no1+no2;
            no1=no2;
            no2=a;

        }
    }
}
