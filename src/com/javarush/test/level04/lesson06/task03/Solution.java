package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
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

    public static void proverka(int a, int b, int c){
        int max = 0;
        if (a > b && a > c)
            max = a;
        else if (b > a && b > c)
            max = b;
        else if (c > a && c > b)
            max = c;

        int min = 0;
        if (a < b && a < c)
            min = a;
        else if (b < a && b < c)
            min = b;
        else if (c < a && c < b)
            min = c;

        int mid = 0;
        if ((a < b && a > c) || (a < c && a > b))
            mid = a;
        else if ((b < a && b > c) || (b < c && b > a))
            mid = b;
        else if ((c < b && c > a) || (c < a && c > b))
            mid = c;

        System.out.println(max + " " + mid +" "+ min);

    }
}
