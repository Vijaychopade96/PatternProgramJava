package seriesProgram;

public class PalindromeNumber {
    public static void main(String[] args) {

        for (int i = 10; i <= 1000; i++)
        {
            int a = 0;
            int sum = 0;
            int temp = a;


                while (a!=0)
                {
                    int n = a % 10;
                    sum = sum * 10 + n;
                    a/=10;
                }


            if (sum==temp) {
                System.out.println(sum);


            }
        }

    }
    }
