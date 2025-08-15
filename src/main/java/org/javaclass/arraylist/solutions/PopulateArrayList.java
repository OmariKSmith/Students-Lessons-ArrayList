package org.javaclass.arraylist.solutions;

import java.util.ArrayList;
import java.util.List;

//! 1. Declare and populate an Integer ArrayList with  0,1,2,3,4
//! 2. Add 12,and 24 to middle of list
//! 3. Replace the second element in the ArrayList with the number 10
//! 4. Output list to console
public class PopulateArrayList {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(2,12);
        integers.add(3,24);
        integers.add(1,10);
        System.out.println(integers);

    }


}
