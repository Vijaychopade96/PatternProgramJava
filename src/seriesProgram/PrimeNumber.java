package seriesProgram;

public class PrimeNumber {
    public static void main(String[] args) {
        int totalcount = 0;

        for (int j = 1; j <= 1000; j++)
        {
            int count = 0;
            int a = j;

            for (int i = 1; i <= a; i++) 

                if (a%i==0)
                    count++;

                if (count == 2)
                    totalcount++;
            }
            System.out.println(totalcount);


        }
    }

