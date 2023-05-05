package Abstarction;

public class honda extends Bike{
    void run(){
        System.out.println("Running safely");
    }

    public static void main(String[] args) {
        Bike b1=new honda();
        b1.run();
    }
}
