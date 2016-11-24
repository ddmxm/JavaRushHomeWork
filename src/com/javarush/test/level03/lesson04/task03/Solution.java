package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();

        zerg1.name="vas1";
        zerg2.name="vas2";
        zerg3.name="vas3";
        zerg4.name="vas4";
        zerg5.name="vas5";
        zerg6.name="vas6";
        zerg7.name="vas7";
        zerg8.name="vas8";
        zerg9.name="vas9";
        zerg10.name="vas10";

        Protos prot1= new Protos();
        Protos prot2= new Protos();
        Protos prot3= new Protos();
        Protos prot4= new Protos();
        Protos prot5= new Protos();

        prot1.name="van1";
        prot2.name="van2";
        prot3.name="van3";
        prot4.name="van4";
        prot5.name="van5";

        Terran terr1 = new Terran();
        Terran terr2 = new Terran();
        Terran terr3 = new Terran();
        Terran terr4 = new Terran();
        Terran terr5 = new Terran();
        Terran terr6 = new Terran();
        Terran terr7 = new Terran();
        Terran terr8 = new Terran();
        Terran terr9 = new Terran();
        Terran terr10 = new Terran();
        Terran terr11 = new Terran();
        Terran terr12 = new Terran();

        terr1.name="alex1";
        terr2.name="alex2";
        terr3.name="alex3";
        terr4.name="alex4";
        terr5.name="alex5";
        terr6.name="alex6";
        terr7.name="alex7";
        terr8.name="alex8";
        terr9.name="alex9";
        terr10.name="alex10";
        terr11.name="alex11";
        terr12.name="alex12";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}