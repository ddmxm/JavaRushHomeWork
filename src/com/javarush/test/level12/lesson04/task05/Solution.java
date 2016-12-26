package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //Напишите тут ваши методы
    public static int max(int i1, int i2){
        if (i1 > i2) {
            return i1;}
        else if (i2 > i1) {
            return i2;}
        return 0;
    }
    public static long max(long l1, long l2){
        if (l1 > l2) {
            return l1;
        }
        else if (l2 > l1) {
            return l2;}
        return 0;
    }
    public static Double max(double d1, double d2){
        if (d1 > d2) {
            return d1;
        }
        else if (d2 > d1) {
            return d2;
        }
        return 0d;
    }
}
