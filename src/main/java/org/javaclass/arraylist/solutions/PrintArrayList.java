package org.javaclass.arraylist.solutions;


import java.util.ArrayList;
import java.util.List;

//! 1. Output Integer ArrayList contents to console
//! 2. Output only even elements to console
public class PrintArrayList {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(integers);
    }
}
