package PatternTest;

public class Pattern9 {
    public static void main(String[] args) {
        int line=5;
        int star=5;
        for (int i=0;i<line;i++){
            for (int j=0;j<star;j++){
                if (i==4||j==4||i+j==4)
                System.out.print("*"+"\t");
                else
                    System.out.print(" "+"\t");
            }
            System.out.println();
        }
    }
}
