package org.example.learn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test15 {


    public static int pairs(int k, List<Integer> arr) {
        arr.sort(Comparator.reverseOrder());
        int count = 0;

        for(int i=0;i<arr.size();i++) {

            for(int j=i+1;j<arr.size();j++) {
                if(arr.get(i)- arr.get(j) == k || arr.get(j) - arr.get(i) == k) {
                    count++;
                } else if(arr.get(j) - arr.get(i) > k|| arr.get(i) - arr.get(j) > k) {
                    break;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.add(4);
        arr.add(2);
        System.out.println(pairs(2, arr));
    }

}


