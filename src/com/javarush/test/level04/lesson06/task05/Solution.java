package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
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

        String age = bufferedReader.readLine();
        int ageint = Integer.parseInt(age);

        proverka(name, ageint);
    }

    public static void proverka(String name, int ageint){
        if(ageint < 18)
            System.out.println("Подрасти еще");
    }
}
