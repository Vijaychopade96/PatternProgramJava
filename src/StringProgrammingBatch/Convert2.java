package StringProgrammingBatch;

public class Convert2 {
    public static void main(String[] args) {
        String str="This is Programming Batch !!! ";
        String[] arr=str.split(" ",0);
        for (String s:arr){
            String s1= s.replace(s.charAt(0), s.toLowerCase().charAt(0));
            System.out.println(s1);
        }
    }
}
