package org.example.learn;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int n = 10;

        int beforeValue = 1;
        int count = 0;

        for(int i=0;i<n;i++) {

            count = count + beforeValue * b;

            System.out.print(count+a + " ");

            beforeValue = beforeValue * 2;
        }
    }
}
