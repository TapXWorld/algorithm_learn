package org.example.learn;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class Test7 {

    private static void addToMapList(String a, Map<String, Integer> mapList, int operator) {
        for (int j=0; j<a.length(); j++) {
            String key = String.valueOf(a.charAt(j));
            if(!mapList.containsKey(key)) {
                //default value. if A set 1, if B set -1
                mapList.put(key, operator);
            } else {
                //handle repeat string. if A repeat +1, if B repeat -1;
                mapList.put(key, mapList.get(key) + operator);
            }
        }
        System.out.println(mapList);
    }

    public static void makeAnagram(String a, String b) {
        Map<String, Integer> mapList = new HashMap<>();
        addToMapList(a, mapList, 1);
        addToMapList(b, mapList, -1);

        int count = 0;
        Iterator<Map.Entry<String,Integer>> entry =  mapList.entrySet().iterator();
        while(entry.hasNext()) {
            Map.Entry<String,Integer> entryEntity = entry.next();

            if(0 != entryEntity.getValue()) {
                count = count + Math.abs(entryEntity.getValue());
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) throws IOException {
        makeAnagram("showman", "woman");
        makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
    }
}

