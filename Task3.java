package by.academy.les02.hw;
/*
  Задание 12
 */

import static java.lang.Math.pow;

public class Task3 {
    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 5;
        int x2 = 10;
        int y2 = 10;
        double lenth;
        lenth = Math.sqrt((pow((x2-x1),2)) + (pow((y2-y1),2)));
        System.out.println("lenth = " + lenth);
    }
}
