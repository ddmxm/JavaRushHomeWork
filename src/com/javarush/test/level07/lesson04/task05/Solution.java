package com.javarush.test.level07.lesson04.task05;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
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
        int[] array1 = new int[20];
        int[] array2 = new int[array1.length/2];
        int[] array3 = new int[array1.length/2];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array1.length; i++){
            array1[i] = Integer.parseInt(reader.readLine());
            if (i < array1.length/2){
                array2[i] = array1[i];
            }
            else if (i >= array1.length/2)
            {
                array3[i - array1.length/2] = array1[i];
            }
        }

        for (int i = 0; i < array1.length/2; i++){
            System.out.println(array3[i]);
        }

    }
}
