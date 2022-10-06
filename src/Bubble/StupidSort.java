package Bubble;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class StupidSort {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];

        for (int i = 0; i < a.length; i++) {        // вводим массив с клавиатуры
            a[i]=scanner.nextInt();
        }
         */

        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        Date date = new Date();
        Date before = new Date();

        for (int i = 1; i <= a.length - 1; ) {       //проходим массив
            if (a[i] < a[i - 1]) {                  // если встречаем пару элементов не по возрастани/

                int buffer = a[i];
                int buffer2 = a[i - 1];
                a[i - 1] = buffer;                  //то меняем их
                a[i] = buffer2;                     //местами
                i = 0;                              //начинаем цикл заново
            }
            i++;                                    //переходим к следующему элементу
        }
        Date after = new Date();

        double time = after.getTime() - before.getTime();

        System.out.println(Arrays.toString(a));         //выводим в консоль
        System.out.println(time);
    }
}
//  от 99 до 0 за 6.0