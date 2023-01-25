package SortType;

public class Sort {
    public static void stupidSort(int[] array) {
        printArray(array);

        for (int i = 1; i <= array.length - 1; ) {
            if (array[i] < array[i - 1]) {

                int buffer = array[i];
                int buffer2 = array[i - 1];
                array[i - 1] = buffer;
                array[i] = buffer2;
                i = 0;
            }
            i++;
            printArray(array);
        }
    }

    public static void bubbleSort(int[] array) {
        printArray(array);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
            printArray(array);
        }
    }

    public static void shakerSort(int[] array) {
        printArray(array);

        for (int j = 0; j < array.length - j; j++) {
            int buffer;
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {

                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
            for (int i = array.length - 1 - j; i > 1; i--) {

                if (array[i] < array[i - 1]) {
                    buffer = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buffer;
                }
            }
            printArray(array);
        }
    }

    public static void selectionSort(int[] array) {
        for (int step = 0; step < array.length; step++) {
            printArray(array);
            int index = min(array, step);        //step как раз и будет задавать смещение

            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }
    }

    public static int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0)
                System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.print("]" + "\n");
    }
}
