package SpyNumber;

public class Demo2 {
    public static void main(String[] args) {
        for (int i=0;i<=10000;i++){
            int a=i;
            int sum=0;
            int  nul=1;

            while (a!=0){
                int r=a%10;
                sum+=r;
                nul*=r;
                a=a/10;
            }
            if (sum==nul){
                System.out.println(i);
            }
        }
    }
}
