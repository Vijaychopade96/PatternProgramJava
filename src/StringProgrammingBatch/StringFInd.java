package StringProgrammingBatch;

public class StringFInd {
    public static void main(String[] args) {


        String str1 = "Core Java Programming";
        int count=0;


        for (int i = 0; i < str1.length();i++){

            System.out.println(str1.indexOf('a',0));
            count++;
        }
    }
}
