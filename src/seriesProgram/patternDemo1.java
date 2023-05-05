package seriesProgram;

public class patternDemo1 {
    public static void main(String[] args) {


        int a = 1234;
        int sum = 0;

        while (a != 0) {
            int r=a%10;
            sum=sum*10+r;
            a=a/10;


        }
        System.out.println(sum);
    }
}
