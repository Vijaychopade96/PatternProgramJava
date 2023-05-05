package Prem;

import java.util.Scanner;

public class NthElementArray {
    public static void main(String [] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter An Index of an element");
        int n=sc1.nextInt();
        int[] array={50,60,70,10,12};
        for(int i=1;i<array.length;i++){
            if(i==n){
                System.out.println(array[i]);
            }
        }
    }
}
