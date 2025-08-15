package org.javaclass.arraylist.solutions;

import java.util.ArrayList;
import java.util.List;

//! 1. Declare and populate an ArrayList with five integers using List.of
//! 2. Add 10 to middle of the ArrayList
//! 3. Replace the fourth element in the ArrayList with the number 20
//! 4. Output to console
public class PopulateArrayList2 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        integers.add(2,10);
        integers.add(3,20);
        System.out.println(integers);
    }
}
