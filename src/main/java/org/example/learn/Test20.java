package org.example.learn;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Test20 {



    public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String,Integer> map = new HashMap<>();
       for(String word : magazine) {
           map.put(word, map.getOrDefault(word, 0)+1);
       }

       for(String noteWord : note) {
           if(!map.containsKey(noteWord) || map.getOrDefault(noteWord, 0) == 0) {
               System.out.println("No");
               return;
           } else {
               map.put(noteWord, map.get(noteWord)-1);
           }
       }
       System.out.println("Yes");
    }

    public static void main(String[] args) throws IOException {
        buildListCase0();
        buildListCase1();
        buildListCase2();
    }

    public static void buildListCase0() {
        List<String> magazine = new ArrayList<>();
        magazine.add("give");
        magazine.add("me");
        magazine.add("one");
        magazine.add("grand");
        magazine.add("today");
        magazine.add("night");
        List<String> note = new ArrayList<>();
        note.add("give");
        note.add("one");
        note.add("grand");
        note.add("today");
        checkMagazine(magazine, note);
    }

    public static void buildListCase1() {
        List<String> magazine = new ArrayList<>();
        magazine.add("two");
        magazine.add("times");
        magazine.add("three");
        magazine.add("is");
        magazine.add("not");
        magazine.add("four");
        List<String> note = new ArrayList<>();
        note.add("two");
        note.add("times");
        note.add("two");
        note.add("is");
        note.add("four");
        checkMagazine(magazine, note);
    }

    public static void buildListCase2() {
        List<String> magazine = new ArrayList<>();
        magazine.add("ive");
        magazine.add("got");
        magazine.add("a");
        magazine.add("lovely");
        magazine.add("bunch");
        magazine.add("of");
        magazine.add("coconuts");
        List<String> note = new ArrayList<>();
        note.add("ive");
        note.add("got");
        note.add("some");
        note.add("coconuts");
        checkMagazine(magazine, note);
    }
}
