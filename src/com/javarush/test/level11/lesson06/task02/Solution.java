package com.javarush.test.level11.lesson06.task02;

/* Домашние животные
Написать три класса: Pet (домашнее животное), Cat(кот) и Dog(собака).
Унаследовать кота и собаку от животного.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Pet
    {
        String name;
        int weight;
        int heght;
        int taillength;

    }

    public class Cat extends Pet
    {
        void CatPurr(){
            System.out.println("Purr");
        }
    }

    public class Dog extends Pet
    {
        void DogWoof(){
            System.out.println("Bark!");
        }
    }
}
