package Bubble;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MyBuble {

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
        Date before = new Date();       // засекаем время

        for (int j = 0; j < a.length - 1; j++) {           //это для последующих итераций/
            for (int i = 1; i < a.length - j; i++) {        //это одна итерация/ самое большое число отправляется в
                if (a[i] < a[i - 1]) {                      //конец массива / длинна массива - j потому что самый большой
                    // элемент уже отправлен в конец массива
                    int buffer = a[i];
                    int buffer2 = a[i - 1];
                    a[i - 1] = buffer;
                    a[i] = buffer2;

                }
            }
        }

        Date after = new Date();
        double time = after.getTime() - before.getTime(); //время после сортировки

        System.out.println(Arrays.toString(a));
        System.out.println(time);
    }
}

// от 99 до 0 за 1.0 / в 6 раз быстрее глупой сортировки
