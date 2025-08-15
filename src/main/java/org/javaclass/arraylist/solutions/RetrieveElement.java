package org.javaclass.arraylist.solutions;

import java.util.ArrayList;
import java.util.List;

//! 1. Retrieve "Apple"  from fruitList
//! 2. Retrieve "Cherry" from fruitList
//! 3. Store each value in the appropriate variable type
//! 4. Output each variable to console
public class RetrieveElement {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>(List.of("Apple", "Banana", "Cherry", "Date"));
        String apple = fruitList.get(0);
        String cherry = fruitList.get(2);

        System.out.println(apple);
        System.out.println(cherry);
    }
}
