package SortType;

public class Sort {
    public static void stupidSort(int[] array) {
        printArray(array);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; ) {
                printArray(array);
                if (array[i] > array[i + 1]) {
                    swap(array,i,i+1);
                    isSorted = false;
                    i -= i;
                }
                i++;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        printArray(array);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array,i,i-1);
                    isSorted = false;
                }
            }
            printArray(array);
        }
    }

    public static void shakerSort(int[] array) {
        printArray(array);

        for (int j = 0; j < array.length - j; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
            for (int i = array.length - 1 - j; i > 1; i--) {

                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                }
            }
            printArray(array);
        }
    }

    public static void selectionSort(int[] array) {
        for (int step = 0; step < array.length; step++) {
            printArray(array);
            int index = min(array, step);        //step как раз и будет задавать смещение

            swap(array, step, index);
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

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
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
