package org.javaclass.arraylist.solutions;

import java.util.ArrayList;
import java.util.List;

//! 1. Remove the first 2 in the Integer ArrayList.
//! 2. Output ArrayList to console.
//! 3. Remove all zeros in the Integer ArrayList.
//! 4. Output ArrayList to console.
public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(0,0,1,1,2,0,2,3,3,3,0,0,0));
        integers.remove(4);
        System.out.println(integers);
        integers.removeAll(List.of(0));
        System.out.println(integers);
    }
}
