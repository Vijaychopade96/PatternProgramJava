package PatternTest;

public class Pattern20 {
    public static void main(String[] args) {
        int a=5;
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++) {
            if (i==0||i==2||i==4){
                System.out.print("1");
            }else {
                System.out.print("0");
            }


            }
            System.out.println();



        }
    }
}
