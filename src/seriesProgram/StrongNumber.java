
package seriesProgram;

public class StrongNumber {
    public static void main(String[] args) {
        int a = 145;
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

            if (sum == temp)
            {
                System.out.println("Number Is  Strong");
            } else {
                System.out.println("Number Is Not Strong");
            }

        }
    }
}