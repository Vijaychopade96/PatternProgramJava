package StringProgrammingBatch;

import java.util.Scanner;

public class Demoreverse {

    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter String ");
        String str=sc1.next();
        String str1="";

        for (int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);

        }      System.out.println("Reverse String: " +str1);
    }
}
