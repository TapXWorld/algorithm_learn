package org.example.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test13 {


    static String isBalanced(String s) {
        char[] arr=s.toCharArray();
        Stack<String> stack = new Stack<>();
        for(char t : arr) {
            switch(t){
                case '(': stack.push(t+"");
                    break;
                case '[': stack.push(t+"");
                    break;
                case '{': stack.push(t+"");
                    break;
                case ')': if(stack.size()==0 || !stack.pop().equals("("))return "NO";
                    break;
                case '}': if(stack.size()==0 || !stack.pop().equals("{"))return "NO";
                    break;
                case ']': if(stack.size()==0 || !stack.pop().equals("["))return "NO";
                    break;
            }
        }
        if(stack.size()==0)
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        //yes
        //System.out.println(isBalanced("{[()]}"));
        //no
        System.out.println(isBalanced("{[(])}"));
        //yes
        System.out.println(isBalanced("{{[[(())]]}}"));
        //yes
        System.out.println(isBalanced("{{([])}}"));
        //no
        System.out.println(isBalanced("{{)[](}}"));

        //yes no yes
        System.out.println(isBalanced("{(([])[])[]}"));
        System.out.println(isBalanced("{(([])[])[]]}"));
        System.out.println(isBalanced("{(([])[])[]}[]"));
    }
}
