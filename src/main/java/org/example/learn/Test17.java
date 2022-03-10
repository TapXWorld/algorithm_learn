package org.example.learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test17 {

    public static int sockMerchant(int n, List<Integer> ar) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<ar.size(); i++) {
            Integer key = ar.get(i);
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        int total = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if(value > 1) {
                total = total + value/2;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(10);
        arr.add(10);
        arr.add(30);
        arr.add(50);
        arr.add(10);
        arr.add(10);
        arr.add(20);
        System.out.println(sockMerchant(9, arr));

    }
}
