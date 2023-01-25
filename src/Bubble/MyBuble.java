package Bubble;

public class MyBuble {
    public static void main(String[] args) {
        int[] array = new int[]{9, 7, 6, 8, 0, 2, 4, 5, 3, 1};

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

