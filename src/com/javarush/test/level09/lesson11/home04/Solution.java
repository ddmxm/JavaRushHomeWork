package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date = format.parse(reader.readLine());

        SimpleDateFormat format1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        //Date date2 = format1.parse(date1.toString());
        System.out.println(format1.format(date).toUpperCase());

    }
}
