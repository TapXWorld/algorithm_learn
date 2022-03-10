package org.example.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Test10 {

    public static String isValid(String s) {
        int[] cache = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cache[((int) (s.charAt(i))) - 97]++;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            if (cache[i] != 0) {
                if (map.containsKey(cache[i])) {
                    map.put(cache[i], map.get(cache[i]) + 1);
                } else {
                    map.put(cache[i], 1);
                }
            }
        }

        if (map.size() > 2) {
            return "NO";
        }
        if (map.size() <= 1) {
            return "YES";
        }

        // (equal chars occurrence, different chars)
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        if (list.get(0).getValue() == 1) {
            if ((list.get(0).getKey() - 1 == list.get(1).getKey()) || list.get(0).getKey() == 1) {
                return "YES";
            }
        } else if (list.get(1).getValue() == 1) {
            if ((list.get(1).getKey() - 1 == list.get(0).getKey()) || list.get(1).getKey() == 1) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) throws IOException {
        //System.out.println(isValid("aabbc"));
        System.out.println(isValid("aabbcd"));
        //System.out.println(isValid("abc"));
       /* System.out.println(isValid("abcc"));
        System.out.println(isValid("abccc"));*/
        //System.out.println(isValid("aabbcd"));
        String a = "";
        for(int i=0;i<10000;i++) {
            a = a + "A";
        }
        byte[] buf = new byte[10000];
        FileInputStream inputStream = new FileInputStream(new File("/home/god/IdeaProjects/demo/src/main/java/org/example/learn/text.txt"));
        buf = inputStream.readAllBytes();

        System.out.println(isValid(new String(buf)));
    }
}