package com.javarush.test.level04.lesson13.task05;

import java.io.*;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();

        proverka(a);
    }

    public static void proverka(String a)
    {
        for (int i = 1; i <= 10; i++){
            System.out.println(a + " любит меня.");
        }
    }
}
