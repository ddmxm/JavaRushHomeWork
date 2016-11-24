package com.javarush.test.level07.lesson04.task02;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String[] array = initializeArray();
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }

    }

    public static String[] initializeArray() throws IOException{
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 8; i++){
            array[i] =  reader.readLine();
        }
        return array;
    }

}