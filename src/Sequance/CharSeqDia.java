package Sequance;

public class CharSeqDia
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 5;
        int star = 1;
        int space = 2;
        char ch = 'A';
        for (i = 0 ; i < line ; i++)
        {
            for (k = 0 ; k < space ; k++)
            {
                System.out.print("   ");
            }
            for (j = 0 ; j <star ; j++)
            {
                System.out.print(" "+ch+" ");
                ch++;
            }
            System.out.println();

            if (i < 2)
            {
                star+=2;
                space--;
            }
            else
            {
                star-=2;
                space++;
            }
        }
    }
}
