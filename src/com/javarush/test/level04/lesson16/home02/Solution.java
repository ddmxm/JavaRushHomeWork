package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();
        int aint = Integer.parseInt(a);

        String b = bufferedReader.readLine();
        int bint = Integer.parseInt(b);

        String c = bufferedReader.readLine();
        int cint = Integer.parseInt(c);

        proverka(aint, bint, cint);
    }

    public static void proverka (int a, int b, int c)
    {
        if ((a < b && a > c) || (a > b && a < c)) System.out.println(a);
        else if ((b < a && b > c) || (b > a && b < c)) System.out.println(b);
        else if ((c < a && c > b) || (c > a && c < b)) System.out.println(c);
    }
}
