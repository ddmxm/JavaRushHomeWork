package com.javarush.test.level15.lesson12.home05;

import java.util.Calendar;

public class SubSolution extends Solution
{
    public SubSolution(Object o1)
    {
        super(o1);
    }

    public SubSolution(String s1)
    {
        super(s1);
    }

    public SubSolution(Integer i1)
    {
        super(i1);
    }

    protected SubSolution(Short sh1)
    {
        super(sh1);
    }

    protected SubSolution(Number n1)
    {
        super(n1);
    }

    SubSolution(Calendar ca1)
    {
        super(ca1);
    }

    SubSolution(Byte b1)
    {
        super(b1);
    }

    SubSolution(Long l1)
    {
        super(l1);
    }

    protected SubSolution(Boolean b1)
    {
        super(b1);
    }

    private SubSolution(Character c1){super(c1);}
    private SubSolution(Double d1){super(d1);}
    private SubSolution(Float f1){super(f1);}
}
