package org.example.learn;

public class Test19 {

    static long substrCount(int n, String s) {

        char[] arr = s.toCharArray();


        //All of the characters are the same, e.g. aaa.
        //All characters except the middle one are the same, e.g. aadaa.
        for(int i=0; i<n; i++) {

            for(int j=0; j<n; j++) {

            }
        }

        System.out.println("-----------------");
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(substrCount(5, "asasd"));
        System.out.println(substrCount(7, "abcbaba"));
        System.out.println(substrCount(4, "aaaa"));
        System.out.println(substrCount(5, "asasd"));
        System.out.println(substrCount(5, "asasd"));
    }
}
