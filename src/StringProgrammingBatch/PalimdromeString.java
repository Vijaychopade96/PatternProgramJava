package StringProgrammingBatch;

import java.util.Scanner;

public class PalimdromeString {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Your String");

        String str1=sc1.next();
        String str2="";
        for (int i=str1.length()-1;i>=0;i--) {

            str2 = str2 + str1.charAt(i);

        }
//        System.out.println(str2);

        if (str1.equals(str2)){
            System.out.println("String Is Palindrome");

        }
        else {
            System.out.println("string is not Palindrome");
        }

    }
}
