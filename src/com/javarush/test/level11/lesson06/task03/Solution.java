package com.javarush.test.level11.lesson06.task03;

/* В гостях у бабушки
Написать шесть классов: Animal (животное), Cow(корова) и Pig(свинья), Sheep(овца), Bull(бык), Goat(козел).
Унаследовать корову, свинью, овцу, быка и козла от животного.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Animal
    {
        String name;
        int weight;
        int heght;
        int taillength;

    }

    public class Cow extends Animal
    {
        boolean horns;
        int milkDayCount;
        void cowMooo(){
            System.out.println("Mooo!");
        }
    }

    public class Pig extends Animal
    {
        void pigGrunts(){
            System.out.println("Hryu!");
        }
    }

    public class Sheep extends Animal
    {
        int woolQuantity;
        void sheepSound(){
            System.out.println("Beee!!!");
        }

    }

    public class Bull extends Animal
    {
        boolean horns;
        void bullMooo(){
            System.out.println("Mooooooo!!!!");
        }
    }

    public class Goat extends Animal
    {
        void sheepSound()
        {
            System.out.println("Beee!!!");
        }
    }

}
