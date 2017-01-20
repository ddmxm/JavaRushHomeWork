package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "One");
        labels.put(2.0, "Two");
        labels.put(3.0, "Three");
        labels.put(4.0, "Four");
        labels.put(5.0, "Five");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
