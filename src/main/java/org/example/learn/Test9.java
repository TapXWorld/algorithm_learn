package org.example.learn;

public class Test9 {

    public static int alternatingCharacters(String s) {
        int beforeStr = '\0';
        int count = 0;
        for(int i=0; i<s.length(); i++) {

            if(i>s.length()-1 || s.charAt(i) == beforeStr) {
                continue;
            }

            beforeStr = s.charAt(i);

            for(int t=(i+1); t<s.length(); t++) {
                if(beforeStr == s.charAt(t)) {
                    count = count+1;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("BBBBB"));
        System.out.println(alternatingCharacters("AAABBB"));
        System.out.println(alternatingCharacters("ABABABAB"));
    }
}
