package sort;

/**
 * Created by user on 16/3/16.
 */
public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len - i; j++) {
                if (array[j-1] > array[j]) {
                   int  temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int unsortedArray[] = new int[] {6, 5, 3, 1, 8, 7};
        bubbleSort(unsortedArray);
        for (int item : unsortedArray) {
            System.out.print(item + " ");
        }
    }
}
