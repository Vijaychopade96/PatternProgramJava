package StringProgrammingBatch;

public class FInd {
    public static void main(String[] args) {
        String str="PROGRAMMING";
        str=str.substring(0,7)+'*'+str.substring(8,str.length());
        System.out.println(str);
    }
}
