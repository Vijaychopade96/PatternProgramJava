package StringProgrammingBatch;

public class SplitString {
    public static void main(String[] args) {
        String str="This is Programming Batch !!! ";
        String[] arr=str.split("m",0);
        for (String e:arr){
            System.out.println(e);
        }
    }
}
