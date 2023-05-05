package Series;

public class FebbonacchiSeries
{
    public static void main(String[] args)
    {
        int n1=0 ;
        int n2 = 1;

        for (int i = 0 ; i<10 ; i++)
        {
            int a = n1+n2;
            n1=n2;
            n2=a;

            System.out.print(n1+"\t");

        }
    }
}
//
//Explain Code
//    This code is used to print the first 10 numbers of the Fibonacci sequence.
//        The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding numbers.
//        In this code, the variables n1 and n2 are initialized to 0 and 1 respectively, which are the first two numbers in the Fibonacci sequence. A for loop is then used to iterate 10 times, printing the value of n1 each time. After each iteration, the values of n1 and n2 are updated to the sum of their previous values. This process continues until the 10th iteration,
//        at which point the first 10 numbers of the Fibonacci sequence have been printed.
