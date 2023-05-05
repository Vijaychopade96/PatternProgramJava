package PatternTest;

public class Pattern11 {
    public static void main(String[] args) {

        int line=5;
        int star=1;

        for (int i=0;i<=line;i++){
            for (int j=0;j<i;j++){

                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
