import java.util.ArrayList;
import java.util.Collections;

public class MergeSort {


    public void mergeSort(int[] A, int lb, int ub) {

        if(lb < ub){
            int mid = (lb+ub)/2;
            mergeSort(A, lb, mid);
            mergeSort(A, mid+1, ub);
            merge(A, lb, mid, ub);
        }
    }

    public void merge(int[] A, int lb, int mid, int ub) {
        int i = lb;
        int j = mid+1;
        int k = lb;
        int[] B = new int[A.length];

        while(i <= mid && j <= ub){
            if(A[i] <= A[j]){
                B[k++] = A[i++];
            }else {
                B[k++] = A[j++];
            }
        }
        while (i <= mid){
            B[k++] = A[i++];
        }
        while (j <= ub){
            B[k++] = A[j++];
        }

        for(k = lb; k <= ub; k++){
            A[k] = B[k];
        }

    }


    public static void main(String[] args) {

        MergeSort qs = new MergeSort();
        int[] test = {18,73,59,89,84,84,48,84,54,62,67,27,14,60,0,61,94,84,55,55,60,76,35,84,28,4,9,86,12,89,41,21,65,53,33};
        qs.mergeSort(test, 0, test.length - 1);

        for (int i : test) {
            System.out.print(i + ", ");
        }

        System.out.println(", ");
        int[] test2 = {54,21,73,84,60,18,62,59,89,89,41,55,27,65,94,61,12,76,35,48,0,60,84,9,28,55,4,67,86,33};
        qs.mergeSort(test2, 0, test2.length - 1);

        for (int i : test2) {
            System.out.print(i + ", ");
        }
    }

}


