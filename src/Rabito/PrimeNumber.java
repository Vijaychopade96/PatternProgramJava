package Rabito;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
           Scanner c1=new Scanner(System.in);
        System.out.println("How Many Prime No");
        int num=c1.nextInt();
        ArrayList<Integer>primeList=new ArrayList<>();
        for(int j=100;j>0;j--){
            int a=j;
            int count=0;


            for(int i=1;i<=a;i++){
                if(a%i==0){
                    count++;
                }
            }
            if(count==2){
                primeList.add(a);

            }
        }
        for(int i=0;i<num;i++){
            System.out.println(primeList.get(i));
        }

    }
}
