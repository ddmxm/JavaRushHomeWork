package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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

        proverka (aint, bint, cint);

    }

    public static void proverka(int a, int b, int c)
    {
        int p = 0;
        int o = 0;

        if (a > 0) p++;
        else if (a < 0) o++;

        if (b > 0) p++;
        else if (b < 0) o++;

        if (c > 0) p++;
        else if (c < 0) o++;

        System.out.println("количество отрицательных чисел: " + o + "\n" + "количество положительных чисел: "+ p);
    }
}
