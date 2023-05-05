package SpyNumber;

public class Demo1 {
    public static void main(String[] args) {
        int a=1124;
        int temp=1;
        int sum = 0;


        while (a>0){
            sum=a%10;
            temp=temp*sum;
            a=temp/10;
        }
        if (sum==temp){
            System.out.println("The Number Is Spy");
        }else {
            System.out.println("Number is not");
        }
    }
}
