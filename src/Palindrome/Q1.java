package Palindrome;

public class Q1 {
    public static void main(String[] args) {
        String str1="ABCBA";
        String str2="";
        for (int i=str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);

        }
        if (str1.equals(str2)){
            System.out.println("String Is Palindrome");

        }
        else {
            System.out.println("string is not Palindrome");
        }
    }
}

//ExplainCode
//        This code is used to check if a given string is a palindrome or not. A palindrome is a word, phrase, or sequence
//        that reads the same backward as forward.
//        The code starts by declaring two strings, str1 and str2. The first string (str1) is initialized with the value
//        "ABCBA". Then, a for loop is used to iterate through the characters of the string in reverse order and store
//        them in the second string (str2). After the loop has finished executing, the two strings are compared using
//        the equals() method. If they are equal, then the string is a palindrome and the message "String Is Palindrome"
//        is printed. Otherwise,
//        the message "string is not Palindrome" is printed.
