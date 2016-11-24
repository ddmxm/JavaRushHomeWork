package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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
        if (a == b)
            System.out.println("3");
        if (a == c)
            System.out.println("2");
        if (b == c)
            System.out.println("1");
    }
}
