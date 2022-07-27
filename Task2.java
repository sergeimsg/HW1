package by.academy.les02.hw;

import static java.lang.Math.pow;

/*
 задание 8
 */
public class Task2 {
    public static void main(String[] args) {

        double b = 10;
        double a = 20;
        double c = 30;
        double temp;
        double fx;

        temp = Math.sqrt((pow(b, 2)) + 4 * a * c);
        if (temp != 0) {
            fx = (b + temp) / (2 * a) + (pow(a, 3)) * c + pow(b, -2);
            System.out.println("fx= " + fx);
        }


    }
}
