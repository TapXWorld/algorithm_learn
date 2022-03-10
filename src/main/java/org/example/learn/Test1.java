package org.example.learn;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Object> listObj = new ArrayList<Object>();

        int x = scan.nextInt();

        double d = scan.nextDouble();

        scan.nextLine();

        String s1 = scan.nextLine();

        System.out.println("String: " + s1);
        System.out.println("Double: " + d );
        System.out.println("Int: " + x );

        scan.close();
    }
}
