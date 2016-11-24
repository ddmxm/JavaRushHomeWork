package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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

        String d = bufferedReader.readLine();
        int dint = Integer.parseInt(d);

        int sr1 = proverka(aint, bint);
        int sr2 = proverka(cint, dint);

        System.out.println(proverka(sr1, sr2));


    }

    public static int proverka(int x, int y){
        if (x > y)
            return(x);
        else
            return(y);
    }
}
