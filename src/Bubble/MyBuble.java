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
        int[] array = new int[10000];

        for (int i = 0; i < array.length; i++) {
            array[i]=((int)(Math.random()*10000)-5000);        //заполняем массив рандомными значениями от -5000 до 5000
        }


        Date date = new Date();
        Date before = new Date();       // засекаем время

        for (int j = 0; j < array.length - 1; j++) {           //это для последующих итераций/
            for (int i = 1; i < array.length - j; i++) {        //это одна итерация/ самое большое число отправляется в
                if (array[i] < array[i - 1]) {                      //конец массива / длинна массива - j потому что самый большой
                    // элемент уже отправлен в конец массива
                    int buffer = array[i];
                    int buffer2 = array[i - 1];
                    array[i - 1] = buffer;
                    array[i] = buffer2;

                }
            }
        }

        Date after = new Date();
        double time = after.getTime() - before.getTime(); //время после сортировки

        System.out.println(Arrays.toString(array));
        System.out.println(time);
    }
}

// 10000 чисел / от 68 до 102/ намного быстрее глупой сортировки/
