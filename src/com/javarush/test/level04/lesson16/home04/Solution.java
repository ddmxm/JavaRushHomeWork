package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();

        String y = bufferedReader.readLine();
        //int yint = Integer.parseInt(y);

        String m = bufferedReader.readLine();
        //int mint = Integer.parseInt(m);

        String d = bufferedReader.readLine();
        //nt dint = Integer.parseInt(d);

        proverka(name, y, m, d);
    }

    public static void proverka (String name, String y, String m, String d)
    {
        System.out.println("Меня зовут " + name + "\n" +
                "Я родился " + d + "." + m + "." + y);
    }
}
