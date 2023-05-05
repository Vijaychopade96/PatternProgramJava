package PatternTest;

public class Pattern7 {
    public static void main(String[] args) {
        int line=5;
        int star=5;

        char ch='A';
        for (int i=0;i<star;i++){
            for (int j=0;j<star;j++){
                if (j==0||j==4)
                    System.out.print("A ");
                else if (j==1||j==3)
                    System.out.print("B ");
                else
                    System.out.print("C ");
            }
            System.out.println();
            ch++;
        }

    }
}
