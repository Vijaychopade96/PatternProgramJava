package Assignments.out.production.Assignments.PatternProgramming;

public class Pattern1 {
    public static void main(String[] args) {
        int line = 5;
        int star = 5;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    System.out.print(" * ");
                } else if (i==1||j==1||i==1||j==3||i==3||j==1||i==3||j==3) {

                    System.out.print("*");
                }
                else
                {
                    System.out.print("");
                }

            }
            System.out.println("");


        }

    }
}


