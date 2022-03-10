package org.example.learn;

public class Test6 {

    public static void main(String[] args) {

        String A="sdfsdfsdff";
        /* Enter your code here. Print output to STDOUT. */

        boolean isOK = false;

        for(int i=0; i<A.length(); i++) {

            if(A.charAt(i) == A.charAt(A.length()-i-1)) {
                isOK = true;
            } else {
                break;
            }
        }

        if(isOK) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
// sf
//  df
//  fd
//  ss