package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        HashMap<String, Integer> monthes = new HashMap<String, Integer>();
        monthes.put("January", 1);
        monthes.put("February", 2);
        monthes.put("January", 3);
        monthes.put("March", 4);
        monthes.put("May", 5);
        monthes.put("June", 6);
        monthes.put("July", 7);
        monthes.put("August", 8);
        monthes.put("September", 9);
        monthes.put("October", 10);
        monthes.put("November", 11);
        monthes.put("December", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        System.out.println(month + " is " + monthes.get(month) + " month");
    }

}
