package org.example.learn;

import java.util.ArrayList;
import java.util.List;

public class Test12 {

    public static List<List<Integer>> arr = null;

    public static int hourglassSum(List<List<Integer>> arr) {
        //cant use 0 to init....
        int count = -999;
        for (int i=0; i<arr.size(); i++) {

            List<Integer> element = arr.get(i);

            if(arr.size()-2==i) {
                break;
            }

            int tempValue = 0;
            for(int j=0; j<element.size(); j++) {
                if(element.size()-2 == j) {
                    //System.out.println(element.get(j));
                    break;
                }

                //System.out.println("------------------------------------------");
                tempValue = element.get(j) + element.get(j+1) + element.get(j+2) + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) +arr.get(i+2).get(j+2);

                //System.out.println(element.get(j)  +"   " + element.get(j+1) + "    " + element.get(j+2));
                //System.out.println("     " + arr.get(i+1).get(j+1));
                //System.out.println(arr.get(i+2).get(j)  +"    " + arr.get(i+2).get(j+1) + "    " + arr.get(i+2).get(j+2));
                //System.out.println("--------------------("+ tempValue +")----------------------");

                if(tempValue > count) {
                    count = tempValue;
                }
            }
        }
        //System.out.println(count);
        return count;
    }



    public static void main(String[] args) {
        initData1();
        hourglassSum(arr);
        //System.out.println(integers);
    }

    public static void initData1() {
        arr = new ArrayList<>();
        //0 -4 -6 0 -7 -6
        //-1 -2 -6 -8 -3 -1
        //-8 -4 -2 -8 -8 -6
        //-3 -1 -2 -5 -7 -4
        //-3 -5 -3 -6 -6 -6
        //-3 -6 0 -8 -6 -7
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(-4);
        integers.add(-6);
        integers.add(0);
        integers.add(-7);
        integers.add(-6);

        arr.add(integers);
        integers = new ArrayList<>();

        integers.add(-1);
        integers.add(-2);
        integers.add(-6);
        integers.add(-8);
        integers.add(-3);
        integers.add(-1);

        arr.add(integers);
        integers = new ArrayList<>();
    //-8 -4 -2 -8 -8 -6
        integers.add(-8);
        integers.add(-4);
        integers.add(-2);
        integers.add(-8);
        integers.add(-8);
        integers.add(-6);

        arr.add(integers);
        integers = new ArrayList<>();
    //-3 -1 -2 -5 -7 -4
        integers.add(-3);
        integers.add(-1);
        integers.add(-2);
        integers.add(-5);
        integers.add(-7);
        integers.add(-4);

        arr.add(integers);
        integers = new ArrayList<>();
//-3 -5 -3 -6 -6 -6
        integers.add(-3);
        integers.add(-5);
        integers.add(-3);
        integers.add(-6);
        integers.add(-6);
        integers.add(-6);

        arr.add(integers);
        integers = new ArrayList<>();
//-3 -6 0 -8 -6 -7
        integers.add(-3);
        integers.add(-6);
        integers.add(0);
        integers.add(-8);
        integers.add(-6);
        integers.add(-7);

        arr.add(integers);

        for (List<Integer> test : arr) {
            System.out.println(test);
        }
    }

    public static void initData() {
        arr = new ArrayList<>();
//[[1, 1, 1, 0, 0, 0], [0, 1, 0, 0, 0, 0], [1, 1, 1, 0, 0, 0], [0, 0, 2, 4, 4, 0], [0, 0, 0, 2, 0, 0], [0, 0, 1, 2, 4, 0]]
//[[1, 1, 1, 0, 0, 0], [0, 1, 0, 0, 0, 0], [1, 1, 1, 0, 0, 0], [0, 0, 2, 4, 4, 0], [0, 0, 0, 2, 0, 0], [0, 0, 1, 2, 4, 0]]
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(0);
        integers.add(0);
        integers.add(0);

        arr.add(integers);
        integers = new ArrayList<>();

        integers.add(0);
        integers.add(1);
        integers.add(0);
        integers.add(0);
        integers.add(0);
        integers.add(0);

        arr.add(integers);
        integers = new ArrayList<>();

        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(0);
        integers.add(0);
        integers.add(0);

        arr.add(integers);
        integers = new ArrayList<>();

        integers.add(0);
        integers.add(0);
        integers.add(2);
        integers.add(4);
        integers.add(4);
        integers.add(0);

        arr.add(integers);
        integers = new ArrayList<>();

        integers.add(0);
        integers.add(0);
        integers.add(0);
        integers.add(2);
        integers.add(0);
        integers.add(0);

        arr.add(integers);
        integers = new ArrayList<>();

        integers.add(0);
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(4);
        integers.add(0);

        arr.add(integers);

        for (List<Integer> test : arr) {
            System.out.println(test);
        }
    }
}
