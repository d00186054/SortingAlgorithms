import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.ArrayList;

import java.util.Collections;

public class QuickSort {

    public int QuickSortHelper(int[] A, int lb, int ub) {
        int pivot = A[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            while (A[start] <= pivot & start < end) {
                start++;
            }
            while (A[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
            }
        }

        int temp = A[lb];
        A[lb] = A[end];
        A[end] = temp;

        return end;
    }


    public void QuickSort(int[] A, int lb, int ub) {

        if (lb < ub) {
            int loc = QuickSortHelper(A, lb, ub);

            QuickSort(A, lb, loc - 1);
            QuickSort(A, loc + 1, ub);
        }

    }

    public static void main(String[] args) {

        QuickSort qs = new QuickSort();
        int[] test = {2, 4, 8, 8, 8, 100, 100, 99, -44, 17, 10000};

        qs.QuickSort(test, 0, test.length - 1);

        for (int i : test) {
            System.out.print(i + ", ");
        }
    }


}
