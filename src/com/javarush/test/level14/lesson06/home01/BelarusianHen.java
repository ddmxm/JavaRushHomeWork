package com.javarush.test.level14.lesson06.home01;

public class BelarusianHen extends Hen
{
    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth()
    {
        return 22;
    }
}
