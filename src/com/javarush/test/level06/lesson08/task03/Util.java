package com.javarush.test.level06.lesson08.task03;

/* Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        //напишите тут ваш код
        double xx1 = (double)x1;
        double yy1 = (double)y1;
        double xx2 = (double)x2;
        double yy2 = (double)y2;

        return (Math.sqrt(Math.pow(xx2 - xx1, 2) + Math.pow(yy2 - yy1, 2)));

    }
}
