package com.epam.learn.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Barsik");
        list.add("Murzik");

        for (String name : list) {
            System.out.println(name);
        }
    }
}
