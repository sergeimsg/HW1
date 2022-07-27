package by.academy.les02.hw;

/*
  задание 38
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner nx = new Scanner(System.in);
        Scanner ny = new Scanner(System.in);
        System.out.println("¬ведите координаты точки дл€ проверки");
        int x = nx.nextInt();
        int y = ny.nextInt();
        boolean resA = false;
        boolean resB = false;
        boolean resC = false;

        if (((y<=x+4) && (-4<=x) && (x<=0)) || (y<=4-x) && (0<=x) && (x<=4)) {
            resA = true;
           System.out.println("resA = " + resA );
        }
        else {
            System.out.println("resA= " + resA);}

            if ((y>=-3) && (y<=4) && (x>=-4) && (x<=4)) {
                resB = true;
                System.out.println("resb=" + resB);
            }
            else {
                System.out.println( "resB=" + resB);
            }

            if ((y<=Math.sqrt(16-x*x) && x<=4) || ((y>=Math.sqrt(25-x*x)) && x<=5)) {
                resC = true;
            System.out.println("resC=" + resC);
        }
            else {
                System.out.println("falseC=" + resC);
            }

        }



    }
