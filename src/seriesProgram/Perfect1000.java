package seriesProgram;

public class Perfect1000 {
    public static void main(String[] args) {
        for (int j=0;j<=1000;j++){
        int a=j;
        int sum=0;
        for (int i=1;i<a;i++) {
            if (a % i == 0) {
                sum += i;

            }
        }
        if (sum==a){
            System.out.println(sum);
        }
        }
    }
}
