package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        char[] chars = s.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++){
            if (i == 0)
            {
                result += Character.toUpperCase(chars[0]);
            }
            else if (chars[i - 1] == ' ' && chars[i] != ' ')
            {
                result += Character.toUpperCase(chars[i]);
            }
            else result += chars[i];
            }
        System.out.println(result);
        }

        /*
        String slist[] = s.split(" ");

        for (int i = 0; i < slist.length; i++){
            System.out.print(slist[i].substring(0, 1).toUpperCase() + slist[i].substring(1));
            if (i != slist.length - 1){
                System.out.print(" ");
            }
        }*/
}
