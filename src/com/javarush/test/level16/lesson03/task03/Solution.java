package com.javarush.test.level16.lesson03.task03;


/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args)
    {
        //Add your code here - добавьте свой код тут

        for (int i = 0; i < 5; i++)
        {
            list.add(new Thread(new SpecialThread()));
        }
    }

    public static class SpecialThread implements Runnable
    {
        public void run()
        {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
