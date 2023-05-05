package StringProgrammingBatch;

public class StringDemo1 {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;

        for (int i=0;i<10;i++)
        {
            System.out.print(n1+"\t");
            int a=n1+n2;
            n1=n2;
            n2=a;
        }

    }

}
