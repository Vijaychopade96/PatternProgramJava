package VOWEL;

import java.util.Scanner;

public class StringVOWELDemo {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter String");
        String name=sc1.next();
         String newvalue=name.toLowerCase();

        char[] data=newvalue.toCharArray();
        int vCount=0;
        int cCount=0;

        for (int a=0;a<data.length;a++)
        {
            if(data[a] == 'a' || data[a] == 'e' || data[a] == 'i' || data[a] == 'o' || data[a] == 'u')

            {
                vCount++;
            }

             else
            {
                cCount++;
            }
        }
        System.out.println("Total No Of VOWELS:" + vCount);
        System.out.println("Total No Of Consonants:" + cCount);
    }

}


//ExplainCode
//        This code is used to count the number of vowels and consonants in a given string.
//        It begins by creating a Scanner object, sc1, which is used to take user input. The user is prompted to enter
//        a string, which is stored in the variable name. The string is then converted to lowercase and stored in the
//        variable newvalue.
//
//        The string is then converted to an array of characters, data, using the toCharArray() method.
//        Two variables, vCount and cCount, are initialized to 0. A for loop is then used to iterate through each
//        character in the array. If the character is a vowel (a, e, i, o, or u), the vCount variable is incremented.
//        Otherwise, the cCount variable is incremented.
//
//        Finally, the total number of vowels and consonants are printed to the console.
