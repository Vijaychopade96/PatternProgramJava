package Prem;

public class PatternDemo2 {
    public static void main(String[] args) {
        int line=4;
        int star=5;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j <star ; j++) {
                if(i==j){
                    System.out.print("*" +"\t");
                }else{

                    System.out.print(" "+"\t");
                }

            }
            System.out.println();

        }

    }
}
