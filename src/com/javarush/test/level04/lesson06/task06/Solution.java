package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
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
        if(ageint > 20)
            System.out.println("И 18-ти достаточно");
    }
}
