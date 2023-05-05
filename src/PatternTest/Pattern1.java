package PatternTest;

public class Pattern1 {
    public static void main(String[] args) {
        int a=5;

        for (int i=1;i<a;i++)
        {
            for (int j=0;j<a;j++){
                if (j==0||j==2||j==4){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }


    }
}



