package Sorting;

import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int num[]) {
        int n = num.length;
        for (int turn = 0; turn < n - 1; turn++) {
            for (int j = 0; j < n - 1; j++) {
                if (num[j] > num[j + 1]) {
                    // swap
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void display(int num[]) {
        int n = num.length;
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num[] = { 2, 3, 1, 7, 5 };
        bubbleSort(num);
        display(num);
    }
}
