package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String S = "S";
        int i = 100;
        while (i > 0){
            int j = 11;
            while (j > 0){
                if (j <= 1) System.out.print("\n");
                else System.out.print(S); j--;
            }
            i = i - 10;
        }

    }
}
