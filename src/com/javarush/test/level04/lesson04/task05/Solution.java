package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
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

        String ch = bufferedReader.readLine();
        int chi = Integer.parseInt(ch);

        if (chi>0) {
            chi *= 2;
            System.out.println(chi);
        }
        if (chi<0) {
            chi += 1;
            System.out.println(chi);
        }

    }

}