package org.example.learn;

import java.util.HashMap;
import java.util.Map;

public class Test8 {


    static void makeAnagram(String a, String b) {
        Map<Integer, Integer> map = new HashMap<>();

        a.chars().forEach(c -> map.put(c, map.getOrDefault(c, 0) + 1));
        System.out.println(map);

        b.chars().forEach(c -> map.put(c, map.getOrDefault(c, 0) - 1));
        System.out.println(map);

        int x = map.values().stream().reduce(0, (subtotal, value) -> subtotal + Math.abs(value));
        System.out.println(map);

        System.out.println(x);
    }

    public static void main(String[] args) {
        makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
    }
}