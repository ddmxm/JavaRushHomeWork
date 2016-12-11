package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        int age;
        Boolean sex;
        int weight;
        int height;
        Human kids;

        Human (String name){
            this.name = name;
        }

        Human (String name, Boolean sex){
            this.name = name;
            this.sex = sex;
        }

        Human (String name, int age){
            this.name = name;
            this.age = age;
        }

        Human (String name, Boolean sex, int weight)
        {
            this.name = name;
            this.sex = sex;
            this.weight = weight;
        }

        Human (String name, Boolean sex, int height, int weight)
        {
            this.name = name;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        Human (String name, int age, Boolean sex, int height, int weight)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        Human (String name, int age, Boolean sex, int height, int weight, Human kids)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.kids = kids;
        }

        Human (String name, int age, Boolean sex, int height, Human kids)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.kids = kids;
        }

        Human (String name, int age, int height, int weight, Human kids)
        {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.kids = kids;
        }

        Human (String name, Boolean sex, int height, int weight, Human kids)
        {
            this.name = name;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.kids = kids;
        }


    }
}
