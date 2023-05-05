package PatternTest;

public class Pattern3 {
    public static void main(String[] args) {
        int line=4;

        for (int i=0;i<=line;i++)
        {
            for (int j = 0; j <=line; j++)
            {
           if (i==4||j==0||j==4||i==0||i==j||i+j==4)

                {
                    System.out.print(" * ");
                }
                else {
               System.out.print("   ");
           }

            }
            System.out.println();
        }
    }
}
