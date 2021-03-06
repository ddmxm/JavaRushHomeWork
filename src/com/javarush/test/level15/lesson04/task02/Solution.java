package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(2, (short) 3, "8");
        printMatrix((short) 2, 3, "8");
        printMatrix((short) 2, (short) 3, "8");
        printMatrix((short) 2, (long) 3, "8");
        printMatrix((long) 2, (long) 3, "8");
        printMatrix((byte) 2, (long) 3, "8");
        printMatrix((byte) 2, (byte) 3, "8");
    }

    public static void printMatrix(int m, short n, String value){//1
    }

    public static void printMatrix(short m, int n, String value){//2
    }

    public static void printMatrix(short m, short n, String value){//3
    }

    public static void printMatrix(long m, short n, String value){//4
    }

    public static void printMatrix(short m, long n, String value){//5
    }

    public static void printMatrix(long m, long n, String value){//6
    }

    public static void printMatrix(byte m, long n, String value){//7
    }

    public static void printMatrix(byte m, byte n, String value){//8
    }

    public static void printMatrix(int m, int n, String value) { //9
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) { //10
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }


}
