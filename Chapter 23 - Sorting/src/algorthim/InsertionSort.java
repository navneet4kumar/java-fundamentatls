package algorthim;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {2, 9, 5, 4, 8, 1, 7, 6};
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSort(int[] list) {
        for(int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }

            list[k + 1] = currentElement;
        }
    }
}
