package PatternTest;

public class Pattern8 {
    public static void main(String[] args) {
        char a='A';
        int line=5;
        int star=1;
        int space=line-1;

        for (int i=0;i<line;i++){
            for (int k=0;k<space ;k++){
                System.out.print(" "+"\t");
            }
            for (int j=0;j<star;j++){
                System.out.print(a+++"\t");
            }
            space--;
            star++;
            System.out.println();
        }
    }
}
