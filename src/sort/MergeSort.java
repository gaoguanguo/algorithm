package sort;

import java.util.Arrays;

/**
 * Merge sort
 * 将两个有序数组归并成一个更大的有序数组，并将两个有序的数组
 * 归并到第三个数组中
 * Created by user on 16/3/16.
 */
public class MergeSort {

    public static void mergeSort(int[] nums, int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int i = low; //左指针
        int j = mid + 1; //右边指针
        int k = 0;

        //把较小的数先移动到新数组
        while (i <= mid && j <= high ) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        //把左边剩下的元素移入数组
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        //把右边剩下的元素移入数组
        while(j <= high) {
            temp[k++] = nums[j++];
        }

        //把新数组的值覆盖nums数组
        for (int k2=0; k2 < temp.length; k2++) {
            nums[k2+low] = temp[k2];
        }
    }

    public static void sort(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(nums, low, mid);
            sort(nums, mid+1 ,high);
            mergeSort(nums, low, mid, high);
        }
    }

    public static void main(String[] args){
        int[] nums = {2, 7, 8, 3, 1, 6, 9, 0, 4, 5};
        MergeSort.sort(nums, 0 , nums.length -1);
        System.out.println(Arrays.toString(nums));
    }

}
