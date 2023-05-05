package CompanyTe;

public class Main1 {
    public static void main(String[] args) {
        int [] a ={4,2,3,1,3};
        for (int i=0;i<a.length;i++){
            a[i]=a[(a[i]+2)% a.length];
        }
        System.out.println(a[1]);
    }
}
