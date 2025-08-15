package org.javaclass.arraylist.solutions;

import java.util.ArrayList;
import java.util.List;

//! 1. Remove "Banana" and "Date" from fruitList using a List
//! 2. Output fruitList to console
public class RemoveElements2 {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>(List.of("Apple", "Banana", "Cherry", "Date"));
        List<String> unwanted = List.of("Banana", "Date");

        fruitList.removeAll(unwanted);
        System.out.println(fruitList); // Output: [Apple, Cherry]
    }
}
