package Prem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add("DELL");
        arr.add("Hp");
        arr.add("LENOVO");
        arr.add("SONY VAIo");
        arr.add("ACER");

        System.out.println("ArrayList Content:"+arr);
//
//        Iterator it=arr.iterator();
//        while (it.hasNext()){
//            Object element=it.next();
//            System.out.println(element+",");
//        }
    }
}
