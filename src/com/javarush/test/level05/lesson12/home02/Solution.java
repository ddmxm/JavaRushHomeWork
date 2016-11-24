package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man roma = new Man("Roma", 40, "Syberia");
        Man sergei = new Man("Sergei", 25, "Cheboksary");

        Woman luba = new Woman("Luba", 40, "Moscow");
        Woman vika = new Woman("Vika", 23, "Moscow");

        //выведи их на экран тут
        System.out.println(sergei);
        System.out.println(roma);
        System.out.println(luba);
        System.out.println(vika);

    }

    //добавьте тут ваши классы
    public static class Man
    {
        String name = null;
        int age = 0;
        String address = null;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name.toString() + " " + age + " " + address.toString();
        }
    }

    public static class Woman
    {
        String name = null;
        int age = 0;
        String address = null;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name.toString() + " " + age + " " + address.toString();
        }
    }
}
