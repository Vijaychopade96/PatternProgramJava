package PatternTest;

public class Pattern4 {
    public static void main(String[] args) {
        int a=4;
        for(char i=0;i<=a;i++){
            for(char j='A';j<='G';j++){
                if(j>i){
                    System.out.print(j+"\t");
                }
                else {
                    System.out.print(i+"\t");
                }
            }
            System.out.println();
        }
    }
}
