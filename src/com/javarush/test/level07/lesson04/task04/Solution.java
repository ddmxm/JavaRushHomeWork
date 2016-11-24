package com.javarush.test.level07.lesson04.task04;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        initializeArray();
    }

    public static void initializeArray() throws IOException{
        int[] array1 = new int[10];
        int[] array2 = new int[array1.length];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int j = array1.length - 1, i = 0; i < array1.length; i++){
            array1[i] = Integer.parseInt(reader.readLine());
            array2[j] = array1[i];
            j--;
        }
        array1 = array2;

        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }

    }


}
