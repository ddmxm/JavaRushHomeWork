package com.javarush.test.level14.lesson08.bonus03;

public class Singleton
{
    private static Singleton instance = null; // Создали переменную для хранения единственного экземпляра
    private Singleton(){} // Запретили создание через конструктор
    public static Singleton getInstance(){ // Метод getInstance
        if(instance == null){ // Если переменная пустая, мы создаем новый обьект, заносим в переменную..
            instance = new Singleton();
        }
        return instance; // И возвращаем его.
    }
}
