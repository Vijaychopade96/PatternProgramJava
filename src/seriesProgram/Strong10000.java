package seriesProgram;

public class Strong10000 {
    public static void main(String[] args) {
        for (int j=1;j<=1000;j++) {
            int a = j;
            int temp = a;
            int sum = 0;

            while (a != 0) {
                int r = a % 10;
                int fact = 1;
                for (int i = 0; i <= r; i++) {
                    fact *= i;
                    sum = fact;
                    a = a / 10;
                }

                if (sum == temp) {
                    System.out.println(j);


                }
            }
        }
    }
}
