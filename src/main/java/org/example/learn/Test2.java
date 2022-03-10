package org.example.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("",8);

        Scanner sc= new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3; i++) {
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.format("%-15s%03d", s1, x);
        }
        System.out.println("================================");
    }
}
