package Number;

public class StringReverse {
    public static void main(String[] args) {
        String str1="PROGRAMMING";
        String str2="";

        for (int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);

        }
        System.out.println(str2);


    }
}

//ExplainCode
//        This code is used to reverse a string. The String str1 is initialized with the value "PROGRAMMING".
//        The String str2 is initialized as an empty string. A for loop is then used to iterate through the characters of str1 in reverse order,
//        starting from the last character and ending at the first character.
//        Each character is added to the end of str2. Finally,
//        the reversed string is printed out using the System.out.println() method.
