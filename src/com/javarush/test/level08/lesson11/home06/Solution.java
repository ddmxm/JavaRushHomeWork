package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(new Human("Ivan", true, 10));
        children.add(new Human("Masha", false, 9));
        children.add(new Human("Nastya", false, 7));

        ArrayList<Human> fatherparents = new ArrayList<Human>();
        fatherparents.add(new Human("Gena", true, 30, children));

        ArrayList<Human> motherparents = new ArrayList<>();
        motherparents.add(new Human("Luba", false, 31, children));

        Human ded1 = new Human("Pasha", true, 60, fatherparents);
        Human baba1 = new Human("Zhanna", false, 62, fatherparents);

        Human ded2 = new Human("Dima", true, 59, motherparents);
        Human baba2 = new Human("Dazdraperma", false, 61, motherparents);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        for (int i = 0; i < fatherparents.size(); i++) System.out.println(fatherparents.get(i));
        for (int i = 0; i < motherparents.size(); i++) System.out.println(motherparents.get(i));
        for (int i = 0; i < children.size(); i++) System.out.println(children.get(i));
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
