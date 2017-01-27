package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

import java.util.Calendar;

public class Solution {
    public Solution(Object o1){}
    public Solution(String s1){}
    public Solution(Integer i1){}

    private Solution(Character c1){}
    private Solution(Double d1){}
    private Solution(Float f1){}

    protected Solution(Short sh1){}
    protected Solution(Number n1){}
    protected Solution(Boolean b1){}

    Solution(Calendar ca1){}
    Solution(Byte b1){}
    Solution(Long l1){}


}

