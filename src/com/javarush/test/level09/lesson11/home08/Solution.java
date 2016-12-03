package com.javarush.test.level09.lesson11.home08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        int[] firstArray = new int[]{1, 2, 3, 4, 5};
        int[] secondArray = new int[]{1, 2};
        int[] thirdArray = new int[]{1, 2, 3, 4};
        int[] fourthArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] fiveArray = new int[0];
        ArrayList<int[]> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(firstArray, secondArray, thirdArray, fourthArray, fiveArray));

        return arrayList;

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
