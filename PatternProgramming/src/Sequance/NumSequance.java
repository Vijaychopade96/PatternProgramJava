package Sequance;

public class NumSequance
{
    public static void main(String[] args)
    {
        int line = 4 ;
        int star = 4 ;
        int num = 1 ;

        for (int i=0 ; i<line ; i++)
        {
            for (int j=0 ; j<star ; j++)
            {
                System.out.print(num +"  ");
            }

            System.out.println();
            num++;
        }
    }
}
