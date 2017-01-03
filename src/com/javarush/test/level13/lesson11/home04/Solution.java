package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> stringArray = new ArrayList<String>();
        String filename = reader.readLine();
        String buffer = reader.readLine();
        stringArray.add(buffer);


        while (!buffer.equals("exit"))
        {
            buffer = reader.readLine();
            stringArray.add(buffer);
        }

        FileWriter fileWriter = new FileWriter(filename);


        for (int i = 0; i < stringArray.size(); i++)
        {
            fileWriter.write(stringArray.get(i));
            fileWriter.write("\n");
        }

        fileWriter.close();
        reader.close();

    }
}
