package Prem;

public class Pattern {
    public static void main(String[] args) {
        int line=5;
        for (int i=0;i<line;i++){

            for (int j=0;j<=i;j++){
                if (j%2==0){
                    System.out.print("@ ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
