package org.example.learn;

import java.util.ArrayList;
import java.util.List;

public class Test14 {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        for(int i=0; i<d; i++) {
            a.add(a.size(), a.get(0));
            a.remove(0);
        }
        return a;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        arr = rotLeft(arr, 4);
        System.out.println("----------------------");
        System.out.println( arr );
        System.out.println("----------------------");
    }
}
