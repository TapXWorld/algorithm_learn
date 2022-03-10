package org.example.learn;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test5_1 {

    public static String getSmallestAndLargest(String s, int k) {
        String newStr = new String(s);

        java.util.List<String> listStr = new java.util.ArrayList<String>();


        for(int i=0;i<newStr.length()-1; i++ ) {
            if((newStr.length()-i) < k) {
                break;
            }
            String str = newStr.substring(i, i+k);

            if(!listStr.contains(str)) {
                listStr.add(str);
            }
        }
        listStr.sort(Comparator.naturalOrder());

        System.out.println(listStr);
        return  listStr.get(listStr.size()-1)+ "\n" + listStr.get(0) ;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}
