public class CombinedAlgorithm {
    public static void quickSort (int[] arry , int low , int high) {
        int pivotIndex=partition(arry,low,high);
        quickSort(arry,low,pivotIndex-1);
        quickSort(arry,pivotIndex+1,high);

    }
    public static int partition(int[] arry , int low , int high) {
        int pivot = arry[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if(arry[j]<=pivot) {
                i++;
                int temp = arry[i];
                arry[i] = arry[j];
                arry[j] = temp;

            }
        }
        int temp = arry[i+1];
        arry[i+1] = arry[high];
        arry[high] = temp;
        return i+1;

    }
}
