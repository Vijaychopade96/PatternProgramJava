package Sequance;

public class NumDiaSeq
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 5;
        int star = 1;
        int space = 2;
        for (i = 0 ; i < line ; i++)
        {
            int num = 1;
            for (k = 0 ; k < space ; k++)
            {
                System.out.print("   ");
            }
            for (j = 0 ; j <star ; j++)
            {
                System.out.print(" "+num+" ");
                num++;
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
