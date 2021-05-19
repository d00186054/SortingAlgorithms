public class BubbleSort {

    public void bubbleSort(int[] A){

        boolean isSorted = false;
        int arrayLimit = A.length-1;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < arrayLimit; i++){
                if(A[i] > A[i+1]){
                    swap(A, i, i+1);
                    isSorted = false;
                }
            }
            arrayLimit--;
        }
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }


    public static void main(String[] args) {

        BubbleSort bs = new BubbleSort();
        int[] test = {2, 4, 8, 8, 8, 100, 100, 99, -44, 17, 10000};

        bs.bubbleSort(test);

        for (int i : test) {
            System.out.print(i + ", ");
        }
    }
}