package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
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

        String name = bufferedReader.readLine();
        String zp = bufferedReader.readLine();
        String years = bufferedReader.readLine();

        int nzp = Integer.parseInt(zp);
        int nyears = Integer.parseInt(years);

        output(name,nzp,nyears);

    }

    public static void output(String n, int a, int b){
        System.out.println(n + " получает "+a+" через " + b + " лет.");
    }
}