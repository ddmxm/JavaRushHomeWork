package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String str = bufferedReader.readLine();

        String ch = bufferedReader.readLine();
        int chint = Integer.parseInt(ch);

        proverka (str, chint);

    }
    public static void proverka(String str, int ch)
    {
        while (ch > 0){
            System.out.println(str);
            ch--;
        }

    }
}
