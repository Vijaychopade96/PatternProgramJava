package Rabito;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        Scanner c1=new Scanner(System.in);
        System.out.println("Enter Positon");
        int postion=c1.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(postion<=arr.length){
                System.out.println("Element is:"+arr[postion]);
                found=true;
                break;
            }
        }
        if(!found){
                System.out.println("Enter Positon upto:"+arr.length);
        }
    }
}
