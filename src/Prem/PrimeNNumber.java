package Prem;



import java.io.*;
import java.lang.*;
import java.util.*;
public class PrimeNNumber {

        // Java code to implement the approach
            // Function to generate first n primes
            static void generatePrime(int n)
            {
                int X = 0, i = 2;
                boolean flag;
                while(X < n){
                    flag = true;
                    for(int j = 2; j <= (double)Math.sqrt(i); j++){
                        if (i%j == 0){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.print( i + " ");
                        X++;
                    }
                    i++;
                }
                System.out.println();
            }
            // Driver code
            public static void main(String[] args)
            {
                // Test Case 1
                int N = 4;
                // Function call
                generatePrime(N);
                // Test Case 2
                N = 1;
                // Function call
                generatePrime(N);
            }
        }
