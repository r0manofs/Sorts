package Bubble;

import java.util.Arrays;
import java.util.Date;

public class StupidSort {
    public static void main(String[] args) {

        int[] a = new int[500];

        for (int i = 0; i < a.length; i++) {
            a[i]=((int)(Math.random()*500)-300);        //заполняем массив рандомными значениями от -300 до 300
        }

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
//  500 за 14.0