package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // напишите тут ваш код
        try
        {
            //add your code here
            Scanner consolereader = new Scanner(System.in);
            String fileName = consolereader.nextLine();
            Scanner filereader = new Scanner(new File(fileName));
            String data = "";
            ArrayList<Integer> arrayList = new ArrayList<Integer>();

            while (filereader.hasNext()){
                data = filereader.nextLine();
                if (Integer.parseInt(data) % 2 == 0) arrayList.add(Integer.parseInt(data));
            }
            Collections.sort(arrayList);

            for (Integer i : arrayList){
                System.out.println(i);
            }

            filereader.close(); //закрываем потоки
            consolereader.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
