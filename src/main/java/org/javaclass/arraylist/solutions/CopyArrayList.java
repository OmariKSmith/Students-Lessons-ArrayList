package org.javaclass.arraylist.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//! 1. Copy ArrayList original to a new ArrayList using the constructor method
//! 2. Copy ArrayList original to a new ArrayList using Collections.copy
//! 3. Output both new list to console
public class CopyArrayList {
    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> newAl  = new ArrayList<>(Collections.nCopies(original.size(),0));
        List<Integer> newAl2 = new ArrayList<>();
        Collections.copy(newAl2, original);
        System.out.println(newAl);
        System.out.println(newAl2);

    }



}
